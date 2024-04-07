package com.x.meeting.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Building.class)
public class BuildingStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Building, String> address;
    public static volatile SingularAttribute<Building, String> id;
    public static volatile SingularAttribute<Building, String> name;
    public static volatile SingularAttribute<Building, String> pinyin;
    public static volatile SingularAttribute<Building, String> pinyinInitial;

    public BuildingStatic() {
    }
}
