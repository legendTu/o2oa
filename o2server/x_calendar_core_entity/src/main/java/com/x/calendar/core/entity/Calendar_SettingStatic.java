package com.x.calendar.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Calendar_Setting.class)
public class Calendar_SettingStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Calendar_Setting, String> configCode;
    public static volatile SingularAttribute<Calendar_Setting, String> configName;
    public static volatile SingularAttribute<Calendar_Setting, String> configValue;
    public static volatile SingularAttribute<Calendar_Setting, String> description;
    public static volatile SingularAttribute<Calendar_Setting, String> id;
    public static volatile SingularAttribute<Calendar_Setting, Boolean> isLob;
    public static volatile SingularAttribute<Calendar_Setting, Boolean> isMultiple;
    public static volatile SingularAttribute<Calendar_Setting, Integer> orderNumber;
    public static volatile SingularAttribute<Calendar_Setting, String> selectContent;
    public static volatile SingularAttribute<Calendar_Setting, String> valueType;

    public Calendar_SettingStatic() {
    }
}
