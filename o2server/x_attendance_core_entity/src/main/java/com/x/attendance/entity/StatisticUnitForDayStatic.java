package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticUnitForDay.class)
public class StatisticUnitForDayStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticUnitForDay, Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Double> employeeCount;
    public static volatile SingularAttribute<StatisticUnitForDay, String> id;
    public static volatile SingularAttribute<StatisticUnitForDay, Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Long> lateCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Long> leaveEarlyCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Long> offDutyCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Long> onDutyCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Double> onDutyEmployeeCount;
    public static volatile SingularAttribute<StatisticUnitForDay, Double> onSelfHolidayEmployeeCount;
    public static volatile SingularAttribute<StatisticUnitForDay, String> statisticDate;
    public static volatile SingularAttribute<StatisticUnitForDay, String> statisticMonth;
    public static volatile SingularAttribute<StatisticUnitForDay, String> statisticYear;
    public static volatile SingularAttribute<StatisticUnitForDay, String> topUnitName;
    public static volatile SingularAttribute<StatisticUnitForDay, String> unitName;

    public StatisticUnitForDayStatic() {
    }
}
