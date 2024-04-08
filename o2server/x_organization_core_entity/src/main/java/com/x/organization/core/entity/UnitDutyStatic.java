package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(UnitDuty.class)
public class UnitDutyStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<UnitDuty, String> description;
    public static volatile SingularAttribute<UnitDuty, String> distinguishedName;
    public static volatile SingularAttribute<UnitDuty, String> id;
    public static volatile ListAttribute<UnitDuty, String> identityList;
    public static volatile SingularAttribute<UnitDuty, String> name;
    public static volatile SingularAttribute<UnitDuty, Integer> orderNumber;
    public static volatile SingularAttribute<UnitDuty, String> pinyin;
    public static volatile SingularAttribute<UnitDuty, String> pinyinInitial;
    public static volatile SingularAttribute<UnitDuty, String> unique;
    public static volatile SingularAttribute<UnitDuty, String> unit;

    public UnitDutyStatic() {
    }
}
