package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticDingdingUnitForMonth.class)
public class StatisticDingdingUnitForMonthStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> absenteeismTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, String> id;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> lateTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> leaveEarlyTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> notSignedCount;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, String> o2Unit;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> offDutyTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> onDutyTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> resultNormal;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> seriousLateTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, String> statisticMonth;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, String> statisticYear;
    public static volatile SingularAttribute<StatisticDingdingUnitForMonth, Long> workDayCount;

    public StatisticDingdingUnitForMonthStatic() {
    }
}
