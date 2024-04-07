package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceDetail.class)
public class AttendanceDetailStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceDetail, String> abnormalDutyDayTime;
    public static volatile SingularAttribute<AttendanceDetail, Double> absence;
    public static volatile SingularAttribute<AttendanceDetail, String> absentDayTime;
    public static volatile SingularAttribute<AttendanceDetail, String> afternoonOnDutyTime;
    public static volatile SingularAttribute<AttendanceDetail, String> appealDescription;
    public static volatile SingularAttribute<AttendanceDetail, String> appealProcessor;
    public static volatile SingularAttribute<AttendanceDetail, String> appealReason;
    public static volatile SingularAttribute<AttendanceDetail, Integer> appealStatus;
    public static volatile SingularAttribute<AttendanceDetail, String> archiveTime;
    public static volatile SingularAttribute<AttendanceDetail, Double> attendance;
    public static volatile SingularAttribute<AttendanceDetail, String> batchName;
    public static volatile SingularAttribute<AttendanceDetail, String> cycleMonth;
    public static volatile SingularAttribute<AttendanceDetail, String> cycleYear;
    public static volatile SingularAttribute<AttendanceDetail, String> description;
    public static volatile SingularAttribute<AttendanceDetail, String> empName;
    public static volatile SingularAttribute<AttendanceDetail, String> empNo;
    public static volatile SingularAttribute<AttendanceDetail, Double> getSelfHolidayDays;
    public static volatile SingularAttribute<AttendanceDetail, String> id;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isAbnormalDuty;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isAbsent;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isExternal;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isGetSelfHolidays;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isHoliday;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isLackOfTime;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isLate;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isLeaveEarlier;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isWeekend;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isWorkOvertime;
    public static volatile SingularAttribute<AttendanceDetail, Boolean> isWorkday;
    public static volatile SingularAttribute<AttendanceDetail, Long> lateTimeDuration;
    public static volatile SingularAttribute<AttendanceDetail, Long> leaveEarlierTimeDuration;
    public static volatile SingularAttribute<AttendanceDetail, String> leaveType;
    public static volatile SingularAttribute<AttendanceDetail, String> middayRestEndTime;
    public static volatile SingularAttribute<AttendanceDetail, String> middayRestStartTime;
    public static volatile SingularAttribute<AttendanceDetail, String> monthString;
    public static volatile SingularAttribute<AttendanceDetail, String> morningOffDutyTime;
    public static volatile SingularAttribute<AttendanceDetail, String> offDutyTime;
    public static volatile SingularAttribute<AttendanceDetail, String> offWorkTime;
    public static volatile SingularAttribute<AttendanceDetail, String> onDutyTime;
    public static volatile SingularAttribute<AttendanceDetail, String> onWorkTime;
    public static volatile SingularAttribute<AttendanceDetail, String> optMachineType;
    public static volatile SingularAttribute<AttendanceDetail, String> recordAddress;
    public static volatile SingularAttribute<AttendanceDetail, Date> recordDate;
    public static volatile SingularAttribute<AttendanceDetail, String> recordDateString;
    public static volatile SingularAttribute<AttendanceDetail, Integer> recordStatus;
    public static volatile SingularAttribute<AttendanceDetail, String> selfHolidayDayTime;
    public static volatile SingularAttribute<AttendanceDetail, String> topUnitName;
    public static volatile SingularAttribute<AttendanceDetail, String> unitName;
    public static volatile SingularAttribute<AttendanceDetail, Long> workOvertimeTimeDuration;
    public static volatile SingularAttribute<AttendanceDetail, Long> workTimeDuration;
    public static volatile SingularAttribute<AttendanceDetail, String> yearString;

    public AttendanceDetailStatic() {
    }
}
