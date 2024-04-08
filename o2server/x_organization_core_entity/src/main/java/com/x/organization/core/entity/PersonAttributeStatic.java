package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PersonAttribute.class)
public class PersonAttributeStatic extends SliceJpaObjectStatic {
    public static volatile ListAttribute<PersonAttribute, String> attributeList;
    public static volatile SingularAttribute<PersonAttribute, String> description;
    public static volatile SingularAttribute<PersonAttribute, String> distinguishedName;
    public static volatile SingularAttribute<PersonAttribute, String> id;
    public static volatile SingularAttribute<PersonAttribute, String> name;
    public static volatile SingularAttribute<PersonAttribute, Integer> orderNumber;
    public static volatile SingularAttribute<PersonAttribute, String> person;
    public static volatile SingularAttribute<PersonAttribute, String> pinyin;
    public static volatile SingularAttribute<PersonAttribute, String> pinyinInitial;
    public static volatile SingularAttribute<PersonAttribute, String> unique;

    public PersonAttributeStatic() {
    }
}
