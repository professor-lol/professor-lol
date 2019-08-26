package com.css.professorlol.match.impl;

import com.css.professorlol.config.exception.ServerException;
import com.css.professorlol.match.MatchRestTemplate;
import com.css.professorlol.match.dto.match.MatchDto;
import com.css.professorlol.match.dto.matchList.MatchQueryParam;
import com.css.professorlol.match.dto.matchList.MatchlistDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParser;
import lombok.extern.slf4j.Slf4j;

import javax.validation.constraints.NotBlank;

@Slf4j
public class MatchRestTemplateStubImpl implements MatchRestTemplate {

    public MatchRestTemplateStubImpl() {
        log.info("Stub MatchRestTemplate created.");
    }

    @Override
    public MatchlistDto getMatchList(@NotBlank final String encryptedAccountId, MatchQueryParam queryParam) {
        try {
            return new ObjectMapper().readValue(getMatchListStubBody(), MatchlistDto.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public MatchDto getMatch(Long matchId) {
        try {
            return new ObjectMapper().readValue(getMatchStubBody(), MatchDto.class);
        } catch (Exception e) {
            throw new ServerException("Stub Error.");
        }
    }

    private String getMatchListStubBody() {
        return new JsonParser().parse("" +
                "{\n" +
                "    \"matches\": [\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3822675440,\n" +
                "            \"champion\": 222,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566453404650,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3822700720,\n" +
                "            \"champion\": 412,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566451370949,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3822592922,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566446784376,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3822602147,\n" +
                "            \"champion\": 17,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566446314106,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3822549423,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566444595092,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3822536840,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566442616419,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3820546304,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566306362099,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3820452945,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566303657251,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3820371911,\n" +
                "            \"champion\": 67,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566301144227,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3820361324,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566299051301,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3819959210,\n" +
                "            \"champion\": 222,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566283239602,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3819934753,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566281342140,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3819960801,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566279557666,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3818679807,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566206948476,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3818635141,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566205307548,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3818275049,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566179306964,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3818263240,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566177325191,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3818261346,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566175315568,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3818228924,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1566173453689,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3814059502,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565990473918,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3814037735,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565988146966,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3814035725,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565986052162,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3805398558,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565595885996,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3805379039,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565593690533,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"JUNGLE\",\n" +
                "            \"gameId\": 3805343704,\n" +
                "            \"champion\": 28,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565591720565,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"NONE\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"JUNGLE\",\n" +
                "            \"gameId\": 3805305787,\n" +
                "            \"champion\": 64,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565589711812,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"NONE\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3805301635,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565588451044,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3804334455,\n" +
                "            \"champion\": 81,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565532435185,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3804280397,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565530001182,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3804128856,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565527611190,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3795849554,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565151274354,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3795862564,\n" +
                "            \"champion\": 81,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565148625192,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3795828504,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565146822073,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3795834066,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1565144780366,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3791780503,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564941944678,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3791745805,\n" +
                "            \"champion\": 67,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564940162954,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3790445725,\n" +
                "            \"champion\": 12,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564905593903,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3790414578,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564903712777,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3790344683,\n" +
                "            \"champion\": 67,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564901772480,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3790293464,\n" +
                "            \"champion\": 81,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564899580534,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3790233275,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564897373261,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3790165830,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564895678447,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"MID\",\n" +
                "            \"gameId\": 3790129151,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564894057926,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3790103485,\n" +
                "            \"champion\": 89,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564892309691,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3790046767,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564890091115,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3787987863,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564797415199,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3788013476,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564795314763,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3784127366,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564589284112,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3784131270,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564587649152,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3782724764,\n" +
                "            \"champion\": 81,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564539897159,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3782710405,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564537475330,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3782409655,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564536965551,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3781163352,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1564477573662,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3768592502,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1563872963410,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3768265778,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1563866239496,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3767465533,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1563810141151,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3756222011,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1563332201381,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3749962239,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1563017512795,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3737804742,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562411692431,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3734529721,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562260764583,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3734524541,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562258825246,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"MID\",\n" +
                "            \"gameId\": 3734510280,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562257235601,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3734423896,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562255076343,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3734361972,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562252159062,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3730822043,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562074595356,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3730770264,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1562072263743,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3725077500,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561799579620,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"MID\",\n" +
                "            \"gameId\": 3721550045,\n" +
                "            \"champion\": 15,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561574701759,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"MID\",\n" +
                "            \"gameId\": 3719032853,\n" +
                "            \"champion\": 15,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561394351729,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3718977216,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561391855895,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3718971997,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561389895067,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3718943736,\n" +
                "            \"champion\": 89,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561387692257,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3718819698,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561385823744,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3718716278,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561382242896,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3717830729,\n" +
                "            \"champion\": 15,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561309822674,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3717766204,\n" +
                "            \"champion\": 67,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561307426859,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3717751828,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561305446046,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3717706606,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561303717405,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3716704419,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561271628412,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3716645418,\n" +
                "            \"champion\": 420,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561269075106,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3716578174,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561266674695,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3716591510,\n" +
                "            \"champion\": 15,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561264659533,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"MID\",\n" +
                "            \"gameId\": 3714032168,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561115881138,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3713806527,\n" +
                "            \"champion\": 15,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561113705077,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3713449706,\n" +
                "            \"champion\": 81,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561086975306,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3713466900,\n" +
                "            \"champion\": 555,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561084986134,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3713446238,\n" +
                "            \"champion\": 81,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561083406150,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3713482684,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561080169235,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3713432602,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561077970143,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3713451234,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561076123542,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"MID\",\n" +
                "            \"gameId\": 3712846224,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561026244014,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3712851050,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561024460867,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"NONE\",\n" +
                "            \"gameId\": 3712797193,\n" +
                "            \"champion\": 43,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1561023149832,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3707090449,\n" +
                "            \"champion\": 145,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1560610777687,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3707060816,\n" +
                "            \"champion\": 51,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1560608885465,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"JUNGLE\",\n" +
                "            \"gameId\": 3697911328,\n" +
                "            \"champion\": 8,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1560012332658,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"NONE\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3692663745,\n" +
                "            \"champion\": 412,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1559755959814,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3692566874,\n" +
                "            \"champion\": 81,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1559753692368,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"DUO_CARRY\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"TOP\",\n" +
                "            \"gameId\": 3692508374,\n" +
                "            \"champion\": 122,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1559751470271,\n" +
                "            \"queue\": 440,\n" +
                "            \"role\": \"SOLO\",\n" +
                "            \"season\": 13\n" +
                "        },\n" +
                "        {\n" +
                "            \"lane\": \"BOTTOM\",\n" +
                "            \"gameId\": 3692453404,\n" +
                "            \"champion\": 25,\n" +
                "            \"platformId\": \"KR\",\n" +
                "            \"timestamp\": 1559748198475,\n" +
                "            \"queue\": 420,\n" +
                "            \"role\": \"DUO_SUPPORT\",\n" +
                "            \"season\": 13\n" +
                "        }\n" +
                "    ],\n" +
                "    \"endIndex\": 100,\n" +
                "    \"startIndex\": 0,\n" +
                "    \"totalGames\": 734\n" +
                "}\n").toString();
    }

    private String getMatchStubBody() {
        return new JsonParser().parse(
                "{\n" +
                        "  \"seasonId\": 13,\n" +
                        "  \"queueId\": 420,\n" +
                        "  \"gameId\": 3822675440,\n" +
                        "  \"participantIdentities\": [\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"다리우스꽝\",\n" +
                        "        \"currentAccountId\": \"6STDKvS9UjqRq_u54_3kigPfRAL_z9ClJNr-aA0r4RcW4ceRDZNEJTFw\",\n" +
                        "        \"summonerId\": \"h105m4wLKwZbpIJI4bfcc2bgsVOL16lxl3vTZQ2xCO-g2D0\",\n" +
                        "        \"accountId\": \"6STDKvS9UjqRq_u54_3kigPfRAL_z9ClJNr-aA0r4RcW4ceRDZNEJTFw\"\n" +
                        "      },\n" +
                        "      \"participantId\": 1\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"가물칭\",\n" +
                        "        \"currentAccountId\": \"nMhMWfQhhbvncVt9RyGjjnywv9wpcqsHCDgOiK52KHQ\",\n" +
                        "        \"summonerId\": \"9N-ziT3_0gJOm8WuSUvcaRCdt1fy0y0HT5MTBoV8bJ-hjQ\",\n" +
                        "        \"accountId\": \"nMhMWfQhhbvncVt9RyGjjnywv9wpcqsHCDgOiK52KHQ\"\n" +
                        "      },\n" +
                        "      \"participantId\": 2\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"흑 9\",\n" +
                        "        \"currentAccountId\": \"5z9k7tGAzC1DEd9ss-gPVVsXYOdPslmUM5atIEmAQmkS\",\n" +
                        "        \"summonerId\": \"Io3j2RpO4lMhKd3o_ScK_qnq8vvtNAAcjsMbggGti67ukA\",\n" +
                        "        \"accountId\": \"5z9k7tGAzC1DEd9ss-gPVVsXYOdPslmUM5atIEmAQmkS\"\n" +
                        "      },\n" +
                        "      \"participantId\": 3\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"충북대한요한\",\n" +
                        "        \"currentAccountId\": \"e6nEaXb1EcJOQ-klh473ez7NVOWOj-czW2sNQopkLgvd\",\n" +
                        "        \"summonerId\": \"bR-apoA8jw6JlDHf7YbajqG3qDVpGtX80N5KlQcvuiPz6wU\",\n" +
                        "        \"accountId\": \"e6nEaXb1EcJOQ-klh473ez7NVOWOj-czW2sNQopkLgvd\"\n" +
                        "      },\n" +
                        "      \"participantId\": 4\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"LOVESJH\",\n" +
                        "        \"currentAccountId\": \"5U0wCuVx6iCTC2ZfEv2O4Rt5nJhpLoW69lzcgY1KC5hT\",\n" +
                        "        \"summonerId\": \"i1PMtaYAhiJj7Ha_-ZqGaIF1EaY7ArXAcipWeiHZ0HKjUw\",\n" +
                        "        \"accountId\": \"5U0wCuVx6iCTC2ZfEv2O4Rt5nJhpLoW69lzcgY1KC5hT\"\n" +
                        "      },\n" +
                        "      \"participantId\": 5\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"라면and김치\",\n" +
                        "        \"currentAccountId\": \"4M3Ot9weAlqLf7wysBkQTylfHtXghvn_y9Rod8A1guJz\",\n" +
                        "        \"summonerId\": \"fouR9X58xVInxU6pfCyOPky53WK-yb1hy1Sg_IUjeVb22w\",\n" +
                        "        \"accountId\": \"4M3Ot9weAlqLf7wysBkQTylfHtXghvn_y9Rod8A1guJz\"\n" +
                        "      },\n" +
                        "      \"participantId\": 6\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"xiao tuzi\",\n" +
                        "        \"currentAccountId\": \"-DYzsJZFwwyVNSGs5O8O8AhfnheRb14tOGOymV167I1o_X1RMcVPXg_b\",\n" +
                        "        \"summonerId\": \"_R4OSd1j4cs6hAZ3EgOWLBqMCJHnp8HAAXt5e08i4mRzBSI\",\n" +
                        "        \"accountId\": \"-DYzsJZFwwyVNSGs5O8O8AhfnheRb14tOGOymV167I1o_X1RMcVPXg_b\"\n" +
                        "      },\n" +
                        "      \"participantId\": 7\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"젖탱이파티손명욱\",\n" +
                        "        \"currentAccountId\": \"JnJmltkOrPQDXBEtOP0GkHe5SsRj3RXc87zyjjX0qhmE\",\n" +
                        "        \"summonerId\": \"8PnfURU7X0D9QDePk86TBZDjVZyplQy-fwv7nkJgfr5k46o\",\n" +
                        "        \"accountId\": \"JnJmltkOrPQDXBEtOP0GkHe5SsRj3RXc87zyjjX0qhmE\"\n" +
                        "      },\n" +
                        "      \"participantId\": 8\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"랭전용케\",\n" +
                        "        \"currentAccountId\": \"0SYQ9ArmP8iH3yMo-v6NJz1-xbR3FmyYMdtEc0Sog-zwltY\",\n" +
                        "        \"summonerId\": \"ujoMoTK2QkyBU7__WYIUH9mGYt-ae2uTQ0u201IFzBUsXh8\",\n" +
                        "        \"accountId\": \"0SYQ9ArmP8iH3yMo-v6NJz1-xbR3FmyYMdtEc0Sog-zwltY\"\n" +
                        "      },\n" +
                        "      \"participantId\": 9\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"player\": {\n" +
                        "        \"summonerName\": \"뱅기현\",\n" +
                        "        \"currentAccountId\": \"ZCKKNXiQCxnU6iZItHeoPu8skeTkf2LMZjd8_SxXIBqY\",\n" +
                        "        \"summonerId\": \"wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg\",\n" +
                        "        \"accountId\": \"ZCKKNXiQCxnU6iZItHeoPu8skeTkf2LMZjd8_SxXIBqY\"\n" +
                        "      },\n" +
                        "      \"participantId\": 10\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"participants\": [\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": true\n" +
                        "      },\n" +
                        "      \"participantId\": 1,\n" +
                        "      \"teamId\": 100,\n" +
                        "      \"championId\": 24\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": true\n" +
                        "      },\n" +
                        "      \"participantId\": 2,\n" +
                        "      \"teamId\": 100,\n" +
                        "      \"championId\": 105\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": true\n" +
                        "      },\n" +
                        "      \"participantId\": 3,\n" +
                        "      \"teamId\": 100,\n" +
                        "      \"championId\": 236\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": true\n" +
                        "      },\n" +
                        "      \"participantId\": 4,\n" +
                        "      \"teamId\": 100,\n" +
                        "      \"championId\": 98\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": true\n" +
                        "      },\n" +
                        "      \"participantId\": 5,\n" +
                        "      \"teamId\": 100,\n" +
                        "      \"championId\": 555\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": false\n" +
                        "      },\n" +
                        "      \"participantId\": 6,\n" +
                        "      \"teamId\": 200,\n" +
                        "      \"championId\": 54\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": false\n" +
                        "      },\n" +
                        "      \"participantId\": 7,\n" +
                        "      \"teamId\": 200,\n" +
                        "      \"championId\": 150\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": false\n" +
                        "      },\n" +
                        "      \"participantId\": 8,\n" +
                        "      \"teamId\": 200,\n" +
                        "      \"championId\": 11\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": false\n" +
                        "      },\n" +
                        "      \"participantId\": 9,\n" +
                        "      \"teamId\": 200,\n" +
                        "      \"championId\": 25\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"stats\": {\n" +
                        "        \"win\": false\n" +
                        "      },\n" +
                        "      \"participantId\": 10,\n" +
                        "      \"teamId\": 200,\n" +
                        "      \"championId\": 222\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}").toString();
    }
}