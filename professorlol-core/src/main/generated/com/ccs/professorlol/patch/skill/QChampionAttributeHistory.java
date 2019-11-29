package com.ccs.professorlol.patch.skill;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChampionAttributeHistory is a Querydsl query type for ChampionAttributeHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChampionAttributeHistory extends EntityPathBase<ChampionAttributeHistory> {

    private static final long serialVersionUID = 731265424L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChampionAttributeHistory championAttributeHistory = new QChampionAttributeHistory("championAttributeHistory");

    public final StringPath afterContent = createString("afterContent");

    public final StringPath attribute = createString("attribute");

    public final EnumPath<com.ccs.professorlol.type.AttributeType> attributeType = createEnum("attributeType", com.ccs.professorlol.type.AttributeType.class);

    public final StringPath beforeContent = createString("beforeContent");

    public final QChampionAbilityHistory championAbilityHistory;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QChampionAttributeHistory(String variable) {
        this(ChampionAttributeHistory.class, forVariable(variable), INITS);
    }

    public QChampionAttributeHistory(Path<? extends ChampionAttributeHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChampionAttributeHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChampionAttributeHistory(PathMetadata metadata, PathInits inits) {
        this(ChampionAttributeHistory.class, metadata, inits);
    }

    public QChampionAttributeHistory(Class<? extends ChampionAttributeHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.championAbilityHistory = inits.isInitialized("championAbilityHistory") ? new QChampionAbilityHistory(forProperty("championAbilityHistory"), inits.get("championAbilityHistory")) : null;
    }

}

