package com.ccs.professorlol.patch.champion;

import com.ccs.professorlol.lolInfo.domain.LolInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "history_type")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class PatchHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lol_info_id")
    private LolInfo lolInfo;

    private String patchVersion;

    protected PatchHistory(LolInfo lolInfo, String patchVersion) {
        this.lolInfo = lolInfo;
        this.patchVersion = patchVersion;
    }

}