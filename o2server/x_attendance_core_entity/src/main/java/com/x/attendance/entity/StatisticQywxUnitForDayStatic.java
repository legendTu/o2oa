package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticQywxUnitForDay.class)
public class StatisticQywxUnitForDayStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> absenteeismTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, String> id;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> lateTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> leaveEarlyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> notSignedCount;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, String> o2Unit;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> offDutyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> onDutyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> outsideDutyTimes;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> resultNormal;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, String> statisticDate;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, String> statisticMonth;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, String> statisticYear;
    public static volatile SingularAttribute<StatisticQywxUnitForDay, Long> workDayCount;

    public StatisticQywxUnitForDayStatic() {
    }
}
