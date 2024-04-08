package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Group.class)
public class GroupStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Group, String> description;
    public static volatile SingularAttribute<Group, String> distinguishedName;
    public static volatile ListAttribute<Group, String> groupList;
    public static volatile SingularAttribute<Group, String> id;
    public static volatile ListAttribute<Group, String> identityList;
    public static volatile SingularAttribute<Group, String> name;
    public static volatile SingularAttribute<Group, Integer> orderNumber;
    public static volatile ListAttribute<Group, String> personList;
    public static volatile SingularAttribute<Group, String> pinyin;
    public static volatile SingularAttribute<Group, String> pinyinInitial;
    public static volatile SingularAttribute<Group, String> unique;
    public static volatile ListAttribute<Group, String> unitList;

    public GroupStatic() {
    }
}
