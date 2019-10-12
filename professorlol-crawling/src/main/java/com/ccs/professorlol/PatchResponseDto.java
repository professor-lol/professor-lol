package com.ccs.professorlol;

import lombok.Getter;

import java.util.List;

@Getter
public class PatchResponseDto<T> {
    private String patchVersion;
    private List<T> patch;

    public PatchResponseDto(String patchVersion, List<T> patch) {
        this.patchVersion = patchVersion;
        this.patch = patch;
    }

}
