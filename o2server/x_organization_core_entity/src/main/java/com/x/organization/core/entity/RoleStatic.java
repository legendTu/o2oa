package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Role.class)
public class RoleStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Role, String> description;
    public static volatile SingularAttribute<Role, String> distinguishedName;
    public static volatile ListAttribute<Role, String> groupList;
    public static volatile SingularAttribute<Role, String> id;
    public static volatile SingularAttribute<Role, String> name;
    public static volatile SingularAttribute<Role, Integer> orderNumber;
    public static volatile ListAttribute<Role, String> personList;
    public static volatile SingularAttribute<Role, String> pinyin;
    public static volatile SingularAttribute<Role, String> pinyinInitial;
    public static volatile SingularAttribute<Role, String> unique;

    public RoleStatic() {
    }
}
