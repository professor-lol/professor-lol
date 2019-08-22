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
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3725077500,\n" +
                        "            \"champion\": 24,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561799579620,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3724003832,\n" +
                        "            \"champion\": 45,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561739744506,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3723917853,\n" +
                        "            \"champion\": 85,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561737669035,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3723859755,\n" +
                        "            \"champion\": 85,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561735495622,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3719751013,\n" +
                        "            \"champion\": 85,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561469229560,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3719071403,\n" +
                        "            \"champion\": 45,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561399253656,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3719056731,\n" +
                        "            \"champion\": 85,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561397230517,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3719032853,\n" +
                        "            \"champion\": 63,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561394351729,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3718977216,\n" +
                        "            \"champion\": 24,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561391855895,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3718971997,\n" +
                        "            \"champion\": 8,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561389895067,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3718943736,\n" +
                        "            \"champion\": 24,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561387692257,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3718819698,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561385823744,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3718716278,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561382242896,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3717832804,\n" +
                        "            \"champion\": 39,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561311040215,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3717786398,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561308069375,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3717774018,\n" +
                        "            \"champion\": 45,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561306660212,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3717718599,\n" +
                        "            \"champion\": 45,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1561304558962,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 13\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3468886722,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545587378275,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3468903395,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545585546205,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3463758559,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545238723047,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3462570436,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545142362221,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3462480375,\n" +
                        "            \"champion\": 131,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545139480378,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3462442498,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545137505834,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3462395767,\n" +
                        "            \"champion\": 105,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545135859095,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3462367114,\n" +
                        "            \"champion\": 84,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545133802081,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3462327668,\n" +
                        "            \"champion\": 12,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1545131399843,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3459152525,\n" +
                        "            \"champion\": 516,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544897309969,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3459136925,\n" +
                        "            \"champion\": 85,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544895111655,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3459079420,\n" +
                        "            \"champion\": 131,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544892338846,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3459048383,\n" +
                        "            \"champion\": 131,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544891744404,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3457661615,\n" +
                        "            \"champion\": 24,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544806704541,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3453461246,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544465667344,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3453378747,\n" +
                        "            \"champion\": 84,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544463403234,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3452301470,\n" +
                        "            \"champion\": 202,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544368387569,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3452233219,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544365370233,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3452213758,\n" +
                        "            \"champion\": 102,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544363251347,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3452145250,\n" +
                        "            \"champion\": 14,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544361118602,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3452066134,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544358809415,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3449420775,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544206075270,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3449247401,\n" +
                        "            \"champion\": 236,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544204419349,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3449222297,\n" +
                        "            \"champion\": 13,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544201955677,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3449170851,\n" +
                        "            \"champion\": 236,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544198740252,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3447922029,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544112340278,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3446887775,\n" +
                        "            \"champion\": 104,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544031335948,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3446864793,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1544029029365,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3445779706,\n" +
                        "            \"champion\": 101,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543941825399,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3445760652,\n" +
                        "            \"champion\": 102,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543937373534,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3445725153,\n" +
                        "            \"champion\": 102,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543935451547,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3445668892,\n" +
                        "            \"champion\": 20,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543933380655,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3445092342,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543913959892,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3444763698,\n" +
                        "            \"champion\": 81,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543854123445,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3443708237,\n" +
                        "            \"champion\": 104,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543772635736,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3443713820,\n" +
                        "            \"champion\": 104,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543769748877,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3443681529,\n" +
                        "            \"champion\": 102,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543767668320,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3443627829,\n" +
                        "            \"champion\": 104,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543762586301,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3443547394,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543759077837,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3443496898,\n" +
                        "            \"champion\": 39,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543756489999,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3443391201,\n" +
                        "            \"champion\": 13,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543750546936,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3439810461,\n" +
                        "            \"champion\": 7,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543509904531,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3439785013,\n" +
                        "            \"champion\": 91,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543507269698,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3439728519,\n" +
                        "            \"champion\": 136,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543504682362,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3439721603,\n" +
                        "            \"champion\": 105,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543502333784,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3438699667,\n" +
                        "            \"champion\": 1,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543419296342,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3438701897,\n" +
                        "            \"champion\": 45,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543416363012,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3438662867,\n" +
                        "            \"champion\": 20,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543413650396,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3436672494,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543249313977,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3435715064,\n" +
                        "            \"champion\": 19,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543164645476,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3435692171,\n" +
                        "            \"champion\": 81,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543162509941,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3435624251,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543159916938,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3435591465,\n" +
                        "            \"champion\": 120,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543158474182,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3434275338,\n" +
                        "            \"champion\": 91,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543080992137,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3434300014,\n" +
                        "            \"champion\": 91,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543079415957,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3434231787,\n" +
                        "            \"champion\": 8,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543076350216,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3434172651,\n" +
                        "            \"champion\": 39,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1543073739020,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3431665731,\n" +
                        "            \"champion\": 37,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542906578135,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3431609498,\n" +
                        "            \"champion\": 120,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542903045633,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3429476640,\n" +
                        "            \"champion\": 120,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542730808539,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3427374244,\n" +
                        "            \"champion\": 8,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542557618153,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3427327779,\n" +
                        "            \"champion\": 516,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542554838385,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3427288217,\n" +
                        "            \"champion\": 104,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542551646451,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3427228203,\n" +
                        "            \"champion\": 163,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542548968232,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3424623227,\n" +
                        "            \"champion\": 6,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542396705644,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3424602337,\n" +
                        "            \"champion\": 12,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542395249349,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3424559043,\n" +
                        "            \"champion\": 63,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542392538524,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3424554461,\n" +
                        "            \"champion\": 164,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542389849287,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3424529252,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542387796336,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3423340575,\n" +
                        "            \"champion\": 81,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542298651410,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3423293652,\n" +
                        "            \"champion\": 202,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542295904345,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3423270029,\n" +
                        "            \"champion\": 105,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542294464606,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3422142270,\n" +
                        "            \"champion\": 112,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542213590739,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"NONE\",\n" +
                        "            \"gameId\": 3422130325,\n" +
                        "            \"champion\": 80,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542212365960,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3422064852,\n" +
                        "            \"champion\": 63,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542210128919,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_SUPPORT\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"JUNGLE\",\n" +
                        "            \"gameId\": 3421787026,\n" +
                        "            \"champion\": 64,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542207347879,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"NONE\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"BOTTOM\",\n" +
                        "            \"gameId\": 3421677843,\n" +
                        "            \"champion\": 498,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1542204476393,\n" +
                        "            \"queue\": 440,\n" +
                        "            \"role\": \"DUO_CARRY\",\n" +
                        "            \"season\": 12\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3418572733,\n" +
                        "            \"champion\": 43,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1541952812722,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 11\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3418555444,\n" +
                        "            \"champion\": 43,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1541950592027,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 11\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3418488740,\n" +
                        "            \"champion\": 78,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1541948259615,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 11\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3418470773,\n" +
                        "            \"champion\": 80,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1541946163184,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"DUO\",\n" +
                        "            \"season\": 11\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"TOP\",\n" +
                        "            \"gameId\": 3418396836,\n" +
                        "            \"champion\": 13,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1541943331653,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 11\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"lane\": \"MID\",\n" +
                        "            \"gameId\": 3418334024,\n" +
                        "            \"champion\": 245,\n" +
                        "            \"platformId\": \"KR\",\n" +
                        "            \"timestamp\": 1541940876555,\n" +
                        "            \"queue\": 420,\n" +
                        "            \"role\": \"SOLO\",\n" +
                        "            \"season\": 11\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"endIndex\": 100,\n" +
                        "    \"startIndex\": 0,\n" +
                        "    \"totalGames\": 475\n" +
                        "}").toString();
    }

    public static String getMatchMockBody() {
        return new JsonParser().parse(
                "{\n" +
                        "    \"seasonId\": 13,\n" +
                        "    \"queueId\": 420,\n" +
                        "    \"gameId\": 3724003832,\n" +
                        "    \"participantIdentities\": [\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"최미남찬\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/200931747\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"CUPQJhA6e9DC3Qs_NbAJNBbBp959Yq1dSa70FE-JFghZPsg\",\n" +
                        "                \"profileIcon\": 4027,\n" +
                        "                \"summonerId\": \"vhsQO8zQ0BN3WihHBd2ecVR3_U0VWIfrGGr7OuuAFW-uDag\",\n" +
                        "                \"accountId\": \"CUPQJhA6e9DC3Qs_NbAJNBbBp959Yq1dSa70FE-JFghZPsg\"\n" +
                        "            },\n" +
                        "            \"participantId\": 1\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"hzi\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/202001024\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"dM8bHLggs2n8mWwk6yQ0pry7zTYf35kPBs8pcXSmo77MamQ\",\n" +
                        "                \"profileIcon\": 3865,\n" +
                        "                \"summonerId\": \"Eo954IbNnJPpW6hkw3YR9yvwJI7byFdT1imHnMX3Mkh-PqM\",\n" +
                        "                \"accountId\": \"dM8bHLggs2n8mWwk6yQ0pry7zTYf35kPBs8pcXSmo77MamQ\"\n" +
                        "            },\n" +
                        "            \"participantId\": 2\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"유아림\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/206788619\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"gOUl6k-lJCzY2CKCzGIbcr75aE4J-JlJbmKdDwqe-vJ8yz8\",\n" +
                        "                \"profileIcon\": 871,\n" +
                        "                \"summonerId\": \"29jBmpTWYwNXDOOyV8coM652CjqrWP5BnI6CjH5aC917oUI\",\n" +
                        "                \"accountId\": \"gOUl6k-lJCzY2CKCzGIbcr75aE4J-JlJbmKdDwqe-vJ8yz8\"\n" +
                        "            },\n" +
                        "            \"participantId\": 3\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"이상한새기\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/3389489\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv\",\n" +
                        "                \"profileIcon\": 2095,\n" +
                        "                \"summonerId\": \"zN1v1n2XlkIY9cYKj9XydSSKItQNRtDLVdJHEWIkVhN5fQ\",\n" +
                        "                \"accountId\": \"w94qxPIxhJ2ALZoRItVSwyN6R-CNMXOE1VJwesmrZdAv\"\n" +
                        "            },\n" +
                        "            \"participantId\": 4\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"이쁜말만쓸래여\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/2579944\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"nVL89tBICK_QzjS2Aee1qsNMx33RNL2oZ4_xregy50m0\",\n" +
                        "                \"profileIcon\": 4088,\n" +
                        "                \"summonerId\": \"Abfs_JcaatQ-Yfxdl08aiI4zu4lmEmY0g7XveriEMA5caQ\",\n" +
                        "                \"accountId\": \"nVL89tBICK_QzjS2Aee1qsNMx33RNL2oZ4_xregy50m0\"\n" +
                        "            },\n" +
                        "            \"participantId\": 5\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"편하게들어\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/1270046\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"eDa50WgPOkyzVjAb6IogGYEigv0UXYPsAsHFvInkhfTr\",\n" +
                        "                \"profileIcon\": 3478,\n" +
                        "                \"summonerId\": \"ZVNR1Lzd8zHm8SykrrULrwaaLbLkqjtaHuaS8sYz1fORsg\",\n" +
                        "                \"accountId\": \"eDa50WgPOkyzVjAb6IogGYEigv0UXYPsAsHFvInkhfTr\"\n" +
                        "            },\n" +
                        "            \"participantId\": 6\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"나연58\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/6974211\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"eNyMO3FYwRgW5SwdaHbnvond1nh5e0ESoiJN0x64fjJl\",\n" +
                        "                \"profileIcon\": 3860,\n" +
                        "                \"summonerId\": \"dcSIBDdtY9p4Uo4UoTHpx0xE5rxS9M7JUTcH_PxFtYDcxYg\",\n" +
                        "                \"accountId\": \"eNyMO3FYwRgW5SwdaHbnvond1nh5e0ESoiJN0x64fjJl\"\n" +
                        "            },\n" +
                        "            \"participantId\": 7\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"픽은 자유\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/200486630\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"xzDD0gJHuUYTNVk7rJtBK8QXpYDWlzVSqi9MEr82idjaoYk\",\n" +
                        "                \"profileIcon\": 715,\n" +
                        "                \"summonerId\": \"roIDxkr_cfk0LrAfuNwGnOlKYA2PC8bmdImO29RQyhFEado\",\n" +
                        "                \"accountId\": \"xzDD0gJHuUYTNVk7rJtBK8QXpYDWlzVSqi9MEr82idjaoYk\"\n" +
                        "            },\n" +
                        "            \"participantId\": 8\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"Clumsy1\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/208530283\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"EPET47JcxdA6rVr5DcAs9SAJmNzGQ6_l9Jofql_hdJ31Dck\",\n" +
                        "                \"profileIcon\": 4080,\n" +
                        "                \"summonerId\": \"BQIzevAYGSU4NOq2UcSN8TV_afPk2f0HOI9NwoFq-wJG8iU\",\n" +
                        "                \"accountId\": \"EPET47JcxdA6rVr5DcAs9SAJmNzGQ6_l9Jofql_hdJ31Dck\"\n" +
                        "            },\n" +
                        "            \"participantId\": 9\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"player\": {\n" +
                        "                \"currentPlatformId\": \"KR\",\n" +
                        "                \"summonerName\": \"riven만팔게요\",\n" +
                        "                \"matchHistoryUri\": \"/v1/stats/player_history/KR/205380290\",\n" +
                        "                \"platformId\": \"KR\",\n" +
                        "                \"currentAccountId\": \"i98PpbBGDg1_U47pnJrD-d9CDiNxUdyHpuTB0q0h4XBMEbc\",\n" +
                        "                \"profileIcon\": 1383,\n" +
                        "                \"summonerId\": \"bDICl76UPE_0s__gI3t1dBRwkxxXGs-8CZyQ81pqyB5APTs\",\n" +
                        "                \"accountId\": \"i98PpbBGDg1_U47pnJrD-d9CDiNxUdyHpuTB0q0h4XBMEbc\"\n" +
                        "            },\n" +
                        "            \"participantId\": 10\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"gameVersion\": \"9.13.279.7717\",\n" +
                        "    \"platformId\": \"KR\",\n" +
                        "    \"gameMode\": \"CLASSIC\",\n" +
                        "    \"mapId\": 11,\n" +
                        "    \"gameType\": \"MATCHED_GAME\",\n" +
                        "    \"teams\": [\n" +
                        "        {\n" +
                        "            \"firstDragon\": false,\n" +
                        "            \"bans\": [\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 1,\n" +
                        "                    \"championId\": 82\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 2,\n" +
                        "                    \"championId\": 39\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 3,\n" +
                        "                    \"championId\": 59\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 4,\n" +
                        "                    \"championId\": 266\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 5,\n" +
                        "                    \"championId\": 22\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"firstInhibitor\": true,\n" +
                        "            \"win\": \"Win\",\n" +
                        "            \"firstRiftHerald\": false,\n" +
                        "            \"firstBaron\": true,\n" +
                        "            \"baronKills\": 1,\n" +
                        "            \"riftHeraldKills\": 0,\n" +
                        "            \"firstBlood\": true,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"firstTower\": true,\n" +
                        "            \"vilemawKills\": 0,\n" +
                        "            \"inhibitorKills\": 2,\n" +
                        "            \"towerKills\": 8,\n" +
                        "            \"dominionVictoryScore\": 0,\n" +
                        "            \"dragonKills\": 3\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"firstDragon\": true,\n" +
                        "            \"bans\": [\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 6,\n" +
                        "                    \"championId\": 350\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 7,\n" +
                        "                    \"championId\": 25\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 8,\n" +
                        "                    \"championId\": 103\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 9,\n" +
                        "                    \"championId\": 113\n" +
                        "                },\n" +
                        "                {\n" +
                        "                    \"pickTurn\": 10,\n" +
                        "                    \"championId\": 58\n" +
                        "                }\n" +
                        "            ],\n" +
                        "            \"firstInhibitor\": false,\n" +
                        "            \"win\": \"Fail\",\n" +
                        "            \"firstRiftHerald\": false,\n" +
                        "            \"firstBaron\": false,\n" +
                        "            \"baronKills\": 0,\n" +
                        "            \"riftHeraldKills\": 0,\n" +
                        "            \"firstBlood\": false,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"firstTower\": false,\n" +
                        "            \"vilemawKills\": 0,\n" +
                        "            \"inhibitorKills\": 0,\n" +
                        "            \"towerKills\": 4,\n" +
                        "            \"dominionVictoryScore\": 0,\n" +
                        "            \"dragonKills\": 1\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"participants\": [\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 67,\n" +
                        "                \"visionScore\": 29,\n" +
                        "                \"magicDamageDealtToChampions\": 722,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 258,\n" +
                        "                \"longestTimeSpentLiving\": 477,\n" +
                        "                \"perk1Var1\": 1446,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 380,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8105,\n" +
                        "                \"perk4\": 8126,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 14,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 16,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 5,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 100,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5007,\n" +
                        "                \"damageDealtToTurrets\": 4523,\n" +
                        "                \"physicalDamageDealtToChampions\": 17699,\n" +
                        "                \"damageDealtToObjectives\": 18686,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 15,\n" +
                        "                \"perk4Var1\": 774,\n" +
                        "                \"totalDamageTaken\": 35115,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 8,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 4,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 4911,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3026,\n" +
                        "                \"item3\": 1037,\n" +
                        "                \"item0\": 1400,\n" +
                        "                \"item1\": 3078,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 3047,\n" +
                        "                \"item5\": 3052,\n" +
                        "                \"perk1\": 9111,\n" +
                        "                \"perk0\": 8005,\n" +
                        "                \"perk3\": 8014,\n" +
                        "                \"perk2\": 9104,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 636,\n" +
                        "                \"damageSelfMitigated\": 28139,\n" +
                        "                \"magicalDamageTaken\": 8767,\n" +
                        "                \"perk0Var2\": 930,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 4616,\n" +
                        "                \"assists\": 5,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 12633,\n" +
                        "                \"trueDamageDealt\": 28463,\n" +
                        "                \"participantId\": 1,\n" +
                        "                \"physicalDamageDealt\": 112276,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 24369,\n" +
                        "                \"physicalDamageTaken\": 21731,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 145652,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 5,\n" +
                        "                \"deaths\": 6,\n" +
                        "                \"wardsPlaced\": 3,\n" +
                        "                \"perkPrimaryStyle\": 8000,\n" +
                        "                \"perkSubStyle\": 8100,\n" +
                        "                \"turretKills\": 2,\n" +
                        "                \"firstBloodKill\": true,\n" +
                        "                \"trueDamageDealtToChampions\": 5947,\n" +
                        "                \"goldEarned\": 14596,\n" +
                        "                \"killingSprees\": 3,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 1,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 1560,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 630,\n" +
                        "                \"visionWardsBoughtInGame\": 3,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 13688,\n" +
                        "                \"totalMinionsKilled\": 43,\n" +
                        "                \"timeCCingOthers\": 31,\n" +
                        "                \"statPerk2\": 5002\n" +
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
                        "                    \"20-30\": 1.3000000000000003,\n" +
                        "                    \"0-10\": -0.19999999999999998,\n" +
                        "                    \"10-20\": 0.4\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 536.5,\n" +
                        "                    \"0-10\": 286.6,\n" +
                        "                    \"10-20\": 457.8\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 262.70000000000005,\n" +
                        "                    \"0-10\": -127.5,\n" +
                        "                    \"10-20\": 164.5\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 2.6,\n" +
                        "                    \"0-10\": 0.1,\n" +
                        "                    \"10-20\": 0.8\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 638.3,\n" +
                        "                    \"0-10\": 241.20000000000002,\n" +
                        "                    \"10-20\": 603.5\n" +
                        "                },\n" +
                        "                \"role\": \"NONE\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 178.20000000000005,\n" +
                        "                    \"0-10\": -65.89999999999995,\n" +
                        "                    \"10-20\": 343.4\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1344.1,\n" +
                        "                    \"0-10\": 650.5,\n" +
                        "                    \"10-20\": 1172.9\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 164\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 14,\n" +
                        "            \"participantId\": 2,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"TOP\",\n" +
                        "                \"participantId\": 2,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 433.1,\n" +
                        "                    \"0-10\": 295.79999999999995,\n" +
                        "                    \"10-20\": 357.3\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.8,\n" +
                        "                    \"0-10\": 6.6,\n" +
                        "                    \"10-20\": 5.6\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 527.2,\n" +
                        "                    \"0-10\": 444.4,\n" +
                        "                    \"10-20\": 477.70000000000005\n" +
                        "                },\n" +
                        "                \"role\": \"SOLO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1095.2,\n" +
                        "                    \"0-10\": 453.3,\n" +
                        "                    \"10-20\": 842.5\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 4,\n" +
                        "                \"visionScore\": 21,\n" +
                        "                \"magicDamageDealtToChampions\": 185,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 143,\n" +
                        "                \"longestTimeSpentLiving\": 302,\n" +
                        "                \"perk1Var1\": 754,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 9104,\n" +
                        "                \"perk4\": 9111,\n" +
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
                        "                \"perk5Var1\": 16,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 12,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 1540,\n" +
                        "                \"physicalDamageDealtToChampions\": 31084,\n" +
                        "                \"damageDealtToObjectives\": 4637,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 18,\n" +
                        "                \"perk4Var1\": 1178,\n" +
                        "                \"totalDamageTaken\": 28879,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 4,\n" +
                        "                \"largestCriticalStrike\": 905,\n" +
                        "                \"largestKillingSpree\": 3,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 452,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3047,\n" +
                        "                \"item3\": 3031,\n" +
                        "                \"item0\": 3142,\n" +
                        "                \"item1\": 3046,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 1055,\n" +
                        "                \"item5\": 1053,\n" +
                        "                \"perk1\": 8143,\n" +
                        "                \"perk0\": 8112,\n" +
                        "                \"perk3\": 8105,\n" +
                        "                \"perk2\": 8138,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 5,\n" +
                        "                \"perk3Var1\": 16,\n" +
                        "                \"damageSelfMitigated\": 14889,\n" +
                        "                \"magicalDamageTaken\": 6897,\n" +
                        "                \"perk0Var2\": 0,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 3496,\n" +
                        "                \"assists\": 10,\n" +
                        "                \"perk4Var2\": 380,\n" +
                        "                \"goldSpent\": 11775,\n" +
                        "                \"trueDamageDealt\": 1171,\n" +
                        "                \"participantId\": 2,\n" +
                        "                \"physicalDamageDealt\": 123583,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 32441,\n" +
                        "                \"physicalDamageTaken\": 18486,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 125208,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 8,\n" +
                        "                \"deaths\": 10,\n" +
                        "                \"wardsPlaced\": 4,\n" +
                        "                \"perkPrimaryStyle\": 8100,\n" +
                        "                \"perkSubStyle\": 8000,\n" +
                        "                \"turretKills\": 1,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 1171,\n" +
                        "                \"goldEarned\": 13162,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 2688,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 3,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 2300,\n" +
                        "                \"totalMinionsKilled\": 152,\n" +
                        "                \"timeCCingOthers\": 42,\n" +
                        "                \"statPerk2\": 5001\n" +
                        "            },\n" +
                        "            \"championId\": 133\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 4,\n" +
                        "                \"visionScore\": 56,\n" +
                        "                \"magicDamageDealtToChampions\": 23823,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 219,\n" +
                        "                \"longestTimeSpentLiving\": 320,\n" +
                        "                \"perk1Var1\": 250,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 1050,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8313,\n" +
                        "                \"perk4\": 8347,\n" +
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
                        "                \"perk5Var1\": 0,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 4,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 3838,\n" +
                        "                \"physicalDamageDealtToChampions\": 1554,\n" +
                        "                \"damageDealtToObjectives\": 6984,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 4,\n" +
                        "                \"perk2Var1\": 13821,\n" +
                        "                \"perk4Var1\": 0,\n" +
                        "                \"totalDamageTaken\": 20084,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 8,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 3,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 60181,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3157,\n" +
                        "                \"item3\": 3504,\n" +
                        "                \"item0\": 3098,\n" +
                        "                \"item1\": 3174,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 3165,\n" +
                        "                \"item5\": 3020,\n" +
                        "                \"perk1\": 8226,\n" +
                        "                \"perk0\": 8214,\n" +
                        "                \"perk3\": 8237,\n" +
                        "                \"perk2\": 8234,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 624,\n" +
                        "                \"damageSelfMitigated\": 16897,\n" +
                        "                \"magicalDamageTaken\": 6665,\n" +
                        "                \"perk0Var2\": 1464,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1561,\n" +
                        "                \"assists\": 16,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 12750,\n" +
                        "                \"trueDamageDealt\": 1572,\n" +
                        "                \"participantId\": 3,\n" +
                        "                \"physicalDamageDealt\": 5812,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 26877,\n" +
                        "                \"physicalDamageTaken\": 11857,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 67566,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 8,\n" +
                        "                \"wardsPlaced\": 21,\n" +
                        "                \"perkPrimaryStyle\": 8200,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 1500,\n" +
                        "                \"goldEarned\": 13880,\n" +
                        "                \"killingSprees\": 3,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": true,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": true,\n" +
                        "                \"perk0Var1\": 1896,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 2,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 3215,\n" +
                        "                \"totalMinionsKilled\": 56,\n" +
                        "                \"timeCCingOthers\": 33,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"spell1Id\": 14,\n" +
                        "            \"participantId\": 3,\n" +
                        "            \"highestAchievedSeasonTier\": \"GOLD\",\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 3,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -0.3999999999999999,\n" +
                        "                    \"0-10\": 0.24999999999999978,\n" +
                        "                    \"10-20\": 0.19999999999999973\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 559.5,\n" +
                        "                    \"0-10\": 271,\n" +
                        "                    \"10-20\": 411\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -16.80000000000004,\n" +
                        "                    \"0-10\": 61.500000000000014,\n" +
                        "                    \"10-20\": 48.75000000000003\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 2.3,\n" +
                        "                    \"0-10\": 0.6,\n" +
                        "                    \"10-20\": 2.3\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 540.8,\n" +
                        "                    \"0-10\": 370.2,\n" +
                        "                    \"10-20\": 487.9\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_SUPPORT\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -144.79999999999995,\n" +
                        "                    \"0-10\": -175.59999999999997,\n" +
                        "                    \"10-20\": -137.55\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 879.7,\n" +
                        "                    \"0-10\": 249.6,\n" +
                        "                    \"10-20\": 645.8\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 43\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 4,\n" +
                        "            \"participantId\": 4,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"MIDDLE\",\n" +
                        "                \"participantId\": 4,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 310.6,\n" +
                        "                    \"0-10\": 266.4,\n" +
                        "                    \"10-20\": 320.2\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 0.9,\n" +
                        "                    \"0-10\": 7.9,\n" +
                        "                    \"10-20\": 5.4\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 496.20000000000005,\n" +
                        "                    \"0-10\": 472.29999999999995,\n" +
                        "                    \"10-20\": 416.8\n" +
                        "                },\n" +
                        "                \"role\": \"SOLO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 907,\n" +
                        "                    \"0-10\": 211.8,\n" +
                        "                    \"10-20\": 680.4\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 12,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
                        "                \"visionScore\": 24,\n" +
                        "                \"magicDamageDealtToChampions\": 15887,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 108,\n" +
                        "                \"longestTimeSpentLiving\": 881,\n" +
                        "                \"perk1Var1\": 250,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 497,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8347,\n" +
                        "                \"perk4\": 8321,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 5,\n" +
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
                        "                \"statPerk1\": 5002,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 500,\n" +
                        "                \"physicalDamageDealtToChampions\": 2483,\n" +
                        "                \"damageDealtToObjectives\": 4821,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 12696,\n" +
                        "                \"perk4Var1\": 3,\n" +
                        "                \"totalDamageTaken\": 21287,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 5,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 3,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 63720,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3905,\n" +
                        "                \"item3\": 3047,\n" +
                        "                \"item0\": 2033,\n" +
                        "                \"item1\": 2065,\n" +
                        "                \"item6\": 3340,\n" +
                        "                \"item4\": 3165,\n" +
                        "                \"item5\": 0,\n" +
                        "                \"perk1\": 8226,\n" +
                        "                \"perk0\": 8214,\n" +
                        "                \"perk3\": 8237,\n" +
                        "                \"perk2\": 8234,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 399,\n" +
                        "                \"damageSelfMitigated\": 10952,\n" +
                        "                \"magicalDamageTaken\": 6190,\n" +
                        "                \"perk0Var2\": 58,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1129,\n" +
                        "                \"assists\": 8,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 9400,\n" +
                        "                \"trueDamageDealt\": 300,\n" +
                        "                \"participantId\": 4,\n" +
                        "                \"physicalDamageDealt\": 12640,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 18430,\n" +
                        "                \"physicalDamageTaken\": 13967,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 76661,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 6,\n" +
                        "                \"wardsPlaced\": 13,\n" +
                        "                \"perkPrimaryStyle\": 8200,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 60,\n" +
                        "                \"goldEarned\": 10310,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 16,\n" +
                        "                \"doubleKills\": 1,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": true,\n" +
                        "                \"perk0Var1\": 1695,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 2,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 1266,\n" +
                        "                \"totalMinionsKilled\": 144,\n" +
                        "                \"timeCCingOthers\": 34,\n" +
                        "                \"statPerk2\": 5001\n" +
                        "            },\n" +
                        "            \"championId\": 45\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 16,\n" +
                        "                \"visionScore\": 22,\n" +
                        "                \"magicDamageDealtToChampions\": 233,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 34,\n" +
                        "                \"longestTimeSpentLiving\": 301,\n" +
                        "                \"perk1Var1\": 1203,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 400,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8236,\n" +
                        "                \"perk4\": 8226,\n" +
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
                        "                \"perk5Var1\": 28,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 26,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 10899,\n" +
                        "                \"physicalDamageDealtToChampions\": 26013,\n" +
                        "                \"damageDealtToObjectives\": 26826,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 3,\n" +
                        "                \"perk2Var1\": 11,\n" +
                        "                \"perk4Var1\": 250,\n" +
                        "                \"totalDamageTaken\": 24469,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 4,\n" +
                        "                \"largestCriticalStrike\": 1067,\n" +
                        "                \"largestKillingSpree\": 3,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 894,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3006,\n" +
                        "                \"item3\": 3046,\n" +
                        "                \"item0\": 3072,\n" +
                        "                \"item1\": 2421,\n" +
                        "                \"item6\": 3363,\n" +
                        "                \"item4\": 3031,\n" +
                        "                \"item5\": 3508,\n" +
                        "                \"perk1\": 9111,\n" +
                        "                \"perk0\": 8008,\n" +
                        "                \"perk3\": 8014,\n" +
                        "                \"perk2\": 9104,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 595,\n" +
                        "                \"damageSelfMitigated\": 17543,\n" +
                        "                \"magicalDamageTaken\": 7733,\n" +
                        "                \"perk0Var2\": 50,\n" +
                        "                \"firstInhibitorKill\": true,\n" +
                        "                \"trueDamageTaken\": 430,\n" +
                        "                \"assists\": 13,\n" +
                        "                \"perk4Var2\": 927,\n" +
                        "                \"goldSpent\": 15000,\n" +
                        "                \"trueDamageDealt\": 1094,\n" +
                        "                \"participantId\": 5,\n" +
                        "                \"physicalDamageDealt\": 226358,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 26494,\n" +
                        "                \"physicalDamageTaken\": 16305,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": true,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 228347,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 8,\n" +
                        "                \"deaths\": 10,\n" +
                        "                \"wardsPlaced\": 8,\n" +
                        "                \"perkPrimaryStyle\": 8000,\n" +
                        "                \"perkSubStyle\": 8200,\n" +
                        "                \"turretKills\": 4,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 248,\n" +
                        "                \"goldEarned\": 15993,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": true,\n" +
                        "                \"champLevel\": 15,\n" +
                        "                \"doubleKills\": 1,\n" +
                        "                \"inhibitorKills\": 1,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 2,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 0,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 4010,\n" +
                        "                \"totalMinionsKilled\": 202,\n" +
                        "                \"timeCCingOthers\": 1,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"spell1Id\": 7,\n" +
                        "            \"participantId\": 5,\n" +
                        "            \"highestAchievedSeasonTier\": \"GOLD\",\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 100,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 5,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -0.3999999999999999,\n" +
                        "                    \"0-10\": 0.24999999999999978,\n" +
                        "                    \"10-20\": 0.19999999999999973\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 461.8,\n" +
                        "                    \"0-10\": 423.5,\n" +
                        "                    \"10-20\": 585.5\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -16.80000000000004,\n" +
                        "                    \"0-10\": 61.500000000000014,\n" +
                        "                    \"10-20\": 48.75000000000003\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 4.1,\n" +
                        "                    \"0-10\": 7.2,\n" +
                        "                    \"10-20\": 7.699999999999999\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 476.3,\n" +
                        "                    \"0-10\": 372.3,\n" +
                        "                    \"10-20\": 530.8\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_CARRY\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -144.79999999999995,\n" +
                        "                    \"0-10\": -175.59999999999997,\n" +
                        "                    \"10-20\": -137.55\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1216.9,\n" +
                        "                    \"0-10\": 384.8,\n" +
                        "                    \"10-20\": 565.9\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 15\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 24,\n" +
                        "                \"visionScore\": 28,\n" +
                        "                \"magicDamageDealtToChampions\": 17277,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 417,\n" +
                        "                \"longestTimeSpentLiving\": 332,\n" +
                        "                \"perk1Var1\": 9,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8210,\n" +
                        "                \"perk4\": 8226,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 5,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 40,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 28,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 1897,\n" +
                        "                \"physicalDamageDealtToChampions\": 14080,\n" +
                        "                \"damageDealtToObjectives\": 6566,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 4,\n" +
                        "                \"perk2Var1\": 4,\n" +
                        "                \"perk4Var1\": 250,\n" +
                        "                \"totalDamageTaken\": 22843,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 0,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 0,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 40367,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3042,\n" +
                        "                \"item3\": 3025,\n" +
                        "                \"item0\": 2420,\n" +
                        "                \"item1\": 3020,\n" +
                        "                \"item6\": 3363,\n" +
                        "                \"item4\": 3285,\n" +
                        "                \"item5\": 3156,\n" +
                        "                \"perk1\": 8304,\n" +
                        "                \"perk0\": 8359,\n" +
                        "                \"perk3\": 8347,\n" +
                        "                \"perk2\": 8345,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 0,\n" +
                        "                \"damageSelfMitigated\": 17293,\n" +
                        "                \"magicalDamageTaken\": 6233,\n" +
                        "                \"perk0Var2\": 19,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1676,\n" +
                        "                \"assists\": 16,\n" +
                        "                \"perk4Var2\": 2357,\n" +
                        "                \"goldSpent\": 13450,\n" +
                        "                \"trueDamageDealt\": 1581,\n" +
                        "                \"participantId\": 6,\n" +
                        "                \"physicalDamageDealt\": 136359,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 31613,\n" +
                        "                \"physicalDamageTaken\": 14933,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 178307,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 4,\n" +
                        "                \"deaths\": 9,\n" +
                        "                \"wardsPlaced\": 12,\n" +
                        "                \"perkPrimaryStyle\": 8300,\n" +
                        "                \"perkSubStyle\": 8200,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 255,\n" +
                        "                \"goldEarned\": 13808,\n" +
                        "                \"killingSprees\": 0,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 17,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 530,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 0,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 2587,\n" +
                        "                \"totalMinionsKilled\": 202,\n" +
                        "                \"timeCCingOthers\": 10,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"spell1Id\": 4,\n" +
                        "            \"participantId\": 6,\n" +
                        "            \"highestAchievedSeasonTier\": \"GOLD\",\n" +
                        "            \"spell2Id\": 7,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 6,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 0.3999999999999999,\n" +
                        "                    \"0-10\": -0.24999999999999978,\n" +
                        "                    \"10-20\": -0.19999999999999973\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 518.6,\n" +
                        "                    \"0-10\": 288.7,\n" +
                        "                    \"10-20\": 411.9\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 16.80000000000004,\n" +
                        "                    \"0-10\": -61.500000000000014,\n" +
                        "                    \"10-20\": -48.75000000000003\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 4.5,\n" +
                        "                    \"0-10\": 5.6,\n" +
                        "                    \"10-20\": 7.6\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 605.3,\n" +
                        "                    \"0-10\": 323.9,\n" +
                        "                    \"10-20\": 570.7\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_CARRY\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 144.79999999999995,\n" +
                        "                    \"0-10\": 175.59999999999997,\n" +
                        "                    \"10-20\": 137.55\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 822,\n" +
                        "                    \"0-10\": 461.40000000000003,\n" +
                        "                    \"10-20\": 619.7\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 81\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 4,\n" +
                        "            \"participantId\": 7,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"TOP\",\n" +
                        "                \"participantId\": 7,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 393.5,\n" +
                        "                    \"0-10\": 260,\n" +
                        "                    \"10-20\": 356\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 3.9,\n" +
                        "                    \"0-10\": 5.4,\n" +
                        "                    \"10-20\": 5.8\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 408.4,\n" +
                        "                    \"0-10\": 405.9,\n" +
                        "                    \"10-20\": 488.8\n" +
                        "                },\n" +
                        "                \"role\": \"DUO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1749.1999999999998,\n" +
                        "                    \"0-10\": 468.8,\n" +
                        "                    \"10-20\": 1108.2\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 12,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 9,\n" +
                        "                \"visionScore\": 22,\n" +
                        "                \"magicDamageDealtToChampions\": 1225,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 199,\n" +
                        "                \"longestTimeSpentLiving\": 408,\n" +
                        "                \"perk1Var1\": 10,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 3,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8135,\n" +
                        "                \"perk4\": 8139,\n" +
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
                        "                \"perk5Var1\": 4619,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 5,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 17,\n" +
                        "                \"statPerk1\": 5002,\n" +
                        "                \"statPerk0\": 5005,\n" +
                        "                \"damageDealtToTurrets\": 4239,\n" +
                        "                \"physicalDamageDealtToChampions\": 9359,\n" +
                        "                \"damageDealtToObjectives\": 7291,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 4,\n" +
                        "                \"perk4Var1\": 1167,\n" +
                        "                \"totalDamageTaken\": 40323,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 4,\n" +
                        "                \"largestCriticalStrike\": 382,\n" +
                        "                \"largestKillingSpree\": 0,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 8044,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3144,\n" +
                        "                \"item3\": 3046,\n" +
                        "                \"item0\": 2033,\n" +
                        "                \"item1\": 3022,\n" +
                        "                \"item6\": 3340,\n" +
                        "                \"item4\": 3006,\n" +
                        "                \"item5\": 3124,\n" +
                        "                \"perk1\": 8304,\n" +
                        "                \"perk0\": 8359,\n" +
                        "                \"perk3\": 8352,\n" +
                        "                \"perk2\": 8345,\n" +
                        "                \"perk3Var3\": 1232,\n" +
                        "                \"perk3Var2\": 2650,\n" +
                        "                \"perk3Var1\": 468,\n" +
                        "                \"damageSelfMitigated\": 18530,\n" +
                        "                \"magicalDamageTaken\": 7091,\n" +
                        "                \"perk0Var2\": 21,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1228,\n" +
                        "                \"assists\": 8,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 11925,\n" +
                        "                \"trueDamageDealt\": 39296,\n" +
                        "                \"participantId\": 7,\n" +
                        "                \"physicalDamageDealt\": 89579,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 16767,\n" +
                        "                \"physicalDamageTaken\": 32003,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 136921,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 4,\n" +
                        "                \"deaths\": 11,\n" +
                        "                \"wardsPlaced\": 13,\n" +
                        "                \"perkPrimaryStyle\": 8300,\n" +
                        "                \"perkSubStyle\": 8100,\n" +
                        "                \"turretKills\": 2,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 6182,\n" +
                        "                \"goldEarned\": 12208,\n" +
                        "                \"killingSprees\": 0,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 15,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 790,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 3,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 10442,\n" +
                        "                \"totalMinionsKilled\": 171,\n" +
                        "                \"timeCCingOthers\": 17,\n" +
                        "                \"statPerk2\": 5001\n" +
                        "            },\n" +
                        "            \"championId\": 67\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 4,\n" +
                        "                \"visionScore\": 17,\n" +
                        "                \"magicDamageDealtToChampions\": 5819,\n" +
                        "                \"largestMultiKill\": 1,\n" +
                        "                \"totalTimeCrowdControlDealt\": 169,\n" +
                        "                \"longestTimeSpentLiving\": 618,\n" +
                        "                \"perk1Var1\": 2875,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8014,\n" +
                        "                \"perk4\": 9105,\n" +
                        "                \"playerScore9\": 6,\n" +
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
                        "                \"perk5Var1\": 552,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 12,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 6470,\n" +
                        "                \"physicalDamageDealtToChampions\": 13664,\n" +
                        "                \"damageDealtToObjectives\": 8671,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 2061,\n" +
                        "                \"perk4Var1\": 16,\n" +
                        "                \"totalDamageTaken\": 35213,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 3,\n" +
                        "                \"largestCriticalStrike\": 16,\n" +
                        "                \"largestKillingSpree\": 6,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 8747,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3742,\n" +
                        "                \"item3\": 3111,\n" +
                        "                \"item0\": 3800,\n" +
                        "                \"item1\": 3071,\n" +
                        "                \"item6\": 3340,\n" +
                        "                \"item4\": 3053,\n" +
                        "                \"item5\": 3076,\n" +
                        "                \"perk1\": 8446,\n" +
                        "                \"perk0\": 8437,\n" +
                        "                \"perk3\": 8453,\n" +
                        "                \"perk2\": 8444,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 79,\n" +
                        "                \"perk3Var1\": 292,\n" +
                        "                \"damageSelfMitigated\": 64768,\n" +
                        "                \"magicalDamageTaken\": 11019,\n" +
                        "                \"perk0Var2\": 513,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 2597,\n" +
                        "                \"assists\": 8,\n" +
                        "                \"perk4Var2\": 40,\n" +
                        "                \"goldSpent\": 16700,\n" +
                        "                \"trueDamageDealt\": 5406,\n" +
                        "                \"participantId\": 8,\n" +
                        "                \"physicalDamageDealt\": 143183,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 22422,\n" +
                        "                \"physicalDamageTaken\": 21596,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 157337,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 4,\n" +
                        "                \"deaths\": 4,\n" +
                        "                \"wardsPlaced\": 9,\n" +
                        "                \"perkPrimaryStyle\": 8400,\n" +
                        "                \"perkSubStyle\": 8000,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 2938,\n" +
                        "                \"goldEarned\": 15458,\n" +
                        "                \"killingSprees\": 2,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 18,\n" +
                        "                \"doubleKills\": 0,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 717,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 0,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 730,\n" +
                        "                \"totalMinionsKilled\": 237,\n" +
                        "                \"timeCCingOthers\": 30,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"spell1Id\": 14,\n" +
                        "            \"participantId\": 8,\n" +
                        "            \"highestAchievedSeasonTier\": \"GOLD\",\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"TOP\",\n" +
                        "                \"participantId\": 8,\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 444,\n" +
                        "                    \"0-10\": 298.79999999999995,\n" +
                        "                    \"10-20\": 570.1\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 4.1,\n" +
                        "                    \"0-10\": 8.4,\n" +
                        "                    \"10-20\": 9.7\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 518.3,\n" +
                        "                    \"0-10\": 451.3,\n" +
                        "                    \"10-20\": 663.9\n" +
                        "                },\n" +
                        "                \"role\": \"DUO\",\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1640.1999999999998,\n" +
                        "                    \"0-10\": 398.5,\n" +
                        "                    \"10-20\": 924.7\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"championId\": 86\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 4,\n" +
                        "            \"participantId\": 9,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"BOTTOM\",\n" +
                        "                \"participantId\": 9,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 0.3999999999999999,\n" +
                        "                    \"0-10\": -0.24999999999999978,\n" +
                        "                    \"10-20\": -0.19999999999999973\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 240,\n" +
                        "                    \"0-10\": 209.9,\n" +
                        "                    \"10-20\": 288.8\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 16.80000000000004,\n" +
                        "                    \"0-10\": -61.500000000000014,\n" +
                        "                    \"10-20\": -48.75000000000003\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 2.7,\n" +
                        "                    \"0-10\": 1.7000000000000002,\n" +
                        "                    \"10-20\": 2\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 445.4,\n" +
                        "                    \"0-10\": 295.6,\n" +
                        "                    \"10-20\": 350.5\n" +
                        "                },\n" +
                        "                \"role\": \"DUO_SUPPORT\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": 144.79999999999995,\n" +
                        "                    \"0-10\": 175.59999999999997,\n" +
                        "                    \"10-20\": 137.55\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1564.1999999999998,\n" +
                        "                    \"0-10\": 524.2,\n" +
                        "                    \"10-20\": 867.1\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 14,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 0,\n" +
                        "                \"visionScore\": 49,\n" +
                        "                \"magicDamageDealtToChampions\": 7426,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 319,\n" +
                        "                \"longestTimeSpentLiving\": 411,\n" +
                        "                \"perk1Var1\": 190,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8347,\n" +
                        "                \"perk4\": 8313,\n" +
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
                        "                \"perk5Var1\": 0,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 0,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 0,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 0,\n" +
                        "                \"physicalDamageDealtToChampions\": 1669,\n" +
                        "                \"damageDealtToObjectives\": 1165,\n" +
                        "                \"perk2Var2\": 0,\n" +
                        "                \"perk2Var3\": 0,\n" +
                        "                \"totalUnitsHealed\": 5,\n" +
                        "                \"perk2Var1\": 738,\n" +
                        "                \"perk4Var1\": 0,\n" +
                        "                \"totalDamageTaken\": 32174,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 2,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 2,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 29948,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 2055,\n" +
                        "                \"item3\": 3068,\n" +
                        "                \"item0\": 3117,\n" +
                        "                \"item1\": 3401,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 1031,\n" +
                        "                \"item5\": 1011,\n" +
                        "                \"perk1\": 8401,\n" +
                        "                \"perk0\": 8439,\n" +
                        "                \"perk3\": 8242,\n" +
                        "                \"perk2\": 8473,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 0,\n" +
                        "                \"perk3Var1\": 13,\n" +
                        "                \"damageSelfMitigated\": 37215,\n" +
                        "                \"magicalDamageTaken\": 11695,\n" +
                        "                \"perk0Var2\": 0,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 1588,\n" +
                        "                \"assists\": 11,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 8300,\n" +
                        "                \"trueDamageDealt\": 14885,\n" +
                        "                \"participantId\": 9,\n" +
                        "                \"physicalDamageDealt\": 12641,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 10493,\n" +
                        "                \"physicalDamageTaken\": 18890,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 57475,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 0,\n" +
                        "                \"deaths\": 12,\n" +
                        "                \"wardsPlaced\": 28,\n" +
                        "                \"perkPrimaryStyle\": 8400,\n" +
                        "                \"perkSubStyle\": 8300,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 1398,\n" +
                        "                \"goldEarned\": 8650,\n" +
                        "                \"killingSprees\": 1,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 14,\n" +
                        "                \"doubleKills\": 1,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 794,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 10,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 1680,\n" +
                        "                \"totalMinionsKilled\": 72,\n" +
                        "                \"timeCCingOthers\": 46,\n" +
                        "                \"statPerk2\": 5001\n" +
                        "            },\n" +
                        "            \"championId\": 111\n" +
                        "        },\n" +
                        "        {\n" +
                        "            \"spell1Id\": 11,\n" +
                        "            \"participantId\": 10,\n" +
                        "            \"timeline\": {\n" +
                        "                \"lane\": \"JUNGLE\",\n" +
                        "                \"participantId\": 10,\n" +
                        "                \"csDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -1.3000000000000003,\n" +
                        "                    \"0-10\": 0.19999999999999998,\n" +
                        "                    \"10-20\": -0.4\n" +
                        "                },\n" +
                        "                \"goldPerMinDeltas\": {\n" +
                        "                    \"20-30\": 458.1,\n" +
                        "                    \"0-10\": 427.6,\n" +
                        "                    \"10-20\": 457.5\n" +
                        "                },\n" +
                        "                \"xpDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -262.70000000000005,\n" +
                        "                    \"0-10\": 127.5,\n" +
                        "                    \"10-20\": -164.5\n" +
                        "                },\n" +
                        "                \"creepsPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1.3,\n" +
                        "                    \"0-10\": 0.3,\n" +
                        "                    \"10-20\": 0.4\n" +
                        "                },\n" +
                        "                \"xpPerMinDeltas\": {\n" +
                        "                    \"20-30\": 375.59999999999997,\n" +
                        "                    \"0-10\": 368.70000000000005,\n" +
                        "                    \"10-20\": 439\n" +
                        "                },\n" +
                        "                \"role\": \"NONE\",\n" +
                        "                \"damageTakenDiffPerMinDeltas\": {\n" +
                        "                    \"20-30\": -178.20000000000005,\n" +
                        "                    \"0-10\": 65.89999999999995,\n" +
                        "                    \"10-20\": -343.4\n" +
                        "                },\n" +
                        "                \"damageTakenPerMinDeltas\": {\n" +
                        "                    \"20-30\": 1165.9,\n" +
                        "                    \"0-10\": 716.4,\n" +
                        "                    \"10-20\": 829.5\n" +
                        "                }\n" +
                        "            },\n" +
                        "            \"spell2Id\": 4,\n" +
                        "            \"teamId\": 200,\n" +
                        "            \"stats\": {\n" +
                        "                \"neutralMinionsKilledTeamJungle\": 58,\n" +
                        "                \"visionScore\": 28,\n" +
                        "                \"magicDamageDealtToChampions\": 2219,\n" +
                        "                \"largestMultiKill\": 2,\n" +
                        "                \"totalTimeCrowdControlDealt\": 133,\n" +
                        "                \"longestTimeSpentLiving\": 761,\n" +
                        "                \"perk1Var1\": 648,\n" +
                        "                \"perk1Var3\": 0,\n" +
                        "                \"perk1Var2\": 0,\n" +
                        "                \"tripleKills\": 0,\n" +
                        "                \"perk5\": 8232,\n" +
                        "                \"perk4\": 8275,\n" +
                        "                \"playerScore9\": 0,\n" +
                        "                \"playerScore8\": 0,\n" +
                        "                \"kills\": 17,\n" +
                        "                \"playerScore1\": 0,\n" +
                        "                \"playerScore0\": 0,\n" +
                        "                \"playerScore3\": 0,\n" +
                        "                \"playerScore2\": 0,\n" +
                        "                \"playerScore5\": 0,\n" +
                        "                \"playerScore4\": 0,\n" +
                        "                \"playerScore7\": 0,\n" +
                        "                \"playerScore6\": 0,\n" +
                        "                \"perk5Var1\": 5,\n" +
                        "                \"perk5Var3\": 0,\n" +
                        "                \"perk5Var2\": 20,\n" +
                        "                \"totalScoreRank\": 0,\n" +
                        "                \"neutralMinionsKilled\": 99,\n" +
                        "                \"statPerk1\": 5008,\n" +
                        "                \"statPerk0\": 5008,\n" +
                        "                \"damageDealtToTurrets\": 0,\n" +
                        "                \"physicalDamageDealtToChampions\": 20144,\n" +
                        "                \"damageDealtToObjectives\": 13358,\n" +
                        "                \"perk2Var2\": 2,\n" +
                        "                \"perk2Var3\": 1,\n" +
                        "                \"totalUnitsHealed\": 1,\n" +
                        "                \"perk2Var1\": 1,\n" +
                        "                \"perk4Var1\": 14,\n" +
                        "                \"totalDamageTaken\": 30685,\n" +
                        "                \"perk4Var3\": 0,\n" +
                        "                \"wardsKilled\": 7,\n" +
                        "                \"largestCriticalStrike\": 0,\n" +
                        "                \"largestKillingSpree\": 10,\n" +
                        "                \"quadraKills\": 0,\n" +
                        "                \"magicDamageDealt\": 6136,\n" +
                        "                \"firstBloodAssist\": false,\n" +
                        "                \"item2\": 3047,\n" +
                        "                \"item3\": 3147,\n" +
                        "                \"item0\": 1412,\n" +
                        "                \"item1\": 3142,\n" +
                        "                \"item6\": 3364,\n" +
                        "                \"item4\": 3812,\n" +
                        "                \"item5\": 1031,\n" +
                        "                \"perk1\": 8143,\n" +
                        "                \"perk0\": 8112,\n" +
                        "                \"perk3\": 8105,\n" +
                        "                \"perk2\": 8120,\n" +
                        "                \"perk3Var3\": 0,\n" +
                        "                \"perk3Var2\": 5,\n" +
                        "                \"perk3Var1\": 15,\n" +
                        "                \"damageSelfMitigated\": 20042,\n" +
                        "                \"magicalDamageTaken\": 7428,\n" +
                        "                \"perk0Var2\": 0,\n" +
                        "                \"firstInhibitorKill\": false,\n" +
                        "                \"trueDamageTaken\": 2072,\n" +
                        "                \"assists\": 8,\n" +
                        "                \"perk4Var2\": 0,\n" +
                        "                \"goldSpent\": 14275,\n" +
                        "                \"trueDamageDealt\": 4108,\n" +
                        "                \"participantId\": 10,\n" +
                        "                \"physicalDamageDealt\": 110011,\n" +
                        "                \"sightWardsBoughtInGame\": 0,\n" +
                        "                \"totalDamageDealtToChampions\": 22823,\n" +
                        "                \"physicalDamageTaken\": 21183,\n" +
                        "                \"totalPlayerScore\": 0,\n" +
                        "                \"win\": false,\n" +
                        "                \"objectivePlayerScore\": 0,\n" +
                        "                \"totalDamageDealt\": 120256,\n" +
                        "                \"neutralMinionsKilledEnemyJungle\": 17,\n" +
                        "                \"deaths\": 10,\n" +
                        "                \"wardsPlaced\": 3,\n" +
                        "                \"perkPrimaryStyle\": 8100,\n" +
                        "                \"perkSubStyle\": 8200,\n" +
                        "                \"turretKills\": 0,\n" +
                        "                \"firstBloodKill\": false,\n" +
                        "                \"trueDamageDealtToChampions\": 459,\n" +
                        "                \"goldEarned\": 14829,\n" +
                        "                \"killingSprees\": 4,\n" +
                        "                \"unrealKills\": 0,\n" +
                        "                \"firstTowerAssist\": false,\n" +
                        "                \"firstTowerKill\": false,\n" +
                        "                \"champLevel\": 15,\n" +
                        "                \"doubleKills\": 4,\n" +
                        "                \"inhibitorKills\": 0,\n" +
                        "                \"firstInhibitorAssist\": false,\n" +
                        "                \"perk0Var1\": 1844,\n" +
                        "                \"combatPlayerScore\": 0,\n" +
                        "                \"perk0Var3\": 0,\n" +
                        "                \"visionWardsBoughtInGame\": 4,\n" +
                        "                \"pentaKills\": 0,\n" +
                        "                \"totalHeal\": 8641,\n" +
                        "                \"totalMinionsKilled\": 21,\n" +
                        "                \"timeCCingOthers\": 8,\n" +
                        "                \"statPerk2\": 5002\n" +
                        "            },\n" +
                        "            \"championId\": 121\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"gameDuration\": 1994,\n" +
                        "    \"gameCreation\": 1561739744506\n" +
                        "}"
        ).toString();
    }
}
