package com.ccs.professorlol.dto.lolinfo;

import com.ccs.professorlol.lolInfo.LolInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LolInfoResDto {
    private String patchNoteVersion;

    private LolInfoResDto(String patchNoteVersion) {
        this.patchNoteVersion = patchNoteVersion;
    }

    public static LolInfoResDto of(LolInfo lolInfo) {
        return new LolInfoResDto(lolInfo.getPatchNoteVersion());
    }
}
