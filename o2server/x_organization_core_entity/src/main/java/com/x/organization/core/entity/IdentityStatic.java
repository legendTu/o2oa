package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Identity.class)
public class IdentityStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Identity, String> description;
    public static volatile SingularAttribute<Identity, String> distinguishedName;
    public static volatile SingularAttribute<Identity, String> id;
    public static volatile SingularAttribute<Identity, Boolean> major;
    public static volatile SingularAttribute<Identity, String> name;
    public static volatile SingularAttribute<Identity, Integer> orderNumber;
    public static volatile SingularAttribute<Identity, String> person;
    public static volatile SingularAttribute<Identity, String> pinyin;
    public static volatile SingularAttribute<Identity, String> pinyinInitial;
    public static volatile SingularAttribute<Identity, String> unique;
    public static volatile SingularAttribute<Identity, String> unit;
    public static volatile SingularAttribute<Identity, Integer> unitLevel;
    public static volatile SingularAttribute<Identity, String> unitLevelName;
    public static volatile SingularAttribute<Identity, String> unitName;

    public IdentityStatic() {
    }
}
