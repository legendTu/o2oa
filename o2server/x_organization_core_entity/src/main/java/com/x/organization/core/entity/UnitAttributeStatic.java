package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(UnitAttribute.class)
public class UnitAttributeStatic extends SliceJpaObjectStatic {
    public static volatile ListAttribute<UnitAttribute, String> attributeList;
    public static volatile SingularAttribute<UnitAttribute, String> description;
    public static volatile SingularAttribute<UnitAttribute, String> distinguishedName;
    public static volatile SingularAttribute<UnitAttribute, String> id;
    public static volatile SingularAttribute<UnitAttribute, String> name;
    public static volatile SingularAttribute<UnitAttribute, Integer> orderNumber;
    public static volatile SingularAttribute<UnitAttribute, String> pinyin;
    public static volatile SingularAttribute<UnitAttribute, String> pinyinInitial;
    public static volatile SingularAttribute<UnitAttribute, String> unique;
    public static volatile SingularAttribute<UnitAttribute, String> unit;

    public UnitAttributeStatic() {
    }
}
