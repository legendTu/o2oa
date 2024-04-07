package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticTopUnitForMonth.class)
public class StatisticTopUnitForMonthStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Double> employeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, String> id;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Long> lateCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Long> leaveEarlyCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Long> offDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Long> onDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Double> onDutyEmployeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, Double> onSelfHolidayCount;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, String> statisticMonth;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, String> statisticYear;
    public static volatile SingularAttribute<StatisticTopUnitForMonth, String> topUnitName;

    public StatisticTopUnitForMonthStatic() {
    }
}
