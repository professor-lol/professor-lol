package com.ccs.professorlol.summoner.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSummoner is a Querydsl query type for Summoner
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSummoner extends EntityPathBase<Summoner> {

    private static final long serialVersionUID = -1417273884L;

    public static final QSummoner summoner = new QSummoner("summoner");

    public final StringPath accountId = createString("accountId");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath thirdPartyId = createString("thirdPartyId");

    public final EnumPath<Tier> tier = createEnum("tier", Tier.class);

    public QSummoner(String variable) {
        super(Summoner.class, forVariable(variable));
    }

    public QSummoner(Path<? extends Summoner> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSummoner(PathMetadata metadata) {
        super(Summoner.class, metadata);
    }

}

