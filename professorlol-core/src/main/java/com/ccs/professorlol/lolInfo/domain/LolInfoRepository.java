package com.ccs.professorlol.lolInfo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LolInfoRepository extends JpaRepository<LolInfo, Long> {
    List<LolInfo> findAllByChampionNamesIn(List<String> championNames);

}
