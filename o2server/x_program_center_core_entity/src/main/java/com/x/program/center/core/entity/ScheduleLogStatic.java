package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ScheduleLog.class)
public class ScheduleLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ScheduleLog, String> application;
    public static volatile SingularAttribute<ScheduleLog, String> className;
    public static volatile SingularAttribute<ScheduleLog, Long> elapsed;
    public static volatile SingularAttribute<ScheduleLog, Date> fireTime;
    public static volatile SingularAttribute<ScheduleLog, String> id;
    public static volatile SingularAttribute<ScheduleLog, String> node;
    public static volatile SingularAttribute<ScheduleLog, String> stackTrace;
    public static volatile SingularAttribute<ScheduleLog, Boolean> success;
    public static volatile SingularAttribute<ScheduleLog, String> type;

    public ScheduleLogStatic() {
    }
}
