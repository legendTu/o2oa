package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.base.core.entity.dataitem.ItemCategory;
import com.x.base.core.entity.dataitem.ItemPrimitiveType;
import com.x.base.core.entity.dataitem.ItemStringValueType;
import com.x.base.core.entity.dataitem.ItemType;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Item.class)
public class ItemStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Item, Boolean> booleanValue;
    public static volatile SingularAttribute<Item, String> bundle;
    public static volatile SingularAttribute<Item, Date> dateTimeValue;
    public static volatile SingularAttribute<Item, Date> dateValue;
    public static volatile SingularAttribute<Item, String> id;
    public static volatile SingularAttribute<Item, ItemCategory> itemCategory;
    public static volatile SingularAttribute<Item, ItemPrimitiveType> itemPrimitiveType;
    public static volatile SingularAttribute<Item, ItemStringValueType> itemStringValueType;
    public static volatile SingularAttribute<Item, ItemType> itemType;
    public static volatile SingularAttribute<Item, Double> numberValue;
    public static volatile SingularAttribute<Item, String> path0;
    public static volatile SingularAttribute<Item, Integer> path0Location;
    public static volatile SingularAttribute<Item, String> path1;
    public static volatile SingularAttribute<Item, Integer> path1Location;
    public static volatile SingularAttribute<Item, String> path2;
    public static volatile SingularAttribute<Item, Integer> path2Location;
    public static volatile SingularAttribute<Item, String> path3;
    public static volatile SingularAttribute<Item, Integer> path3Location;
    public static volatile SingularAttribute<Item, String> path4;
    public static volatile SingularAttribute<Item, Integer> path4Location;
    public static volatile SingularAttribute<Item, String> path5;
    public static volatile SingularAttribute<Item, Integer> path5Location;
    public static volatile SingularAttribute<Item, String> path6;
    public static volatile SingularAttribute<Item, Integer> path6Location;
    public static volatile SingularAttribute<Item, String> path7;
    public static volatile SingularAttribute<Item, Integer> path7Location;
    public static volatile SingularAttribute<Item, String> stringLongValue;
    public static volatile SingularAttribute<Item, String> stringShortValue;
    public static volatile SingularAttribute<Item, Date> timeValue;

    public ItemStatic() {
    }
}
