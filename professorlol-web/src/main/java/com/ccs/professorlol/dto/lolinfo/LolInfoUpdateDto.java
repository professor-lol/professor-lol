package com.ccs.professorlol.dto.lolinfo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nonnull;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LolInfoUpdateDto {

    @Nonnull
    private String savedPatchVersion;
    @Nonnull
    private String changePatchVersion;

    @Builder
    public LolInfoUpdateDto(@Nonnull String savedPatchVersion, @Nonnull String changePatchVersion) {
        this.savedPatchVersion = savedPatchVersion;
        this.changePatchVersion = changePatchVersion;
    }
}
