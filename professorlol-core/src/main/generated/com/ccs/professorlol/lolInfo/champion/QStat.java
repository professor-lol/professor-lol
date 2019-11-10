package com.ccs.professorlol.lolInfo.champion;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStat is a Querydsl query type for Stat
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStat extends EntityPathBase<Stat> {

    private static final long serialVersionUID = -306232554L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStat stat = new QStat("stat");

    public final NumberPath<Integer> armor = createNumber("armor", Integer.class);

    public final NumberPath<Double> armorPerLevel = createNumber("armorPerLevel", Double.class);

    public final NumberPath<Integer> attackDamage = createNumber("attackDamage", Integer.class);

    public final NumberPath<Integer> attackDamagePerLevel = createNumber("attackDamagePerLevel", Integer.class);

    public final NumberPath<Integer> attackRange = createNumber("attackRange", Integer.class);

    public final NumberPath<Double> attackSpeed = createNumber("attackSpeed", Double.class);

    public final NumberPath<Double> attackSpeedPerLevel = createNumber("attackSpeedPerLevel", Double.class);

    public final QChampion champion;

    public final NumberPath<Integer> crit = createNumber("crit", Integer.class);

    public final NumberPath<Integer> critPerLevel = createNumber("critPerLevel", Integer.class);

    public final NumberPath<Integer> hp = createNumber("hp", Integer.class);

    public final NumberPath<Integer> hpPerLevel = createNumber("hpPerLevel", Integer.class);

    public final NumberPath<Integer> hpRegen = createNumber("hpRegen", Integer.class);

    public final NumberPath<Double> hpRegenPerLevel = createNumber("hpRegenPerLevel", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.ccs.professorlol.lolInfo.QLolInfo lolInfo;

    public final NumberPath<Integer> moveSpeed = createNumber("moveSpeed", Integer.class);

    public final NumberPath<Integer> mp = createNumber("mp", Integer.class);

    public final NumberPath<Integer> mpPerLevel = createNumber("mpPerLevel", Integer.class);

    public final NumberPath<Integer> mpRegen = createNumber("mpRegen", Integer.class);

    public final NumberPath<Integer> mpRegenPerLevel = createNumber("mpRegenPerLevel", Integer.class);

    public final NumberPath<Double> spellBlock = createNumber("spellBlock", Double.class);

    public final NumberPath<Double> spellBlockPerLevel = createNumber("spellBlockPerLevel", Double.class);

    public QStat(String variable) {
        this(Stat.class, forVariable(variable), INITS);
    }

    public QStat(Path<? extends Stat> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStat(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStat(PathMetadata metadata, PathInits inits) {
        this(Stat.class, metadata, inits);
    }

    public QStat(Class<? extends Stat> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.champion = inits.isInitialized("champion") ? new QChampion(forProperty("champion")) : null;
        this.lolInfo = inits.isInitialized("lolInfo") ? new com.ccs.professorlol.lolInfo.QLolInfo(forProperty("lolInfo")) : null;
    }

}

