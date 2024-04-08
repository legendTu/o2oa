package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Snap.class)
public class SnapStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Snap, String> person;
    public static volatile SingularAttribute<Snap, String> application;
    public static volatile SingularAttribute<Snap, String> title;
    public static volatile SingularAttribute<Snap, String> creatorPerson;
    public static volatile SingularAttribute<Snap, String> creatorUnit;
    public static volatile SingularAttribute<Snap, String> process;
    public SnapStatic() {
    }
}
