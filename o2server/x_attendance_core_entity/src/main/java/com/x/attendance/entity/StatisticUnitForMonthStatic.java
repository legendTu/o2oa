package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticUnitForMonth.class)
public class StatisticUnitForMonthStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticUnitForMonth, Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Double> employeeCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, String> id;
    public static volatile SingularAttribute<StatisticUnitForMonth, Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Long> lateCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Long> leaveEarlyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Long> offDutyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Long> onDutyCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Double> onDutyEmployeeCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, Double> onSelfHolidayCount;
    public static volatile SingularAttribute<StatisticUnitForMonth, String> statisticMonth;
    public static volatile SingularAttribute<StatisticUnitForMonth, String> statisticYear;
    public static volatile SingularAttribute<StatisticUnitForMonth, String> topUnitName;
    public static volatile SingularAttribute<StatisticUnitForMonth, String> unitName;

    public StatisticUnitForMonthStatic() {
    }
}
