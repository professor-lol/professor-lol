package com.ccs.professorlol.patch.skill;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChampionAbilityHistory is a Querydsl query type for ChampionAbilityHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChampionAbilityHistory extends EntityPathBase<ChampionAbilityHistory> {

    private static final long serialVersionUID = -1957805758L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChampionAbilityHistory championAbilityHistory = new QChampionAbilityHistory("championAbilityHistory");

    public final ListPath<ChampionAttributeHistory, QChampionAttributeHistory> championAttributeHistories = this.<ChampionAttributeHistory, QChampionAttributeHistory>createList("championAttributeHistories", ChampionAttributeHistory.class, QChampionAttributeHistory.class, PathInits.DIRECT2);

    public final com.ccs.professorlol.patch.champion.QChampionPatchHistory championPatchHistory;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath image = createString("image");

    public final EnumPath<com.ccs.professorlol.type.SkillType> skillType = createEnum("skillType", com.ccs.professorlol.type.SkillType.class);

    public final StringPath title = createString("title");

    public QChampionAbilityHistory(String variable) {
        this(ChampionAbilityHistory.class, forVariable(variable), INITS);
    }

    public QChampionAbilityHistory(Path<? extends ChampionAbilityHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChampionAbilityHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChampionAbilityHistory(PathMetadata metadata, PathInits inits) {
        this(ChampionAbilityHistory.class, metadata, inits);
    }

    public QChampionAbilityHistory(Class<? extends ChampionAbilityHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.championPatchHistory = inits.isInitialized("championPatchHistory") ? new com.ccs.professorlol.patch.champion.QChampionPatchHistory(forProperty("championPatchHistory"), inits.get("championPatchHistory")) : null;
    }

}

