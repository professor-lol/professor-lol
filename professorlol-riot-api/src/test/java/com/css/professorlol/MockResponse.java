package com.css.professorlol;

import com.google.gson.JsonParser;
import org.springframework.http.HttpStatus;

public class MockResponse {

    public static String getExceptionResponseBody(String message, HttpStatus status) {
        return new JsonParser().parse("{\n" +
                "    \"status\": {\n" +
                "        \"status_code\": " + status.value() + ",\n" +
                "        \"message\": \"" + message + "\"\n" +
                "    }\n" +
                "}").toString();
    }

    public static String getSummonerMockBody() {
        return new JsonParser().parse(
                "{\n" +
                        "    \"profileIconId\": 3460,\n" +
                        "    \"name\": \"뱅기현\",\n" +
                        "    \"puuid\": \"bFS_eddekovrchWduGsx9vXUs0WkU5jQ5mZeI7WNZ_pg-dXdGOSHKVaHu0twY2mKS6Dv3fIGcW353A\",\n" +
                        "    \"summonerLevel\": 124,\n" +
                        "    \"accountId\": \"ZCKKNXiQCxnU6iZItHeoPu8skeTkf2LMZjd8_SxXIBqY\",\n" +
                        "    \"id\": \"wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg\",\n" +
                        "    \"revisionDate\": 1566430195000\n" +
                        "}"
        ).toString();
    }

    public static String getLeagueMockBody() {
        return new JsonParser().parse("[\n" +
                "    {\n" +
                "        \"queueType\": \"RANKED_SOLO_5x5\",\n" +
                "        \"summonerName\": \"뱅기현\",\n" +
                "        \"hotStreak\": false,\n" +
                "        \"wins\": 66,\n" +
                "        \"veteran\": false,\n" +
                "        \"losses\": 69,\n" +
                "        \"rank\": \"III\",\n" +
                "        \"tier\": \"GOLD\",\n" +
                "        \"inactive\": false,\n" +
                "        \"freshBlood\": false,\n" +
                "        \"leagueId\": \"6e725740-2851-11e9-96cb-c81f66e3887d\",\n" +
                "        \"summonerId\": \"wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg\",\n" +
                "        \"leaguePoints\": 34\n" +
                "    },\n" +
                "    {\n" +
                "        \"queueType\": \"RANKED_FLEX_SR\",\n" +
                "        \"summonerName\": \"뱅기현\",\n" +
                "        \"hotStreak\": true,\n" +
                "        \"wins\": 30,\n" +
                "        \"veteran\": false,\n" +
                "        \"losses\": 25,\n" +
                "        \"rank\": \"I\",\n" +
                "        \"tier\": \"SILVER\",\n" +
                "        \"inactive\": false,\n" +
                "        \"freshBlood\": false,\n" +
                "        \"leagueId\": \"277294d0-20b9-11e9-9366-c81f66e3887d\",\n" +
                "        \"summonerId\": \"wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg\",\n" +
                "        \"leaguePoints\": 27\n" +
                "    }\n" +
                "]").getAsJsonArray()
                .toString();
    }

    public static String getMatchListMockBody() {
        return new JsonParser().parse(
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
                        "}").toString();
    }

    public static String getMatchMockBody() {
        return new JsonParser().parse(
                "{\n" +
                        "    \"seasonId\": 13,\n" +
                        "    \"queueId\": 420,\n" +
                        "    \"gameId\": 3822675440,\n" +
                        "    \"participantIdentities\": [\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"다리우스꽝\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/1984888306855360\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"6STDKvS9UjqRq_u54_3kigPfRAL_z9ClJNr-aA0r4RcW4ceRDZNEJTFw\",\n" +
                        "                \"profileIcon\": 3546,\n" +
                        "                \"summonerId\": \"h105m4wLKwZbpIJI4bfcc2bgsVOL16lxl3vTZQ2xCO-g2D0\",\n" +
                        "                \"accountId\": \"6STDKvS9UjqRq_u54_3kigPfRAL_z9ClJNr-aA0r4RcW4ceRDZNEJTFw\"\n" +
                        "            },\n" +
                        "            \"participantId\": 1\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"가물칭\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/879658\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"nMhMWfQhhbvncVt9RyGjjnywv9wpcqsHCDgOiK52KHQ\",\n" +
                        "                \"profileIcon\": 4270,\n" +
                        "                \"summonerId\": \"9N-ziT3_0gJOm8WuSUvcaRCdt1fy0y0HT5MTBoV8bJ-hjQ\",\n" +
                        "                \"accountId\": \"nMhMWfQhhbvncVt9RyGjjnywv9wpcqsHCDgOiK52KHQ\"\n" +
                        "            },\n" +
                        "            \"participantId\": 2\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"흑 9\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/2540713\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"5z9k7tGAzC1DEd9ss-gPVVsXYOdPslmUM5atIEmAQmkS\",\n" +
                        "                \"profileIcon\": 3595,\n" +
                        "                \"summonerId\": \"Io3j2RpO4lMhKd3o_ScK_qnq8vvtNAAcjsMbggGti67ukA\",\n" +
                        "                \"accountId\": \"5z9k7tGAzC1DEd9ss-gPVVsXYOdPslmUM5atIEmAQmkS\"\n" +
                        "            },\n" +
                        "            \"participantId\": 3\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"충북대한요한\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/7881117\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"e6nEaXb1EcJOQ-klh473ez7NVOWOj-czW2sNQopkLgvd\",\n" +
                        "                \"profileIcon\": 1301,\n" +
                        "                \"summonerId\": \"bR-apoA8jw6JlDHf7YbajqG3qDVpGtX80N5KlQcvuiPz6wU\",\n" +
                        "                \"accountId\": \"e6nEaXb1EcJOQ-klh473ez7NVOWOj-czW2sNQopkLgvd\"\n" +
                        "            },\n" +
                        "            \"participantId\": 4\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"LOVESJH\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/3605961\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"5U0wCuVx6iCTC2ZfEv2O4Rt5nJhpLoW69lzcgY1KC5hT\",\n" +
                        "                \"profileIcon\": 3003,\n" +
                        "                \"summonerId\": \"i1PMtaYAhiJj7Ha_-ZqGaIF1EaY7ArXAcipWeiHZ0HKjUw\",\n" +
                        "                \"accountId\": \"5U0wCuVx6iCTC2ZfEv2O4Rt5nJhpLoW69lzcgY1KC5hT\"\n" +
                        "            },\n" +
                        "            \"participantId\": 5\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"라면and김치\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/6211012\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"4M3Ot9weAlqLf7wysBkQTylfHtXghvn_y9Rod8A1guJz\",\n" +
                        "                \"profileIcon\": 4057,\n" +
                        "                \"summonerId\": \"fouR9X58xVInxU6pfCyOPky53WK-yb1hy1Sg_IUjeVb22w\",\n" +
                        "                \"accountId\": \"4M3Ot9weAlqLf7wysBkQTylfHtXghvn_y9Rod8A1guJz\"\n" +
                        "            },\n" +
                        "            \"participantId\": 6\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"xiao tuzi\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/1969160499720096\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"-DYzsJZFwwyVNSGs5O8O8AhfnheRb14tOGOymV167I1o_X1RMcVPXg_b\",\n" +
                        "                \"profileIcon\": 1425,\n" +
                        "                \"summonerId\": \"_R4OSd1j4cs6hAZ3EgOWLBqMCJHnp8HAAXt5e08i4mRzBSI\",\n" +
                        "                \"accountId\": \"-DYzsJZFwwyVNSGs5O8O8AhfnheRb14tOGOymV167I1o_X1RMcVPXg_b\"\n" +
                        "            },\n" +
                        "            \"participantId\": 7\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"젖탱이파티손명욱\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/7205796\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"JnJmltkOrPQDXBEtOP0GkHe5SsRj3RXc87zyjjX0qhmE\",\n" +
                        "                \"profileIcon\": 3163,\n" +
                        "                \"summonerId\": \"8PnfURU7X0D9QDePk86TBZDjVZyplQy-fwv7nkJgfr5k46o\",\n" +
                        "                \"accountId\": \"JnJmltkOrPQDXBEtOP0GkHe5SsRj3RXc87zyjjX0qhmE\"\n" +
                        "            },\n" +
                        "            \"participantId\": 8\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"랭전용케\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/204606804\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"0SYQ9ArmP8iH3yMo-v6NJz1-xbR3FmyYMdtEc0Sog-zwltY\",\n" +
                        "                \"profileIcon\": 4249,\n" +
                        "                \"summonerId\": \"ujoMoTK2QkyBU7__WYIUH9mGYt-ae2uTQ0u201IFzBUsXh8\",\n" +
                        "                \"accountId\": \"0SYQ9ArmP8iH3yMo-v6NJz1-xbR3FmyYMdtEc0Sog-zwltY\"\n" +
                        "            },\n" +
                        "            \"participantId\": 9\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"뱅기현\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/4979928\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"ZCKKNXiQCxnU6iZItHeoPu8skeTkf2LMZjd8_SxXIBqY\",\n" +
                        "                \"profileIcon\": 3460,\n" +
                        "                \"summonerId\": \"wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg\",\n" +
                        "                \"accountId\": \"ZCKKNXiQCxnU6iZItHeoPu8skeTkf2LMZjd8_SxXIBqY\"\n" +
                        "            },\n" +
                        "            \"participantId\": 10\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"gameVersion\": \"9.16.284.8446\",\n" +
                        "    \"platformId\": \"KR\",\n" +
                        "    \"gameMode\": \"CLASSIC\",\n" +
                        "    \"mapId\": 11,\n" +
                        "    \"gameType\": \"MATCHED_GAME\",\n" +
                        "    \"teams\": [\n" +
                        "        {\n" +
                        "            \"firstDragon\": true,\n" +
                        "            \"bans\": [\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 1,\n" +
                        "                    \"championId\": 84\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 2,\n" +
                        "                    \"championId\": 145\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 3,\n" +
                        "                    \"championId\": 82\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 4,\n" +
                        "                    \"championId\": 81\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 5,\n" +
                        "                    \"championId\": 350\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"firstInhibitor\": false,\n" +
                        "            \"win\": \"Win\",\n" +
                        "            \"firstRiftHerald\": true,\n" +
                        "            \"firstBaron\": true,\n" +
                        "            \"baronKills\": 2,\n" +
                        "            \"riftHeraldKills\": 1,\n" +
                        "            \"firstBlood\": true,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"firstTower\": true,\n" +
                        "            \"vilemawKills\": 0,\n" +
                        "            \"inhibitorKills\": 1,\n" +
                        "            \"towerKills\": 8,\n" +
                        "            \"dominionVictoryScore\": 0,\n" +
                        "            \"dragonKills\": 4\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"firstDragon\": false,\n" +
                        "            \"bans\": [\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 6,\n" +
                        "                    \"championId\": 64\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 7,\n" +
                        "                    \"championId\": 28\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 8,\n" +
                        "                    \"championId\": 122\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 9,\n" +
                        "                    \"championId\": 26\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 10,\n" +
                        "                    \"championId\": 7\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"firstInhibitor\": true,\n" +
                        "            \"win\": \"Fail\",\n" +
                        "            \"firstRiftHerald\": false,\n" +
                        "            \"firstBaron\": false,\n" +
                        "            \"baronKills\": 0,\n" +
                        "            \"riftHeraldKills\": 0,\n" +
                        "            \"firstBlood\": false,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"firstTower\": false,\n" +
                        "            \"vilemawKills\": 0,\n" +
                        "            \"inhibitorKills\": 1,\n" +
                        "            \"towerKills\": 5,\n" +
                        "            \"dominionVictoryScore\": 0,\n" +
                        "            \"dragonKills\": 0\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"participants\": [\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 73,\n" +
                        "                \"visionScore\": 17,\n" +
                        "                \"magicDamageDealtToChampions\": 4288,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 318,\n" +
                        "                \"longestTimeSpentLiving\": 1498,\n" +
                        "                \"perk1Var1\": 1905,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 400,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8473,\n" +
                        "                \"perk4\": 8446,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 10,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 978,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 120,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 12345,\n" +
                        "                \"physicalDamageDealtToChampions\": 11218,\n" +
                        "                \"damageDealtToObjectives\": 53267,\n" +
                        "                \"perk2Var2\": 10,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 11,\n" +
                        "                \"perk4Var1\": 2586,\n" +
                        "                \"totalDamageTaken\": 40745,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 2,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 8,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 76944,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3153,\n" +
                        "                \"item3\": 3111,\n" +
                        "                \"item0\": 3078,\n" +
                        "                \"item1\": 1011,\n" +
                        "                \"item6\": 3340,\n" +
                        "                \"item4\": 1401,\n" +
                        "                \"item5\": 3082,\n" +
                        "                \"perk1\": 9111,\n" +
                        "                \"perk0\": 8010,\n" +
                        "                \"perk3\": 8014,\n" +
                        "                \"perk2\": 9104,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 421,\n" +
                        "                \"damageSelfMitigated\": 30389,\n" +
                        "                \"magicalDamageTaken\": 6611,\n" +
                        "                \"perk0Var2\": 214,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1464,\n" +
                        "                \"assists\": 10,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 14183,\n" +
                        "                \"trueDamageDealt\": 14372,\n" +
                        "                \"participantId\": 1,\n" +
                        "                \"physicalDamageDealt\": 113786,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 16949,\n" +
                        "                \"physicalDamageTaken\": 32668,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 205103,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 25,\n" +
                        "                \"deaths\": 4,\n" +
                        "                \"wardsPlaced\": 9,\n" +
                        "                \"perkPrimaryStyle\": 8000,\n" +
                        "                \"perkSubStyle\": 8400,\n" +
                        "                \"turretKills\": 5,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 1442,\n" +
                        "                \"goldEarned\": 15569,\n" +
                        "                \"killingSprees\": 2,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 1,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 439,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 513,\n" +
                        "                \"visionWardsBoughtInGame\": 2,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 14549,\n" +
                        "                \"totalMinionsKilled\": 73,\n" +
                        "                \"timeCCingOthers\": 21,\n" +
                        "                \"statPerk2\": 5001\n" +
                        "            },\n" +
                        "            \"spell1Id\": 11,\n" +
                        "            \"participantId\": 1,\n" +
                        "            \"highestAchievedSeasonTier\": \"SILVER\",\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"JUNGLE\",\n" +
                        "                \"participantId\": 1,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -1.6,\n" +
                        "                    \"0-10\": -0.09999999999999998,\n" +
                        "                    \"10-20\": 2.6999999999999997\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 421.9,\n" +
                        "                    \"0-10\": 332,\n" +
                        "                    \"10-20\": 534\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -84.70000000000002,\n" +
                        "                    \"0-10\": -11.799999999999983,\n" +
                        "                    \"10-20\": 162.3\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.3,\n" +
                        "                    \"0-10\": 0.9,\n" +
                        "                    \"10-20\": 3.6\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 506.79999999999995,\n" +
                        "                    \"0-10\": 376.9,\n" +
                        "                    \"10-20\": 527.1\n" +
                        "                },\n" +
                        "                \"role\": \"NONE\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 559.1,\n" +
                        "                    \"0-10\": 81.40000000000003,\n" +
                        "                    \"10-20\": 175.29999999999995\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1644.7,\n" +
                        "                    \"0-10\": 579.8,\n" +
                        "                    \"10-20\": 1030.9\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 24\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 14,\n" +
                        "            \"participantId\": 2,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"MIDDLE\",\n" +
                        "                \"participantId\": 2,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 612,\n" +
                        "                    \"0-10\": 232.39999999999998,\n" +
                        "                    \"10-20\": 526.4\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 3.5999999999999996,\n" +
                        "                    \"0-10\": 3.7,\n" +
                        "                    \"10-20\": 7\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 604.8,\n" +
                        "                    \"0-10\": 354.2,\n" +
                        "                    \"10-20\": 551.3\n" +
                        "                },\n" +
                        "                \"role\": \"DUO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1277.5,\n" +
                        "                    \"0-10\": 315.8,\n" +
                        "                    \"10-20\": 378.4\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
                        "                \"visionScore\": 28,\n" +
                        "                \"magicDamageDealtToChampions\": 27727,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 173,\n" +
                        "                \"longestTimeSpentLiving\": 806,\n" +
                        "                \"perk1Var1\": 1315,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8014,\n" +
                        "                \"perk4\": 9111,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 12,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 876,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 8,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 2470,\n" +
                        "                \"physicalDamageDealtToChampions\": 3347,\n" +
                        "                \"damageDealtToObjectives\": 6285,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 30,\n" +
                        "                \"perk4Var1\": 787,\n" +
                        "                \"totalDamageTaken\": 22474,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 3,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 5,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 91727,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3157,\n" +
                        "                \"item3\": 1082,\n" +
                        "                \"item0\": 3152,\n" +
                        "                \"item1\": 3100,\n" +
                        "                \"item6\": 3340,\n" +
                        "                \"item4\": 3089,\n" +
                        "                \"item5\": 3020,\n" +
                        "                \"perk1\": 8143,\n" +
                        "                \"perk0\": 8112,\n" +
                        "                \"perk3\": 8135,\n" +
                        "                \"perk2\": 8138,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 5,\n" +
                        "                \"perk3Var1\": 3304,\n" +
                        "                \"damageSelfMitigated\": 14329,\n" +
                        "                \"magicalDamageTaken\": 7590,\n" +
                        "                \"perk0Var2\": 0,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 946,\n" +
                        "                \"assists\": 16,\n" +
                        "                \"perk4Var2\": 560,\n" +
                        "                \"goldSpent\": 14225,\n" +
                        "                \"trueDamageDealt\": 7781,\n" +
                        "                \"participantId\": 2,\n" +
                        "                \"physicalDamageDealt\": 16160,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 32440,\n" +
                        "                \"physicalDamageTaken\": 13938,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 115669,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 4,\n" +
                        "                \"deaths\": 5,\n" +
                        "                \"wardsPlaced\": 10,\n" +
                        "                \"perkPrimaryStyle\": 8100,\n" +
                        "                \"perkSubStyle\": 8000,\n" +
                        "                \"turretKills\": 1,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 1366,\n" +
                        "                \"goldEarned\": 15797,\n" +
                        "                \"killingSprees\": 3,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": true,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 17,\n" +
                        "                \"doubleKills\": 1,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 1725,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 1,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 5624,\n" +
                        "                \"totalMinionsKilled\": 144,\n" +
                        "                \"timeCCingOthers\": 17,\n" +
                        "                \"statPerk2\": 5003\n" +
                        "            },\n" +
                        "            \"championId\": 105\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 7,\n" +
                        "            \"participantId\": 3,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 3,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -1.6,\n" +
                        "                    \"0-10\": 1.15,\n" +
                        "                    \"10-20\": -0.75\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 500.2,\n" +
                        "                    \"0-10\": 325.4,\n" +
                        "                    \"10-20\": 344.2\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -14.800000000000011,\n" +
                        "                    \"0-10\": 22.85000000000001,\n" +
                        "                    \"10-20\": -13.400000000000034\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 4.1,\n" +
                        "                    \"0-10\": 7.300000000000001,\n" +
                        "                    \"10-20\": 6.6\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 600,\n" +
                        "                    \"0-10\": 273.1,\n" +
                        "                    \"10-20\": 459.5\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_CARRY\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 333.49999999999994,\n" +
                        "                    \"0-10\": 78.39999999999999,\n" +
                        "                    \"10-20\": 262.30000000000007\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1027.5,\n" +
                        "                    \"0-10\": 269.6,\n" +
                        "                    \"10-20\": 843.6\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 26,\n" +
                        "                \"visionScore\": 25,\n" +
                        "                \"magicDamageDealtToChampions\": 1303,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 102,\n" +
                        "                \"longestTimeSpentLiving\": 401,\n" +
                        "                \"perk1Var1\": 779,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 340,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8345,\n" +
                        "                \"perk4\": 8304,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 8,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 3,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 30,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 4688,\n" +
                        "                \"physicalDamageDealtToChampions\": 15515,\n" +
                        "                \"damageDealtToObjectives\": 12060,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 4,\n" +
                        "                \"perk2Var1\": 15,\n" +
                        "                \"perk4Var1\": 9,\n" +
                        "                \"totalDamageTaken\": 25972,\n" +
                        "                \"perk4Var3\": 5,\n" +
                        "                \"wardsKilled\": 1,\n" +
                        "                \"largestCriticalStrike\": 556,\n" +
                        "                \"largestKillingSpree\": 4,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 8177,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 0,\n" +
                        "                \"item3\": 3508,\n" +
                        "                \"item0\": 2420,\n" +
                        "                \"item1\": 3153,\n" +
                        "                \"item6\": 3363,\n" +
                        "                \"item4\": 3006,\n" +
                        "                \"item5\": 3094,\n" +
                        "                \"perk1\": 9111,\n" +
                        "                \"perk0\": 8005,\n" +
                        "                \"perk3\": 8014,\n" +
                        "                \"perk2\": 9104,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 501,\n" +
                        "                \"damageSelfMitigated\": 13757,\n" +
                        "                \"magicalDamageTaken\": 4802,\n" +
                        "                \"perk0Var2\": 713,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 923,\n" +
                        "                \"assists\": 9,\n" +
                        "                \"perk4Var2\": 4,\n" +
                        "                \"goldSpent\": 11325,\n" +
                        "                \"trueDamageDealt\": 16036,\n" +
                        "                \"participantId\": 3,\n" +
                        "                \"physicalDamageDealt\": 146624,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 17261,\n" +
                        "                \"physicalDamageTaken\": 20247,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 170838,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 8,\n" +
                        "                \"wardsPlaced\": 12,\n" +
                        "                \"perkPrimaryStyle\": 8000,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 1,\n" +
                        "                \"firstBloodKill\": true,\n" +
                        "                \"trueDamageDealtToChampions\": 442,\n" +
                        "                \"goldEarned\": 13953,\n" +
                        "                \"killingSprees\": 3,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 1,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 956,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 243,\n" +
                        "                \"visionWardsBoughtInGame\": 3,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 4598,\n" +
                        "                \"totalMinionsKilled\": 187,\n" +
                        "                \"timeCCingOthers\": 4,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"championId\": 236\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 4,\n" +
                        "            \"participantId\": 4,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"MIDDLE\",\n" +
                        "                \"participantId\": 4,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 292.8,\n" +
                        "                    \"0-10\": 293,\n" +
                        "                    \"10-20\": 414.6\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 2.5,\n" +
                        "                    \"0-10\": 6,\n" +
                        "                    \"10-20\": 3.5\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 391.9,\n" +
                        "                    \"0-10\": 503.4,\n" +
                        "                    \"10-20\": 406.70000000000005\n" +
                        "                },\n" +
                        "                \"role\": \"DUO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1859.4,\n" +
                        "                    \"0-10\": 351.6,\n" +
                        "                    \"10-20\": 800.9\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 12,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 8,\n" +
                        "                \"visionScore\": 7,\n" +
                        "                \"magicDamageDealtToChampions\": 7343,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 295,\n" +
                        "                \"longestTimeSpentLiving\": 1111,\n" +
                        "                \"perk1Var1\": 1011,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 9104,\n" +
                        "                \"perk4\": 9111,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 7,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 14,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 12,\n" +
                        "                \"statPerk1\": 5002,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 4248,\n" +
                        "                \"physicalDamageDealtToChampions\": 16615,\n" +
                        "                \"damageDealtToObjectives\": 23409,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 1037,\n" +
                        "                \"perk4Var1\": 1006,\n" +
                        "                \"totalDamageTaken\": 33785,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 0,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 5,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 20931,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3748,\n" +
                        "                \"item3\": 1031,\n" +
                        "                \"item0\": 1028,\n" +
                        "                \"item1\": 1054,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 3078,\n" +
                        "                \"item5\": 3047,\n" +
                        "                \"perk1\": 8401,\n" +
                        "                \"perk0\": 8437,\n" +
                        "                \"perk3\": 8451,\n" +
                        "                \"perk2\": 8473,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 211,\n" +
                        "                \"damageSelfMitigated\": 43240,\n" +
                        "                \"magicalDamageTaken\": 6983,\n" +
                        "                \"perk0Var2\": 1338,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 779,\n" +
                        "                \"assists\": 15,\n" +
                        "                \"perk4Var2\": 440,\n" +
                        "                \"goldSpent\": 10283,\n" +
                        "                \"trueDamageDealt\": 18852,\n" +
                        "                \"participantId\": 4,\n" +
                        "                \"physicalDamageDealt\": 87731,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 23958,\n" +
                        "                \"physicalDamageTaken\": 26022,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 127515,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 7,\n" +
                        "                \"wardsPlaced\": 3,\n" +
                        "                \"perkPrimaryStyle\": 8400,\n" +
                        "                \"perkSubStyle\": 8000,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 0,\n" +
                        "                \"goldEarned\": 12123,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 1794,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 2,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 3393,\n" +
                        "                \"totalMinionsKilled\": 139,\n" +
                        "                \"timeCCingOthers\": 41,\n" +
                        "                \"statPerk2\": 5001\n" +
                        "            },\n" +
                        "            \"championId\": 98\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
                        "                \"visionScore\": 47,\n" +
                        "                \"magicDamageDealtToChampions\": 237,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 131,\n" +
                        "                \"longestTimeSpentLiving\": 886,\n" +
                        "                \"perk1Var1\": 924,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8345,\n" +
                        "                \"perk4\": 8313,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 7,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 3,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 4,\n" +
                        "                \"statPerk1\": 5002,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 2435,\n" +
                        "                \"physicalDamageDealtToChampions\": 5109,\n" +
                        "                \"damageDealtToObjectives\": 3486,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 5,\n" +
                        "                \"perk2Var1\": 1094,\n" +
                        "                \"perk4Var1\": 0,\n" +
                        "                \"totalDamageTaken\": 27350,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 5,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 2,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 237,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3401,\n" +
                        "                \"item3\": 2055,\n" +
                        "                \"item0\": 3142,\n" +
                        "                \"item1\": 3190,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 3117,\n" +
                        "                \"item5\": 3082,\n" +
                        "                \"perk1\": 8446,\n" +
                        "                \"perk0\": 8439,\n" +
                        "                \"perk3\": 8451,\n" +
                        "                \"perk2\": 8444,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 171,\n" +
                        "                \"damageSelfMitigated\": 29761,\n" +
                        "                \"magicalDamageTaken\": 6911,\n" +
                        "                \"perk0Var2\": 0,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 300,\n" +
                        "                \"assists\": 13,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 9425,\n" +
                        "                \"trueDamageDealt\": 12424,\n" +
                        "                \"participantId\": 5,\n" +
                        "                \"physicalDamageDealt\": 20491,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 7125,\n" +
                        "                \"physicalDamageTaken\": 20138,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 33153,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 6,\n" +
                        "                \"wardsPlaced\": 18,\n" +
                        "                \"perkPrimaryStyle\": 8400,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 1778,\n" +
                        "                \"goldEarned\": 13490,\n" +
                        "                \"killingSprees\": 2,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 1,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 306,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 5,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 8897,\n" +
                        "                \"totalMinionsKilled\": 48,\n" +
                        "                \"timeCCingOthers\": 17,\n" +
                        "                \"statPerk2\": 5003\n" +
                        "            },\n" +
                        "            \"spell1Id\": 4,\n" +
                        "            \"participantId\": 5,\n" +
                        "            \"highestAchievedSeasonTier\": \"SILVER\",\n" +
                        "            \"spell2Id\": 14,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 5,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -1.6,\n" +
                        "                    \"0-10\": 1.15,\n" +
                        "                    \"10-20\": -0.75\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 509.8,\n" +
                        "                    \"0-10\": 165,\n" +
                        "                    \"10-20\": 305.1\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -14.800000000000011,\n" +
                        "                    \"0-10\": 22.85000000000001,\n" +
                        "                    \"10-20\": -13.400000000000034\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.1,\n" +
                        "                    \"0-10\": 1.7,\n" +
                        "                    \"10-20\": 1.6\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 584.6,\n" +
                        "                    \"0-10\": 321.20000000000005,\n" +
                        "                    \"10-20\": 378.9\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_SUPPORT\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 333.49999999999994,\n" +
                        "                    \"0-10\": 78.39999999999999,\n" +
                        "                    \"10-20\": 262.30000000000007\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1496,\n" +
                        "                    \"0-10\": 204.4,\n" +
                        "                    \"10-20\": 649.7\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 555\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 9,\n" +
                        "                \"visionScore\": 10,\n" +
                        "                \"magicDamageDealtToChampions\": 14736,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 526,\n" +
                        "                \"longestTimeSpentLiving\": 481,\n" +
                        "                \"perk1Var1\": 250,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 297,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8304,\n" +
                        "                \"perk4\": 8347,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 2,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 11,\n" +
                        "                \"perk5Var3\": 5,\n" +
                        "                \"perk5Var2\": 1,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 12,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 1378,\n" +
                        "                \"physicalDamageDealtToChampions\": 978,\n" +
                        "                \"damageDealtToObjectives\": 2881,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 0,\n" +
                        "                \"perk4Var1\": 0,\n" +
                        "                \"totalDamageTaken\": 21817,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 0,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 0,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 62880,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 1082,\n" +
                        "                \"item3\": 3111,\n" +
                        "                \"item0\": 1056,\n" +
                        "                \"item1\": 3285,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 3001,\n" +
                        "                \"item5\": 3082,\n" +
                        "                \"perk1\": 8226,\n" +
                        "                \"perk0\": 8229,\n" +
                        "                \"perk3\": 8237,\n" +
                        "                \"perk2\": 8210,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 421,\n" +
                        "                \"damageSelfMitigated\": 24247,\n" +
                        "                \"magicalDamageTaken\": 7983,\n" +
                        "                \"perk0Var2\": 0,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1597,\n" +
                        "                \"assists\": 9,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 8850,\n" +
                        "                \"trueDamageDealt\": 8409,\n" +
                        "                \"participantId\": 6,\n" +
                        "                \"physicalDamageDealt\": 21728,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 16588,\n" +
                        "                \"physicalDamageTaken\": 12236,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 93018,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 11,\n" +
                        "                \"wardsPlaced\": 7,\n" +
                        "                \"perkPrimaryStyle\": 8200,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 874,\n" +
                        "                \"goldEarned\": 9548,\n" +
                        "                \"killingSprees\": 0,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 14,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 1313,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 0,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 989,\n" +
                        "                \"totalMinionsKilled\": 148,\n" +
                        "                \"timeCCingOthers\": 32,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"spell1Id\": 14,\n" +
                        "            \"participantId\": 6,\n" +
                        "            \"highestAchievedSeasonTier\": \"GOLD\",\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"MIDDLE\",\n" +
                        "                \"participantId\": 6,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 349.2,\n" +
                        "                    \"0-10\": 244.60000000000002,\n" +
                        "                    \"10-20\": 264.2\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 4.1,\n" +
                        "                    \"0-10\": 6,\n" +
                        "                    \"10-20\": 4.7\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 457.79999999999995,\n" +
                        "                    \"0-10\": 409.6,\n" +
                        "                    \"10-20\": 362.2\n" +
                        "                },\n" +
                        "                \"role\": \"SOLO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1132.3000000000002,\n" +
                        "                    \"0-10\": 323.4,\n" +
                        "                    \"10-20\": 494\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 54\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 12,\n" +
                        "            \"participantId\": 7,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"TOP\",\n" +
                        "                \"participantId\": 7,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 453.8,\n" +
                        "                    \"0-10\": 173.7,\n" +
                        "                    \"10-20\": 319.4\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 3.4000000000000004,\n" +
                        "                    \"0-10\": 3.9000000000000004,\n" +
                        "                    \"10-20\": 5.2\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 586.0999999999999,\n" +
                        "                    \"0-10\": 328.20000000000005,\n" +
                        "                    \"10-20\": 340.1\n" +
                        "                },\n" +
                        "                \"role\": \"SOLO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1518.3,\n" +
                        "                    \"0-10\": 485,\n" +
                        "                    \"10-20\": 858.3\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
                        "                \"visionScore\": 11,\n" +
                        "                \"magicDamageDealtToChampions\": 2926,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 454,\n" +
                        "                \"longestTimeSpentLiving\": 358,\n" +
                        "                \"perk1Var1\": 1345,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 240,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8473,\n" +
                        "                \"perk4\": 8446,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 4,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 1308,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 0,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 2750,\n" +
                        "                \"physicalDamageDealtToChampions\": 17859,\n" +
                        "                \"damageDealtToObjectives\": 3253,\n" +
                        "                \"perk2Var2\": 40,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 24,\n" +
                        "                \"perk4Var1\": 563,\n" +
                        "                \"totalDamageTaken\": 32620,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 1,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 2,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 7501,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3071,\n" +
                        "                \"item3\": 3022,\n" +
                        "                \"item0\": 2055,\n" +
                        "                \"item1\": 3143,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 0,\n" +
                        "                \"item5\": 3047,\n" +
                        "                \"perk1\": 9111,\n" +
                        "                \"perk0\": 8021,\n" +
                        "                \"perk3\": 8014,\n" +
                        "                \"perk2\": 9104,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 359,\n" +
                        "                \"damageSelfMitigated\": 23034,\n" +
                        "                \"magicalDamageTaken\": 12948,\n" +
                        "                \"perk0Var2\": 0,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1649,\n" +
                        "                \"assists\": 8,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 10825,\n" +
                        "                \"trueDamageDealt\": 0,\n" +
                        "                \"participantId\": 7,\n" +
                        "                \"physicalDamageDealt\": 85420,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 20785,\n" +
                        "                \"physicalDamageTaken\": 18022,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 92922,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 12,\n" +
                        "                \"wardsPlaced\": 7,\n" +
                        "                \"perkPrimaryStyle\": 8000,\n" +
                        "                \"perkSubStyle\": 8400,\n" +
                        "                \"turretKills\": 1,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 0,\n" +
                        "                \"goldEarned\": 11027,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 15,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 1322,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 3,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 2840,\n" +
                        "                \"totalMinionsKilled\": 129,\n" +
                        "                \"timeCCingOthers\": 53,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"championId\": 150\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 11,\n" +
                        "            \"participantId\": 8,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"JUNGLE\",\n" +
                        "                \"participantId\": 8,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.6,\n" +
                        "                    \"0-10\": 0.09999999999999998,\n" +
                        "                    \"10-20\": -2.6999999999999997\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 561.5,\n" +
                        "                    \"0-10\": 330,\n" +
                        "                    \"10-20\": 308.7\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 84.70000000000002,\n" +
                        "                    \"0-10\": 11.799999999999983,\n" +
                        "                    \"10-20\": -162.3\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 2.9000000000000004,\n" +
                        "                    \"0-10\": 1,\n" +
                        "                    \"10-20\": 0.8999999999999999\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 591.5,\n" +
                        "                    \"0-10\": 388.7,\n" +
                        "                    \"10-20\": 364.79999999999995\n" +
                        "                },\n" +
                        "                \"role\": \"NONE\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -559.1,\n" +
                        "                    \"0-10\": -81.40000000000003,\n" +
                        "                    \"10-20\": -175.29999999999995\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1085.6,\n" +
                        "                    \"0-10\": 498.4,\n" +
                        "                    \"10-20\": 855.6\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 75,\n" +
                        "                \"visionScore\": 27,\n" +
                        "                \"magicDamageDealtToChampions\": 165,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 111,\n" +
                        "                \"longestTimeSpentLiving\": 673,\n" +
                        "                \"perk1Var1\": 504,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8321,\n" +
                        "                \"perk4\": 8304,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 9,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 2,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 120,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 3513,\n" +
                        "                \"physicalDamageDealtToChampions\": 17797,\n" +
                        "                \"damageDealtToObjectives\": 9781,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 18,\n" +
                        "                \"perk4Var1\": 9,\n" +
                        "                \"totalDamageTaken\": 27279,\n" +
                        "                \"perk4Var3\": 5,\n" +
                        "                \"wardsKilled\": 7,\n" +
                        "                \"largestCriticalStrike\": 802,\n" +
                        "                \"largestKillingSpree\": 3,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 165,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 1037,\n" +
                        "                \"item3\": 3052,\n" +
                        "                \"item0\": 3153,\n" +
                        "                \"item1\": 3031,\n" +
                        "                \"item6\": 3363,\n" +
                        "                \"item4\": 3046,\n" +
                        "                \"item5\": 3006,\n" +
                        "                \"perk1\": 8143,\n" +
                        "                \"perk0\": 9923,\n" +
                        "                \"perk3\": 8105,\n" +
                        "                \"perk2\": 8138,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 5,\n" +
                        "                \"perk3Var1\": 15,\n" +
                        "                \"damageSelfMitigated\": 19270,\n" +
                        "                \"magicalDamageTaken\": 7042,\n" +
                        "                \"perk0Var2\": 77,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 687,\n" +
                        "                \"assists\": 7,\n" +
                        "                \"perk4Var2\": 4,\n" +
                        "                \"goldSpent\": 12975,\n" +
                        "                \"trueDamageDealt\": 16318,\n" +
                        "                \"participantId\": 8,\n" +
                        "                \"physicalDamageDealt\": 158360,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 20562,\n" +
                        "                \"physicalDamageTaken\": 19549,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 174844,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 12,\n" +
                        "                \"deaths\": 8,\n" +
                        "                \"wardsPlaced\": 7,\n" +
                        "                \"perkPrimaryStyle\": 8100,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 2,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 2598,\n" +
                        "                \"goldEarned\": 13457,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 15,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": true,\n" +
                        "                \"perk0Var1\": 45,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 4,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 6261,\n" +
                        "                \"totalMinionsKilled\": 52,\n" +
                        "                \"timeCCingOthers\": 3,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"championId\": 11\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
                        "                \"visionScore\": 46,\n" +
                        "                \"magicDamageDealtToChampions\": 9623,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 93,\n" +
                        "                \"longestTimeSpentLiving\": 480,\n" +
                        "                \"perk1Var1\": 250,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 647,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8347,\n" +
                        "                \"perk4\": 8313,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 2,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 0,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 0,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5007,\n" +
                        "                \"damageDealtToTurrets\": 715,\n" +
                        "                \"physicalDamageDealtToChampions\": 1092,\n" +
                        "                \"damageDealtToObjectives\": 934,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 16,\n" +
                        "                \"perk4Var1\": 0,\n" +
                        "                \"totalDamageTaken\": 16145,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 3,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 0,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 22976,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3092,\n" +
                        "                \"item3\": 0,\n" +
                        "                \"item0\": 3157,\n" +
                        "                \"item1\": 3905,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 0,\n" +
                        "                \"item5\": 3117,\n" +
                        "                \"perk1\": 8226,\n" +
                        "                \"perk0\": 8214,\n" +
                        "                \"perk3\": 8237,\n" +
                        "                \"perk2\": 8210,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 394,\n" +
                        "                \"damageSelfMitigated\": 8027,\n" +
                        "                \"magicalDamageTaken\": 7047,\n" +
                        "                \"perk0Var2\": 384,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 601,\n" +
                        "                \"assists\": 14,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 8000,\n" +
                        "                \"trueDamageDealt\": 398,\n" +
                        "                \"participantId\": 9,\n" +
                        "                \"physicalDamageDealt\": 3397,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 11114,\n" +
                        "                \"physicalDamageTaken\": 8496,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 26773,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 9,\n" +
                        "                \"wardsPlaced\": 27,\n" +
                        "                \"perkPrimaryStyle\": 8200,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 1,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 398,\n" +
                        "                \"goldEarned\": 8647,\n" +
                        "                \"killingSprees\": 0,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 14,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": true,\n" +
                        "                \"perk0Var1\": 884,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 0,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 976,\n" +
                        "                \"totalMinionsKilled\": 29,\n" +
                        "                \"timeCCingOthers\": 59,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"spell1Id\": 14,\n" +
                        "            \"participantId\": 9,\n" +
                        "            \"highestAchievedSeasonTier\": \"SILVER\",\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 9,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.6,\n" +
                        "                    \"0-10\": -1.15,\n" +
                        "                    \"10-20\": 0.75\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 360.70000000000005,\n" +
                        "                    \"0-10\": 172.4,\n" +
                        "                    \"10-20\": 210.9\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 14.800000000000011,\n" +
                        "                    \"0-10\": -22.85000000000001,\n" +
                        "                    \"10-20\": 13.400000000000034\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.2000000000000002,\n" +
                        "                    \"0-10\": 0.30000000000000004,\n" +
                        "                    \"10-20\": 1.2\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 475.59999999999997,\n" +
                        "                    \"0-10\": 244.3,\n" +
                        "                    \"10-20\": 381.9\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_SUPPORT\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -333.49999999999994,\n" +
                        "                    \"0-10\": -78.39999999999999,\n" +
                        "                    \"10-20\": -262.30000000000007\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 674.5,\n" +
                        "                    \"0-10\": 164.8,\n" +
                        "                    \"10-20\": 550.8\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 25\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 19,\n" +
                        "                \"visionScore\": 17,\n" +
                        "                \"magicDamageDealtToChampions\": 1459,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 98,\n" +
                        "                \"longestTimeSpentLiving\": 837,\n" +
                        "                \"perk1Var1\": 1087,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 480,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8233,\n" +
                        "                \"perk4\": 8236,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 13,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 23,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 40,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 23,\n" +
                        "                \"statPerk1\": 5002,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 7678,\n" +
                        "                \"physicalDamageDealtToChampions\": 36058,\n" +
                        "                \"damageDealtToObjectives\": 7678,\n" +
                        "                \"perk2Var2\": 30,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 4,\n" +
                        "                \"perk2Var1\": 21,\n" +
                        "                \"perk4Var1\": 28,\n" +
                        "                \"totalDamageTaken\": 20886,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 0,\n" +
                        "                \"largestCriticalStrike\": 732,\n" +
                        "                \"largestKillingSpree\": 11,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 3403,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3094,\n" +
                        "                \"item3\": 3072,\n" +
                        "                \"item0\": 3031,\n" +
                        "                \"item1\": 3085,\n" +
                        "                \"item6\": 3363,\n" +
                        "                \"item4\": 3026,\n" +
                        "                \"item5\": 3006,\n" +
                        "                \"perk1\": 9111,\n" +
                        "                \"perk0\": 8005,\n" +
                        "                \"perk3\": 8014,\n" +
                        "                \"perk2\": 9103,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 818,\n" +
                        "                \"damageSelfMitigated\": 11490,\n" +
                        "                \"magicalDamageTaken\": 7566,\n" +
                        "                \"perk0Var2\": 940,\n" +
                        "                \"firstInhibitorKill\": true,\n" +
                        "                \"trueDamageTaken\": 492,\n" +
                        "                \"assists\": 11,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 16950,\n" +
                        "                \"trueDamageDealt\": 1044,\n" +
                        "                \"participantId\": 10,\n" +
                        "                \"physicalDamageDealt\": 184066,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 38060,\n" +
                        "                \"physicalDamageTaken\": 12827,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 188513,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 4,\n" +
                        "                \"wardsPlaced\": 9,\n" +
                        "                \"perkPrimaryStyle\": 8000,\n" +
                        "                \"perkSubStyle\": 8200,\n" +
                        "                \"turretKills\": 1,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 542,\n" +
                        "                \"goldEarned\": 17361,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 1,\n" +
                        "                \"inhibitorKills\": 1,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 1779,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 838,\n" +
                        "                \"visionWardsBoughtInGame\": 0,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 3483,\n" +
                        "                \"totalMinionsKilled\": 223,\n" +
                        "                \"timeCCingOthers\": 24,\n" +
                        "                \"statPerk2\": 5001\n" +
                        "            },\n" +
                        "            \"spell1Id\": 7,\n" +
                        "            \"participantId\": 10,\n" +
                        "            \"highestAchievedSeasonTier\": \"GOLD\",\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 10,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.6,\n" +
                        "                    \"0-10\": -1.15,\n" +
                        "                    \"10-20\": 0.75\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 807.2,\n" +
                        "                    \"0-10\": 248.7,\n" +
                        "                    \"10-20\": 518.2\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 14.800000000000011,\n" +
                        "                    \"0-10\": -22.85000000000001,\n" +
                        "                    \"10-20\": 13.400000000000034\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 7.2,\n" +
                        "                    \"0-10\": 6.4,\n" +
                        "                    \"10-20\": 8.5\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 738.6,\n" +
                        "                    \"0-10\": 304.29999999999995,\n" +
                        "                    \"10-20\": 483.29999999999995\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_CARRY\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -333.49999999999994,\n" +
                        "                    \"0-10\": -78.39999999999999,\n" +
                        "                    \"10-20\": -262.30000000000007\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1182,\n" +
                        "                    \"0-10\": 152.4,\n" +
                        "                    \"10-20\": 417.9\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 222\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"gameDuration\": 1943,\n" +
                        "    \"gameCreation\": 1566453404650\n" +
                        "}"
        ).toString();
    }
}
