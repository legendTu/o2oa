package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceScheduleSetting.class)
public class AttendanceScheduleSettingStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> absenceStartTime;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> id;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> lateStartTime;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> lateStartTimeAfternoon;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> leaveEarlyStartTime;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> leaveEarlyStartTimeMorning;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> middayRestEndTime;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> middayRestStartTime;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> offDutyTime;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> onDutyTime;
    public static volatile SingularAttribute<AttendanceScheduleSetting, Integer> signProxy;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> topUnitName;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> unitName;
    public static volatile SingularAttribute<AttendanceScheduleSetting, String> unitOu;

    public AttendanceScheduleSettingStatic() {
    }
}
