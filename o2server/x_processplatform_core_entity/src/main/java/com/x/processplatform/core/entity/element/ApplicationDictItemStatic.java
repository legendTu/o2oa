package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.base.core.entity.dataitem.ItemCategory;
import com.x.base.core.entity.dataitem.ItemPrimitiveType;
import com.x.base.core.entity.dataitem.ItemStringValueType;
import com.x.base.core.entity.dataitem.ItemType;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ApplicationDictItem.class)
public class ApplicationDictItemStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ApplicationDictItem, String> application;
    public static volatile SingularAttribute<ApplicationDictItem, Boolean> booleanValue;
    public static volatile SingularAttribute<ApplicationDictItem, String> bundle;
    public static volatile SingularAttribute<ApplicationDictItem, Date> dateTimeValue;
    public static volatile SingularAttribute<ApplicationDictItem, Date> dateValue;
    public static volatile SingularAttribute<ApplicationDictItem, String> id;
    public static volatile SingularAttribute<ApplicationDictItem, ItemCategory> itemCategory;
    public static volatile SingularAttribute<ApplicationDictItem, ItemPrimitiveType> itemPrimitiveType;
    public static volatile SingularAttribute<ApplicationDictItem, ItemStringValueType> itemStringValueType;
    public static volatile SingularAttribute<ApplicationDictItem, ItemType> itemType;
    public static volatile SingularAttribute<ApplicationDictItem, Double> numberValue;
    public static volatile SingularAttribute<ApplicationDictItem, String> path0;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path0Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> path1;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path1Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> path2;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path2Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> path3;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path3Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> path4;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path4Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> path5;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path5Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> path6;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path6Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> path7;
    public static volatile SingularAttribute<ApplicationDictItem, Integer> path7Location;
    public static volatile SingularAttribute<ApplicationDictItem, String> stringLongValue;
    public static volatile SingularAttribute<ApplicationDictItem, String> stringShortValue;
    public static volatile SingularAttribute<ApplicationDictItem, Date> timeValue;

    public ApplicationDictItemStatic() {
    }
}
