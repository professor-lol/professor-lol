package com.ccs.professorlol.patch.champion;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChampionPatchHistory is a Querydsl query type for ChampionPatchHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChampionPatchHistory extends EntityPathBase<ChampionPatchHistory> {

    private static final long serialVersionUID = -804757272L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChampionPatchHistory championPatchHistory = new QChampionPatchHistory("championPatchHistory");

    public final QPatchHistory _super;

    // inherited
    public final com.ccs.professorlol.lolInfo.champion.QChampion champion;

    public final ListPath<com.ccs.professorlol.patch.skill.ChampionAbilityHistory, com.ccs.professorlol.patch.skill.QChampionAbilityHistory> championAbilityHistories = this.<com.ccs.professorlol.patch.skill.ChampionAbilityHistory, com.ccs.professorlol.patch.skill.QChampionAbilityHistory>createList("championAbilityHistories", com.ccs.professorlol.patch.skill.ChampionAbilityHistory.class, com.ccs.professorlol.patch.skill.QChampionAbilityHistory.class, PathInits.DIRECT2);

    public final StringPath championName = createString("championName");

    public final StringPath context = createString("context");

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath patchVersion;

    public final StringPath summary = createString("summary");

    public QChampionPatchHistory(String variable) {
        this(ChampionPatchHistory.class, forVariable(variable), INITS);
    }

    public QChampionPatchHistory(Path<? extends ChampionPatchHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChampionPatchHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChampionPatchHistory(PathMetadata metadata, PathInits inits) {
        this(ChampionPatchHistory.class, metadata, inits);
    }

    public QChampionPatchHistory(Class<? extends ChampionPatchHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QPatchHistory(type, metadata, inits);
        this.champion = _super.champion;
        this.id = _super.id;
        this.patchVersion = _super.patchVersion;
    }

}

