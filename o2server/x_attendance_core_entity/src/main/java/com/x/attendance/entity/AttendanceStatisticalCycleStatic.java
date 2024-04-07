package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceStatisticalCycle.class)
public class AttendanceStatisticalCycleStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceStatisticalCycle, Date> cycleEndDate;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> cycleEndDateString;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> cycleMonth;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, Date> cycleStartDate;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> cycleStartDateString;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> cycleYear;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> description;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> id;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> topUnitName;
    public static volatile SingularAttribute<AttendanceStatisticalCycle, String> unitName;

    public AttendanceStatisticalCycleStatic() {
    }
}
