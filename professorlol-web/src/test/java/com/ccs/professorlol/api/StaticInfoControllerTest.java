package com.ccs.professorlol.api;

import com.ccs.professorlol.dto.lolinfo.LolInfoResDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoSaveDto;
import com.ccs.professorlol.dto.lolinfo.LolInfoUpdateDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionResDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionSaveDto;
import com.ccs.professorlol.dto.lolinfo.champion.ChampionUpdateDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatResDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatSaveDto;
import com.ccs.professorlol.dto.lolinfo.stat.StatUpdateDto;
import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.LolInfoRepository;
import com.ccs.professorlol.lolInfo.champion.Champion;
import com.ccs.professorlol.lolInfo.champion.Stat;
import com.ccs.professorlol.lolInfo.champion.StatRepository;
import com.ccs.professorlol.lolInfo.champion.repository.ChampionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ActiveProfiles("test")
@SpringBootTest
@ExtendWith(SpringExtension.class)
class StaticInfoControllerTest {

    private static final String API_V_1_STATIC = "/api/v1/static";
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private LolInfoRepository lolInfoRepository;

    @Autowired
    private ChampionRepository championRepository;

    @Autowired
    private StatRepository statRepository;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
                .build();
    }

    @AfterEach
    void tearDown() {
        statRepository.deleteAll();
        lolInfoRepository.deleteAll();
        championRepository.deleteAll();
    }

    @DisplayName("롤 버전 정보 저장하기")
    @Test
    void saveLolInfo() throws Exception {
        String version = "9.22.1";

        LolInfoSaveDto lolInfoSaveDto = LolInfoSaveDto.builder()
                .patchNoteVersion(version)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String request = mapper.writeValueAsString(lolInfoSaveDto);

        MvcResult mvcResult = mockMvc.perform(post(API_V_1_STATIC + "/version")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request)
                .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isCreated())
                .andReturn();

        LolInfoResDto lolInfoResDto = mapper.readValue(mvcResult.getResponse().getContentAsString(), LolInfoResDto.class);
        assertThat(lolInfoResDto.getPatchNoteVersion()).isEqualTo(version);
    }

    @DisplayName("롤 버전 업데이트")
    @Test
    void updateLolInfo() throws Exception {
        String savedVersion = "9.22.1";
        String changeVersion = "9.22.2";

        LolInfo lolInfo = LolInfo.builder()
                .patchNoteVersion(savedVersion)
                .build();
        lolInfoRepository.saveAndFlush(lolInfo);

        LolInfoUpdateDto lolInfoUpdateDto = LolInfoUpdateDto.builder()
                .savedPatchVersion(savedVersion)
                .changePatchVersion(changeVersion)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String request = mapper.writeValueAsString(lolInfoUpdateDto);

        MvcResult mvcResult = mockMvc.perform(put(API_V_1_STATIC + "/version")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request)
                .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        LolInfoResDto lolInfoResDto = mapper.readValue(mvcResult.getResponse().getContentAsString(), LolInfoResDto.class);
        assertThat(lolInfoResDto.getPatchNoteVersion()).isEqualTo(changeVersion);
    }

    @DisplayName("스탯 정보 저장하기")
    @Test
    void saveStat() throws Exception {
        LolInfo lolInfo = LolInfo.builder()
                .patchNoteVersion("9.22.1")
                .build();
        lolInfo = lolInfoRepository.saveAndFlush(lolInfo);

        Champion champion = Champion.builder()
                .name("Ahri")
                .build();
        champion = championRepository.saveAndFlush(champion);

        StatSaveDto statSaveDto = StatSaveDto.builder()
                .lolInfoId(lolInfo.getId())
                .championId(champion.getId())
                .hp(10)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String request = mapper.writeValueAsString(statSaveDto);

        mockMvc.perform(post(API_V_1_STATIC + "/stat")
                .content(request)
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andExpect(status().isCreated())
                .andReturn();
    }

    @DisplayName("스탯 업데이트")
    @Test
    void updateStat() throws Exception {
        LolInfo lolInfo = LolInfo.builder()
                .patchNoteVersion("9.22.1")
                .build();
        lolInfo = lolInfoRepository.saveAndFlush(lolInfo);

        Stat stat = Stat.builder()
                .hp(10)
                .lolInfo(lolInfo)
                .build();

        Champion champion = Champion.builder()
                .build();

        champion.addStat(stat);
        championRepository.saveAndFlush(champion);

        StatUpdateDto statUpdateDto = StatUpdateDto.builder()
                .id(stat.getId())
                .hp(11)
                .lolInfoVersion(lolInfo.getPatchNoteVersion())
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String request = mapper.writeValueAsString(statUpdateDto);

        MvcResult mvcResult = mockMvc.perform(put(API_V_1_STATIC + "/stat")
                .characterEncoding("UTF-8")
                .content(request)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        StatResDto statResDto = mapper.readValue(mvcResult.getResponse().getContentAsString(), StatResDto.class);

        assertThat(statResDto.getHp()).isEqualTo(11);
    }

    @Test
    void saveChampion() throws Exception {
        String key = "109";
        ChampionSaveDto championSaveDto = ChampionSaveDto.builder()
                .key(key)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String request = mapper.writeValueAsString(championSaveDto);

        mockMvc.perform(post(API_V_1_STATIC + "/champion")
                .contentType(MediaType.APPLICATION_JSON)
                .content(request)
                .characterEncoding("UTF-8"))
                .andExpect(status().isCreated())
                .andReturn();
    }

    @Test
    void updateChampion() throws Exception {
        String savedKey = "109";
        String changeKey = "110";

        Champion champion = Champion.builder()
                .key(savedKey)
                .build();
        champion = championRepository.saveAndFlush(champion);

        ChampionUpdateDto championUpdateDto = ChampionUpdateDto.builder()
                .id(champion.getId())
                .key(changeKey)
                .build();

        ObjectMapper mapper = new ObjectMapper();
        String request = mapper.writeValueAsString(championUpdateDto);

        MvcResult mvcResult = mockMvc.perform(put(API_V_1_STATIC + "/champion")
                .content(request)
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andExpect(status().isOk())
                .andReturn();

        ChampionResDto championResDto = mapper.readValue(mvcResult.getResponse().getContentAsString(), ChampionResDto.class);

        assertThat(championResDto.getKey()).isEqualTo(changeKey);
    }
}