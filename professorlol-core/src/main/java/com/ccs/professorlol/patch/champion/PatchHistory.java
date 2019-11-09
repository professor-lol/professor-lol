package com.ccs.professorlol.patch.champion;

import com.ccs.professorlol.lolInfo.LolInfo;
import com.ccs.professorlol.lolInfo.champion.Champion;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "history_type")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class PatchHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "champion_id")
    private Champion champion;

    private String patchVersion;

    protected PatchHistory(Champion champion, String patchVersion) {
        this.champion = champion;
        this.patchVersion = patchVersion;
    }

}