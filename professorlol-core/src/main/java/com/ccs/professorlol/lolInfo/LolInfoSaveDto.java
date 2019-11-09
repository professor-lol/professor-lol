package com.ccs.professorlol.lolInfo;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LolInfoSaveDto {
    private String patchNoteVersion;

    @Builder
    public LolInfoSaveDto(String patchNoteVersion) {
        this.patchNoteVersion = patchNoteVersion;
    }

    public LolInfo toEntity() {
        return LolInfo.builder()
                .patchNoteVersion(this.patchNoteVersion)
                .build();
    }
}
