package com.ccs.professorlol.lolInfo.champion;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMostChampion is a Querydsl query type for MostChampion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMostChampion extends EntityPathBase<MostChampion> {

    private static final long serialVersionUID = -714617906L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMostChampion mostChampion = new QMostChampion("mostChampion");

    public final QChampion champion;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.ccs.professorlol.member.domain.QMember member;

    public QMostChampion(String variable) {
        this(MostChampion.class, forVariable(variable), INITS);
    }

    public QMostChampion(Path<? extends MostChampion> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMostChampion(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMostChampion(PathMetadata metadata, PathInits inits) {
        this(MostChampion.class, metadata, inits);
    }

    public QMostChampion(Class<? extends MostChampion> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.champion = inits.isInitialized("champion") ? new QChampion(forProperty("champion")) : null;
        this.member = inits.isInitialized("member") ? new com.ccs.professorlol.member.domain.QMember(forProperty("member")) : null;
    }

}

