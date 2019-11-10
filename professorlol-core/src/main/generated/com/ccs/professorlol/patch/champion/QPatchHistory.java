package com.ccs.professorlol.patch.champion;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPatchHistory is a Querydsl query type for PatchHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPatchHistory extends EntityPathBase<PatchHistory> {

    private static final long serialVersionUID = 1045020895L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPatchHistory patchHistory = new QPatchHistory("patchHistory");

    public final com.ccs.professorlol.lolInfo.champion.QChampion champion;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath patchVersion = createString("patchVersion");

    public QPatchHistory(String variable) {
        this(PatchHistory.class, forVariable(variable), INITS);
    }

    public QPatchHistory(Path<? extends PatchHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPatchHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPatchHistory(PathMetadata metadata, PathInits inits) {
        this(PatchHistory.class, metadata, inits);
    }

    public QPatchHistory(Class<? extends PatchHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.champion = inits.isInitialized("champion") ? new com.ccs.professorlol.lolInfo.champion.QChampion(forProperty("champion")) : null;
    }

}

