package com.ccs.professorlol.lolInfo.champion;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String riotId;
    private String key;
    private String name;

    @OneToMany(mappedBy = "champion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Stat> stats;

    @OneToMany(mappedBy = "champion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MostChampion> mostChampion;

    @Builder
    public Champion(String riotId, String key, String name) {
        this.riotId = riotId;
        this.key = key;
        this.name = name;
    }
}
