package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticPersonForMonth.class)
public class StatisticPersonForMonthStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticPersonForMonth, Long> abNormalDutyCount;
    public static volatile SingularAttribute<StatisticPersonForMonth, Double> absenceDayCount;
    public static volatile SingularAttribute<StatisticPersonForMonth, String> employeeName;
    public static volatile SingularAttribute<StatisticPersonForMonth, String> id;
    public static volatile SingularAttribute<StatisticPersonForMonth, Long> lackOfTimeCount;
    public static volatile SingularAttribute<StatisticPersonForMonth, Long> lateTimes;
    public static volatile SingularAttribute<StatisticPersonForMonth, Long> leaveEarlyTimes;
    public static volatile SingularAttribute<StatisticPersonForMonth, Long> offDutyTimes;
    public static volatile SingularAttribute<StatisticPersonForMonth, Double> onDutyDayCount;
    public static volatile SingularAttribute<StatisticPersonForMonth, Long> onDutyTimes;
    public static volatile SingularAttribute<StatisticPersonForMonth, Double> onSelfHolidayCount;
    public static volatile SingularAttribute<StatisticPersonForMonth, String> statisticMonth;
    public static volatile SingularAttribute<StatisticPersonForMonth, String> statisticYear;
    public static volatile SingularAttribute<StatisticPersonForMonth, String> topUnitName;
    public static volatile SingularAttribute<StatisticPersonForMonth, String> unitName;
    public static volatile SingularAttribute<StatisticPersonForMonth, Double> workDayCount;

    public StatisticPersonForMonthStatic() {
    }
}
