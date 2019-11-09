package com.ccs.professorlol.lolInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LolInfoRepository extends JpaRepository<LolInfo, Long> {
//    List<LolInfo> findAllByChampionNamesIn(List<String> championNames);
}
