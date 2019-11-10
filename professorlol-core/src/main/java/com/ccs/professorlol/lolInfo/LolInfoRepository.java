package com.ccs.professorlol.lolInfo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LolInfoRepository extends JpaRepository<LolInfo, Long> {
    Optional<LolInfo> findByPatchNoteVersion(String patchNoteVersion);
}
