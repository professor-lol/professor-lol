package com.ccs.professorlol.lolInfo.champion;

import com.ccs.professorlol.lolInfo.exception.AlreadySavedException;
import com.ccs.professorlol.time.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * example
 * "id": "Ashe"
 * "key": "22"
 * "name": "애쉬"
 */
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String riotId;
    @Setter
    private String key;
    @Setter
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "stat_id")
    private List<Stat> stats = new ArrayList<>();


    @Builder
    public Champion(String riotId, String key, String name) {
        this.riotId = riotId;
        this.key = key;
        this.name = name;
    }

    public void addStat(Stat stat) {
        //TODO validation
        this.stats.add(stat);
    }

    public Stat getLatestStat() {
        return stats.stream()
                .min(BaseTimeEntity::compareTo)
                .orElseThrow(RuntimeException::new);
    }

    public void alreadySavedException() {
        throw new AlreadySavedException(this.name);
    }

}
