package com.ccs.professorlol.schdule;

import com.ccs.professorlol.service.LolInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Schedule {

    private final LolInfoService lolInfoService;

    @Scheduled(cron = "* 0 * * *")
    public void scheduleLolStaticData() {
        lolInfoService.saveDdragonData();
    }

}
