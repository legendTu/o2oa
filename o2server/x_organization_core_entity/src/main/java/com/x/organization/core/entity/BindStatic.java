package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Bind.class)
public class BindStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Bind, String> id;
    public static volatile SingularAttribute<Bind, String> meta;
    public static volatile SingularAttribute<Bind, String> name;

    public BindStatic() {
    }
}
