package com.ccs.professorlol.dto.lolinfo;

import com.ccs.professorlol.lolInfo.LolInfo;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LolInfoSaveDto {

    @Builder
    private LolInfoSaveDto(String patchNoteVersion) {
        this.patchNoteVersion = patchNoteVersion;
    }

    @NotBlank
    private String patchNoteVersion;

    public static LolInfo makeLolInfo(String currentChampionVersion) {
        return LolInfoSaveDto.builder()
                .patchNoteVersion(currentChampionVersion)
                .build()
                .toEntity();
    }

    public LolInfo toEntity() {
        return LolInfo.builder()
                .patchNoteVersion(this.patchNoteVersion)
                .build();
    }
}
