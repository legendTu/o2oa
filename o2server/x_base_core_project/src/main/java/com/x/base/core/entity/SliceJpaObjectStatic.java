package com.x.base.core.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SliceJpaObject.class)
public class SliceJpaObjectStatic extends JpaObjectStatic {
    public static volatile SingularAttribute<SliceJpaObject, Integer> distributeFactor;

    public SliceJpaObjectStatic() {
    }
}
