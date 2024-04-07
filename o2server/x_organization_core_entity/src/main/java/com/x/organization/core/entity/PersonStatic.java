package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.base.core.entity.type.GenderType;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Person.class)
public class PersonStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Person, Integer> age;
    public static volatile SingularAttribute<Person, String> andFxHash;
    public static volatile SingularAttribute<Person, String> andFxId;
    public static volatile SingularAttribute<Person, Date> birthday;
    public static volatile SingularAttribute<Person, Date> boardDate;
    public static volatile SingularAttribute<Person, Date> changePasswordTime;
    public static volatile ListAttribute<Person, String> controllerList;
    public static volatile SingularAttribute<Person, String> description;
    public static volatile SingularAttribute<Person, String> dingdingHash;
    public static volatile SingularAttribute<Person, String> dingdingId;
    public static volatile SingularAttribute<Person, String> distinguishedName;
    public static volatile SingularAttribute<Person, String> employee;
    public static volatile SingularAttribute<Person, Integer> failureCount;
    public static volatile SingularAttribute<Person, Date> failureTime;
    public static volatile SingularAttribute<Person, GenderType> genderType;
    public static volatile SingularAttribute<Person, Boolean> hiddenMobile;
    public static volatile SingularAttribute<Person, String> icon;
    public static volatile SingularAttribute<Person, String> iconLdpi;
    public static volatile SingularAttribute<Person, String> iconMdpi;
    public static volatile SingularAttribute<Person, String> id;
    public static volatile SingularAttribute<Person, String> ipAddress;
    public static volatile SingularAttribute<Person, String> language;
    public static volatile SingularAttribute<Person, String> lastLoginAddress;
    public static volatile SingularAttribute<Person, String> lastLoginClient;
    public static volatile SingularAttribute<Person, Date> lastLoginTime;
    public static volatile SingularAttribute<Person, String> mail;
    public static volatile SingularAttribute<Person, String> mobile;
    public static volatile SingularAttribute<Person, String> mpwxopenId;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, String> nickName;
    public static volatile SingularAttribute<Person, String> officePhone;
    public static volatile SingularAttribute<Person, String> open1Id;
    public static volatile SingularAttribute<Person, String> open2Id;
    public static volatile SingularAttribute<Person, String> open3Id;
    public static volatile SingularAttribute<Person, String> open4Id;
    public static volatile SingularAttribute<Person, String> open5Id;
    public static volatile SingularAttribute<Person, Integer> orderNumber;
    public static volatile SingularAttribute<Person, String> password;
    public static volatile SingularAttribute<Person, Date> passwordExpiredTime;
    public static volatile SingularAttribute<Person, String> pinyin;
    public static volatile SingularAttribute<Person, String> pinyinInitial;
    public static volatile SingularAttribute<Person, String> qiyeweixinHash;
    public static volatile SingularAttribute<Person, String> qiyeweixinId;
    public static volatile SingularAttribute<Person, String> qq;
    public static volatile SingularAttribute<Person, String> signature;
    public static volatile SingularAttribute<Person, Integer> subjectSecurityClearance;
    public static volatile SingularAttribute<Person, String> superior;
    public static volatile ListAttribute<Person, String> topUnitList;
    public static volatile SingularAttribute<Person, String> unique;
    public static volatile SingularAttribute<Person, String> weLinkHash;
    public static volatile SingularAttribute<Person, String> weLinkId;
    public static volatile SingularAttribute<Person, String> weixin;
    public static volatile SingularAttribute<Person, String> zhengwuDingdingHash;
    public static volatile SingularAttribute<Person, String> zhengwuDingdingId;

    public PersonStatic() {
    }
}
