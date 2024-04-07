package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceSetting.class)
public class AttendanceSettingStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceSetting, String> configCode;
    public static volatile SingularAttribute<AttendanceSetting, String> configName;
    public static volatile SingularAttribute<AttendanceSetting, String> configValue;
    public static volatile SingularAttribute<AttendanceSetting, String> description;
    public static volatile SingularAttribute<AttendanceSetting, String> id;
    public static volatile SingularAttribute<AttendanceSetting, Boolean> isMultiple;
    public static volatile SingularAttribute<AttendanceSetting, Integer> orderNumber;
    public static volatile SingularAttribute<AttendanceSetting, String> selectContent;
    public static volatile SingularAttribute<AttendanceSetting, String> valueType;

    public AttendanceSettingStatic() {
    }
}
