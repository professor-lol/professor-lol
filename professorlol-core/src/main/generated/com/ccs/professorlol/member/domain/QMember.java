package com.ccs.professorlol.member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1224446972L;

    public static final QMember member = new QMember("member1");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<MemberType> memberType = createEnum("memberType", MemberType.class);

    public final ListPath<com.ccs.professorlol.lolInfo.champion.MostChampion, com.ccs.professorlol.lolInfo.champion.QMostChampion> mostChampions = this.<com.ccs.professorlol.lolInfo.champion.MostChampion, com.ccs.professorlol.lolInfo.champion.QMostChampion>createList("mostChampions", com.ccs.professorlol.lolInfo.champion.MostChampion.class, com.ccs.professorlol.lolInfo.champion.QMostChampion.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final StringPath picture = createString("picture");

    public final StringPath summonerName = createString("summonerName");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

