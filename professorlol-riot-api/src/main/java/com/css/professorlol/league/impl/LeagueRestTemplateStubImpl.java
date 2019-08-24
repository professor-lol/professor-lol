package com.css.professorlol.league.impl;

import com.css.professorlol.league.LeagueRestTemplate;
import com.css.professorlol.league.dto.LeagueEntryDto;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
public class LeagueRestTemplateStubImpl implements LeagueRestTemplate {

    public LeagueRestTemplateStubImpl() {
        log.info("Stub LeagueRestTemplate created.");
    }

    @Override
    public Set<LeagueEntryDto> getLeagueEntries(String encryptedSummonerId) {
        LeagueEntryDto solo = LeagueEntryDto.stubBuilder()
                .queueType("RANKED_SOLO_5x5")
                .summonerName("뱅기현")
                .hotStreak(false)
                .wins(66)
                .veteran(false)
                .losses(69)
                .rank("III")
                .tier("GOLD")
                .inactive(false)
                .freshBlood(false)
                .leagueId("6e725740-2851-11e9-96cb-c81f66e3887d")
                .summonerId("wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg")
                .leaguePoints(34)
                .build();
        LeagueEntryDto free = LeagueEntryDto.stubBuilder()
                .queueType("RANKED_FLEX_SR")
                .summonerName("뱅기현")
                .hotStreak(true)
                .wins(30)
                .veteran(false)
                .losses(25)
                .rank("I")
                .tier("SILVER")
                .inactive(false)
                .freshBlood(false)
                .leagueId("277294d0-20b9-11e9-9366-c81f66e3887d")
                .summonerId("wUIpM_FpV6kGdN15plnbstnSBbh33CFxoHJgdkhbaa4GCg")
                .leaguePoints(27)
                .build();
        return new HashSet<>(Arrays.asList(solo, free));
    }

}