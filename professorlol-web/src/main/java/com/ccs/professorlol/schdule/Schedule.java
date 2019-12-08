package com.ccs.professorlol.schdule;

import com.ccs.professorlol.service.DdragronService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Schedule {

    private final DdragronService ddragronService;

    @Scheduled(cron = "0 0 1 ? * *")
    public void scheduleLolStaticData() {
        ddragronService.saveDdragonData();
    }

}
