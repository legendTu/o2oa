package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Custom.class)
public class CustomStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Custom, String> data;
    public static volatile SingularAttribute<Custom, String> id;
    public static volatile SingularAttribute<Custom, String> name;
    public static volatile SingularAttribute<Custom, String> person;

    public CustomStatic() {
    }
}
