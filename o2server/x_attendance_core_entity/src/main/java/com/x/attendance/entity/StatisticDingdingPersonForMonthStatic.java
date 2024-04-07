package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticDingdingPersonForMonth.class)
public class StatisticDingdingPersonForMonthStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> absenteeismTimes;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, String> id;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> lateTimes;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> leaveEarlyTimes;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> notSignedCount;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, String> o2Unit;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, String> o2User;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> offDutyTimes;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> onDutyTimes;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> resultNormal;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> seriousLateTimes;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, String> statisticMonth;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, String> statisticYear;
    public static volatile SingularAttribute<StatisticDingdingPersonForMonth, Long> workDayCount;

    public StatisticDingdingPersonForMonthStatic() {
    }
}
