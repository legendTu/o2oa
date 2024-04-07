package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceWorkDayConfig.class)
public class AttendanceWorkDayConfigStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceWorkDayConfig, String> configDate;
    public static volatile SingularAttribute<AttendanceWorkDayConfig, String> configMonth;
    public static volatile SingularAttribute<AttendanceWorkDayConfig, String> configName;
    public static volatile SingularAttribute<AttendanceWorkDayConfig, String> configType;
    public static volatile SingularAttribute<AttendanceWorkDayConfig, String> configYear;
    public static volatile SingularAttribute<AttendanceWorkDayConfig, String> description;
    public static volatile SingularAttribute<AttendanceWorkDayConfig, String> id;

    public AttendanceWorkDayConfigStatic() {
    }
}
