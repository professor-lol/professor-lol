package com.css.riotapi.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "riot.uri")
@Getter
@Setter
@Component
public class RiotURIProperties {
    private String host;
    private String leagueEntryBySummoner;
    private String summonerByName;
    private String matchListByAccount;
    private String matchByMatchId;
    private String thirdPartyCode;
}
