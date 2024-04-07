package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.base.core.entity.dataitem.ItemCategory;
import com.x.base.core.entity.dataitem.ItemPrimitiveType;
import com.x.base.core.entity.dataitem.ItemStringValueType;
import com.x.base.core.entity.dataitem.ItemType;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AppDictItem.class)
public class AppDictItemStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AppDictItem, String> appId;
    public static volatile SingularAttribute<AppDictItem, Boolean> booleanValue;
    public static volatile SingularAttribute<AppDictItem, String> bundle;
    public static volatile SingularAttribute<AppDictItem, Date> dateTimeValue;
    public static volatile SingularAttribute<AppDictItem, Date> dateValue;
    public static volatile SingularAttribute<AppDictItem, String> id;
    public static volatile SingularAttribute<AppDictItem, ItemCategory> itemCategory;
    public static volatile SingularAttribute<AppDictItem, ItemPrimitiveType> itemPrimitiveType;
    public static volatile SingularAttribute<AppDictItem, ItemStringValueType> itemStringValueType;
    public static volatile SingularAttribute<AppDictItem, ItemType> itemType;
    public static volatile SingularAttribute<AppDictItem, Double> numberValue;
    public static volatile SingularAttribute<AppDictItem, String> path0;
    public static volatile SingularAttribute<AppDictItem, Integer> path0Location;
    public static volatile SingularAttribute<AppDictItem, String> path1;
    public static volatile SingularAttribute<AppDictItem, Integer> path1Location;
    public static volatile SingularAttribute<AppDictItem, String> path2;
    public static volatile SingularAttribute<AppDictItem, Integer> path2Location;
    public static volatile SingularAttribute<AppDictItem, String> path3;
    public static volatile SingularAttribute<AppDictItem, Integer> path3Location;
    public static volatile SingularAttribute<AppDictItem, String> path4;
    public static volatile SingularAttribute<AppDictItem, Integer> path4Location;
    public static volatile SingularAttribute<AppDictItem, String> path5;
    public static volatile SingularAttribute<AppDictItem, Integer> path5Location;
    public static volatile SingularAttribute<AppDictItem, String> path6;
    public static volatile SingularAttribute<AppDictItem, Integer> path6Location;
    public static volatile SingularAttribute<AppDictItem, String> path7;
    public static volatile SingularAttribute<AppDictItem, Integer> path7Location;
    public static volatile SingularAttribute<AppDictItem, String> stringLongValue;
    public static volatile SingularAttribute<AppDictItem, String> stringShortValue;
    public static volatile SingularAttribute<AppDictItem, Date> timeValue;

    public AppDictItemStatic() {
    }
}
