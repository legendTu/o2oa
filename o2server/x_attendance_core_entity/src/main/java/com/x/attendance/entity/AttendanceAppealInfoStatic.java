package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceAppealInfo.class)
public class AttendanceAppealInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceAppealInfo, String> address;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> appealDateString;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> appealDescription;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> appealReason;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> archiveTime;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> currentProcessor;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> detailId;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> empName;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> endTime;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> id;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> monthString;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> reason;
    public static volatile SingularAttribute<AttendanceAppealInfo, Date> recordDate;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> recordDateString;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> selfHolidayType;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> startTime;
    public static volatile SingularAttribute<AttendanceAppealInfo, Integer> status;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> topUnitName;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> unitName;
    public static volatile SingularAttribute<AttendanceAppealInfo, String> yearString;

    public AttendanceAppealInfoStatic() {
    }
}
