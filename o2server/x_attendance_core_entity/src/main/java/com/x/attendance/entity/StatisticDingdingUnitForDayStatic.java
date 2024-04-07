package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticDingdingUnitForDay.class)
public class StatisticDingdingUnitForDayStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> absenteeismTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, String> id;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> lateTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> leaveEarlyTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> notSignedCount;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, String> o2Unit;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> offDutyTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> onDutyTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> resultNormal;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> seriousLateTimes;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, String> statisticDate;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, String> statisticMonth;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, String> statisticYear;
    public static volatile SingularAttribute<StatisticDingdingUnitForDay, Long> workDayCount;

    public StatisticDingdingUnitForDayStatic() {
    }
}
