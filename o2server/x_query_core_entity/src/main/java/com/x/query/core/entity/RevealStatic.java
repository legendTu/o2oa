package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Reveal.class)
public class RevealStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Reveal, String> query;
    public static volatile SingularAttribute<Reveal, String> name;
    public static volatile SingularAttribute<Reveal, String> id;
    public static volatile SingularAttribute<Reveal, String> alias;
    public RevealStatic() {
    }
}
