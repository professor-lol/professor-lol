package com.ccs.professorlol.lolInfo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLolInfo is a Querydsl query type for LolInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLolInfo extends EntityPathBase<LolInfo> {

    private static final long serialVersionUID = -1025297548L;

    public static final QLolInfo lolInfo = new QLolInfo("lolInfo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath patchNoteVersion = createString("patchNoteVersion");

    public QLolInfo(String variable) {
        super(LolInfo.class, forVariable(variable));
    }

    public QLolInfo(Path<? extends LolInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLolInfo(PathMetadata metadata) {
        super(LolInfo.class, metadata);
    }

}

