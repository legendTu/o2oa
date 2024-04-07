package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.base.core.entity.type.GenderType;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PersonCard.class)
public class PersonCardStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<PersonCard, String> address;
    public static volatile SingularAttribute<PersonCard, String> description;
    public static volatile SingularAttribute<PersonCard, String> distinguishedName;
    public static volatile SingularAttribute<PersonCard, String> extend1;
    public static volatile SingularAttribute<PersonCard, String> extend2;
    public static volatile SingularAttribute<PersonCard, String> extend3;
    public static volatile SingularAttribute<PersonCard, GenderType> genderType;
    public static volatile SingularAttribute<PersonCard, String> groupType;
    public static volatile SingularAttribute<PersonCard, String> id;
    public static volatile SingularAttribute<PersonCard, String> inputTime;
    public static volatile SingularAttribute<PersonCard, String> mobile;
    public static volatile SingularAttribute<PersonCard, String> name;
    public static volatile SingularAttribute<PersonCard, String> officePhone;
    public static volatile SingularAttribute<PersonCard, Integer> orderNumber;
    public static volatile SingularAttribute<PersonCard, String> pinyin;
    public static volatile SingularAttribute<PersonCard, String> pinyinInitial;
    public static volatile SingularAttribute<PersonCard, String> status;

    public PersonCardStatic() {
    }
}
