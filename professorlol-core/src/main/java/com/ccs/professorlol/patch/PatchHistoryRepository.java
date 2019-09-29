package com.ccs.professorlol.patch;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PatchHistoryRepository<T extends PatchHistory> extends JpaRepository<T, Long> {
    boolean existsByPatchVersion(String patchVersion);
}
