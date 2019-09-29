package com.ccs.professorlol.lolInfo.domain.champion;

import lombok.Getter;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Getter
public class Champion {
    private String id;
    private Integer key;
    private String name;
    @Embedded
    private Stats stats;
}
