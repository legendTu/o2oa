package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Stat.class)
public class StatStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Stat, String> alias;
    public static volatile ListAttribute<Stat, String> availableGroupList;
    public static volatile ListAttribute<Stat, String> availableIdentityList;
    public static volatile ListAttribute<Stat, String> availableUnitList;
    public static volatile SingularAttribute<Stat, String> data;
    public static volatile SingularAttribute<Stat, String> description;
    public static volatile SingularAttribute<Stat, Boolean> display;
    public static volatile SingularAttribute<Stat, String> id;
    public static volatile SingularAttribute<Stat, String> name;
    public static volatile SingularAttribute<Stat, Integer> orderNumber;
    public static volatile SingularAttribute<Stat, String> query;
    public static volatile SingularAttribute<Stat, String> view;

    public StatStatic() {
    }
}
