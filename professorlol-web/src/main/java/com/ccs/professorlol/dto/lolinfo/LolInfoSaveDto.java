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

    @NotBlank
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

    public static LolInfo makeLolInfo(String currentChampionVersion) {
        return LolInfoSaveDto.builder()
                .patchNoteVersion(currentChampionVersion)
                .build()
                .toEntity();
    }
}
