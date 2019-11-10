package com.ccs.professorlol.lolInfo.champion;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChampion is a Querydsl query type for Champion
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QChampion extends EntityPathBase<Champion> {

    private static final long serialVersionUID = -1366290389L;

    public static final QChampion champion = new QChampion("champion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath key = createString("key");

    public final ListPath<MostChampion, QMostChampion> mostChampion = this.<MostChampion, QMostChampion>createList("mostChampion", MostChampion.class, QMostChampion.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath riotId = createString("riotId");

    public final ListPath<Stat, QStat> stats = this.<Stat, QStat>createList("stats", Stat.class, QStat.class, PathInits.DIRECT2);

    public QChampion(String variable) {
        super(Champion.class, forVariable(variable));
    }

    public QChampion(Path<? extends Champion> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChampion(PathMetadata metadata) {
        super(Champion.class, metadata);
    }

}

