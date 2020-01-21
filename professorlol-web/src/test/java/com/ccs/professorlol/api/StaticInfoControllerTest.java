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
import com.fasterxml.jackson.core.type.TypeReference;
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

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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

    @DisplayName("롤 전체 버전 정보 가져오기")
    @Test
    void findAllLolInfo() throws Exception {
        //given
        lolInfoRepository.saveAll(makeLolInfo(10));

        //when
        MvcResult mvcResult = mockMvc.perform(get(API_V_1_STATIC + "/version")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        ObjectMapper objectMapper = new ObjectMapper();
        List<LolInfoResDto> lolInfoResDtos = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), new TypeReference<List<LolInfoResDto>>() {
        });

        //then
        assertThat(lolInfoResDtos.size()).isEqualTo(10);
    }

    @DisplayName("롤 특정 버전 정보 가져오기")
    @Test
    void testFindLolInfo() throws Exception {
        //given
        String targetVersion = "1.1.1";
        lolInfoRepository.saveAndFlush(new LolInfo(targetVersion));

        //when
        MvcResult mvcResult = mockMvc.perform(get(API_V_1_STATIC + "/version/{version}", targetVersion)
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        ObjectMapper objectMapper = new ObjectMapper();
        LolInfoResDto answer = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), LolInfoResDto.class);

        //then
        assertThat(answer.getPatchNoteVersion()).isEqualTo(targetVersion);
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

    @DisplayName("스탯 ID로 스탯 정보 가져오기")
    @Test
    void findStat() throws Exception {
        //given
        LolInfo lolInfo = lolInfoRepository.saveAndFlush(new LolInfo("1"));
        Stat stat = Stat.builder()
                .lolInfo(lolInfo)
                .build();

        Stat savedStat = statRepository.saveAndFlush(stat);
        Long targetId = savedStat.getId();

        //when
        MvcResult mvcResult = mockMvc.perform(get(API_V_1_STATIC + "/stat/{id}", targetId)
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

        ObjectMapper objectMapper = new ObjectMapper();
        StatResDto answer = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), StatResDto.class);

        //then
        assertThat(answer.getId()).isEqualTo(targetId);
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

    @DisplayName("챔피언 저장하기")
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

    @DisplayName("챔피언 정보 수정하기")
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

    @DisplayName("모든 챔피언 정보 가져오기")
    @Test
    void findAllChampion() throws Exception {
        //given
        LolInfo lolInfo = lolInfoRepository.save(new LolInfo("1"));
        lolInfoRepository.flush();
        List<Champion> champions = makeChampions(2, lolInfo);

        championRepository.saveAll(champions);
        championRepository.flush();

        //when
        MvcResult mvcResult = mockMvc.perform(get(API_V_1_STATIC + "/champion")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andExpect(status().isOk())
                .andReturn();

        ObjectMapper objectMapper = new ObjectMapper();

        List<ChampionResDto> championResDtos = objectMapper.readValue(mvcResult.getResponse().getContentAsString(),
                new TypeReference<List<ChampionResDto>>() {
                });

        //then
        assertThat(championResDtos.size()).isEqualTo(2);
    }

    @DisplayName("특정 챔피언 id로 찾기")
    @Test
    void findLolInfo() throws Exception {
        //given
        LolInfo lolInfo = lolInfoRepository.save(new LolInfo("1"));
        lolInfoRepository.flush();

        List<Champion> champions = makeChampions(10, lolInfo);

        List<Champion> savedAllChampion = championRepository.saveAll(champions);
        Long targetId = savedAllChampion.get(0).getId();
        championRepository.flush();

        //when
        MvcResult mvcResult = mockMvc.perform(get(API_V_1_STATIC + "/champion/{id}", targetId)
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8"))
                .andExpect(status().isOk())
                .andReturn();

        ObjectMapper mapper = new ObjectMapper();

        ChampionResDto findChampion = mapper.readValue(mvcResult.getResponse().getContentAsString(), ChampionResDto.class);

        //then
        assertThat(findChampion.getId()).isEqualTo(targetId);
    }

    // 롤 버전 저장 서포트 함수
    private List<LolInfo> makeLolInfo(int amount) {
        List<LolInfo> lolInfos = new ArrayList<>();
        for (int i = 1; i <= amount; i++) {
            lolInfos.add(new LolInfo(i + ".0"));
        }
        return lolInfos;
    }

    // 챔피언 저장 서포트 함수

    private List<Champion> makeChampions(int amount, LolInfo lolInfo) {
        List<Champion> champions = new ArrayList<>();
        for (int i = 1; i <= amount; i++) {
            Champion champion = Champion.builder()
                    .key(String.valueOf(i))
                    .build();
            Stat stat = Stat.builder()
                    .lolInfo(lolInfo)
                    .build();
            champion.addStat(stat);
            champions.add(champion);
        }
        return champions;
    }
}