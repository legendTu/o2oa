package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Unit.class)
public class UnitStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Unit, String> andFxHash;
    public static volatile SingularAttribute<Unit, String> andFxId;
    public static volatile ListAttribute<Unit, String> controllerList;
    public static volatile SingularAttribute<Unit, String> description;
    public static volatile SingularAttribute<Unit, String> dingdingHash;
    public static volatile SingularAttribute<Unit, String> dingdingId;
    public static volatile SingularAttribute<Unit, String> distinguishedName;
    public static volatile SingularAttribute<Unit, String> id;
    public static volatile SingularAttribute<Unit, Integer> level;
    public static volatile SingularAttribute<Unit, String> levelName;
    public static volatile SingularAttribute<Unit, String> levelOrderNumber;
    public static volatile SingularAttribute<Unit, String> name;
    public static volatile SingularAttribute<Unit, Integer> orderNumber;
    public static volatile SingularAttribute<Unit, String> pinyin;
    public static volatile SingularAttribute<Unit, String> pinyinInitial;
    public static volatile SingularAttribute<Unit, String> qiyeweixinHash;
    public static volatile SingularAttribute<Unit, String> qiyeweixinId;
    public static volatile SingularAttribute<Unit, String> shortName;
    public static volatile SingularAttribute<Unit, String> superior;
    public static volatile ListAttribute<Unit, String> typeList;
    public static volatile SingularAttribute<Unit, String> unique;
    public static volatile SingularAttribute<Unit, String> weLinkHash;
    public static volatile SingularAttribute<Unit, String> weLinkId;
    public static volatile SingularAttribute<Unit, String> zhengwuDingdingHash;
    public static volatile SingularAttribute<Unit, String> zhengwuDingdingId;

    public UnitStatic() {
    }
}
