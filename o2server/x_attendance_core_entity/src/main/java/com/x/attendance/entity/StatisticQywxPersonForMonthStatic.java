package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StatisticQywxPersonForMonth.class)
public class StatisticQywxPersonForMonthStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StatisticQywxPersonForMonth, String> id;
    public static volatile SingularAttribute<StatisticQywxPersonForMonth, Long> o2Unit;
    public static volatile SingularAttribute<StatisticQywxPersonForMonth, Long> statisticYear;
    public static volatile SingularAttribute<StatisticQywxPersonForMonth, Long> statisticMonth;
    public static volatile SingularAttribute<StatisticQywxPersonForMonth, Long> o2User;
}
