package com.css.professorlol.patch;

import com.css.professorlol.lolInfo.domain.LolInfo;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "history_type")
public abstract class PatchHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LolInfo lolInfo;
    private String patchVersion;
    private String contents;



}
