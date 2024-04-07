package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticQywxUnitForMonth.class)
public class StatisticQywxUnitForMonthStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> absenteeismTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, String> id;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> lateTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> leaveEarlyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> notSignedCount;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, String> o2Unit;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> offDutyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> onDutyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> outsideDutyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> resultNormal;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, String> statisticMonth;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, String> statisticYear;
    public static volatile SingularAttribute<StatisticQywxUnitForMonth, Long> workDayCount;

    public StatisticQywxUnitForMonthStatic() {
    }
}
