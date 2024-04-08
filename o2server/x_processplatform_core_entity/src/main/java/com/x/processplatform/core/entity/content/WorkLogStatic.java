package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.processplatform.core.entity.element.ActivityType;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(WorkLog.class)
public class WorkLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<WorkLog, String> application;
    public static volatile SingularAttribute<WorkLog, String> applicationAlias;
    public static volatile SingularAttribute<WorkLog, String> applicationName;
    public static volatile SingularAttribute<WorkLog, String> arrivedActivity;
    public static volatile SingularAttribute<WorkLog, String> arrivedActivityAlias;
    public static volatile SingularAttribute<WorkLog, String> arrivedActivityName;
    public static volatile SingularAttribute<WorkLog, String> arrivedActivityToken;
    public static volatile SingularAttribute<WorkLog, ActivityType> arrivedActivityType;
    public static volatile SingularAttribute<WorkLog, String> arrivedGroup;
    public static volatile SingularAttribute<WorkLog, String> arrivedOpinionGroup;
    public static volatile SingularAttribute<WorkLog, Date> arrivedTime;
    public static volatile SingularAttribute<WorkLog, Boolean> completed;
    public static volatile SingularAttribute<WorkLog, Boolean> connected;
    public static volatile SingularAttribute<WorkLog, Long> duration;
    public static volatile SingularAttribute<WorkLog, String> fromActivity;
    public static volatile SingularAttribute<WorkLog, String> fromActivityAlias;
    public static volatile SingularAttribute<WorkLog, String> fromActivityName;
    public static volatile SingularAttribute<WorkLog, String> fromActivityToken;
    public static volatile SingularAttribute<WorkLog, ActivityType> fromActivityType;
    public static volatile SingularAttribute<WorkLog, String> fromGroup;
    public static volatile SingularAttribute<WorkLog, String> fromOpinionGroup;
    public static volatile SingularAttribute<WorkLog, Date> fromTime;
    public static volatile SingularAttribute<WorkLog, String> id;
    public static volatile SingularAttribute<WorkLog, String> job;
    public static volatile SingularAttribute<WorkLog, String> process;
    public static volatile SingularAttribute<WorkLog, String> processAlias;
    public static volatile SingularAttribute<WorkLog, String> processName;
    public static volatile SingularAttribute<WorkLog, WorkLogProperties> properties;
    public static volatile SingularAttribute<WorkLog, String> route;
    public static volatile SingularAttribute<WorkLog, String> routeName;
    public static volatile SingularAttribute<WorkLog, String> splitToken;
    public static volatile SingularAttribute<WorkLog, String> splitValue;
    public static volatile SingularAttribute<WorkLog, String> splitWork;
    public static volatile SingularAttribute<WorkLog, Boolean> splitting;
    public static volatile SingularAttribute<WorkLog, String> type;
    public static volatile SingularAttribute<WorkLog, String> work;
    public static volatile SingularAttribute<WorkLog, String> workCompleted;

    public WorkLogStatic() {
    }
}
