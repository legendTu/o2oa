package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticTopUnitForDay.class)
public class StatisticTopUnitForDayStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticTopUnitForDay, Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Double> employeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, String> id;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Long> lateCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Long> leaveEarlyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Long> offDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Long> onDutyCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Double> onDutyEmployeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, Double> onSelfHolidayEmployeeCount;
    public static volatile SingularAttribute<StatisticTopUnitForDay, String> statisticDate;
    public static volatile SingularAttribute<StatisticTopUnitForDay, String> statisticMonth;
    public static volatile SingularAttribute<StatisticTopUnitForDay, String> statisticYear;
    public static volatile SingularAttribute<StatisticTopUnitForDay, String> topUnitName;

    public StatisticTopUnitForDayStatic() {
    }
}
