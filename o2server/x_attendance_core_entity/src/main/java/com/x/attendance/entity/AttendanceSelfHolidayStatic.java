package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceSelfHoliday.class)
public class AttendanceSelfHolidayStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> batchFlag;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> description;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> employeeName;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> employeeNumber;
    public static volatile SingularAttribute<AttendanceSelfHoliday, Date> endTime;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> id;
    public static volatile SingularAttribute<AttendanceSelfHoliday, Double> leaveDayNumber;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> leaveType;
    public static volatile SingularAttribute<AttendanceSelfHoliday, Date> startTime;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> topUnitName;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> topUnitOu;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> unitName;
    public static volatile SingularAttribute<AttendanceSelfHoliday, String> unitOu;

    public AttendanceSelfHolidayStatic() {
    }
}
