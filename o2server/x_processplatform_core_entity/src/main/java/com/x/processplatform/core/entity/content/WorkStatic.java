package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.processplatform.core.entity.element.ActivityType;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Work.class)
public class WorkStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Work, String> activity;
    public static volatile SingularAttribute<Work, String> activityAlias;
    public static volatile SingularAttribute<Work, Date> activityArrivedTime;
    public static volatile SingularAttribute<Work, String> activityDescription;
    public static volatile SingularAttribute<Work, String> activityName;
    public static volatile SingularAttribute<Work, String> activityToken;
    public static volatile SingularAttribute<Work, ActivityType> activityType;
    public static volatile SingularAttribute<Work, String> application;
    public static volatile SingularAttribute<Work, String> applicationAlias;
    public static volatile SingularAttribute<Work, String> applicationName;
    public static volatile SingularAttribute<Work, Boolean> beforeExecuted;
    public static volatile SingularAttribute<Work, Boolean> booleanValue01;
    public static volatile SingularAttribute<Work, Boolean> booleanValue02;
    public static volatile SingularAttribute<Work, String> creatorIdentity;
    public static volatile SingularAttribute<Work, String> creatorPerson;
    public static volatile SingularAttribute<Work, String> creatorUnit;
    public static volatile SingularAttribute<Work, String> creatorUnitLevelName;
    public static volatile SingularAttribute<Work, Boolean> dataChanged;
    public static volatile SingularAttribute<Work, Date> dateTimeValue01;
    public static volatile SingularAttribute<Work, Date> dateTimeValue02;
    public static volatile SingularAttribute<Work, Date> dateTimeValue03;
    public static volatile SingularAttribute<Work, Date> dateTimeValue04;
    public static volatile SingularAttribute<Work, Date> dateTimeValue05;
    public static volatile SingularAttribute<Work, Date> dateValue01;
    public static volatile SingularAttribute<Work, Date> dateValue02;
    public static volatile SingularAttribute<Work, String> destinationActivity;
    public static volatile SingularAttribute<Work, ActivityType> destinationActivityType;
    public static volatile SingularAttribute<Work, String> destinationRoute;
    public static volatile SingularAttribute<Work, String> destinationRouteName;
    public static volatile SingularAttribute<Work, Double> doubleValue01;
    public static volatile SingularAttribute<Work, Double> doubleValue02;
    public static volatile SingularAttribute<Work, Double> doubleValue03;
    public static volatile SingularAttribute<Work, Double> doubleValue04;
    public static volatile SingularAttribute<Work, Double> doubleValue05;
    public static volatile SingularAttribute<Work, String> embedTargetWork;
    public static volatile SingularAttribute<Work, Date> expireTime;
    public static volatile SingularAttribute<Work, String> form;
    public static volatile SingularAttribute<Work, String> id;
    public static volatile SingularAttribute<Work, String> job;
    public static volatile SingularAttribute<Work, Long> longValue01;
    public static volatile SingularAttribute<Work, Long> longValue02;
    public static volatile SingularAttribute<Work, Long> longValue03;
    public static volatile SingularAttribute<Work, Long> longValue04;
    public static volatile SingularAttribute<Work, Long> longValue05;
    public static volatile SingularAttribute<Work, Integer> objectSecurityClearance;
    public static volatile SingularAttribute<Work, String> process;
    public static volatile SingularAttribute<Work, String> processAlias;
    public static volatile SingularAttribute<Work, String> processName;
    public static volatile SingularAttribute<Work, WorkProperties> properties;
    public static volatile SingularAttribute<Work, String> serial;
    public static volatile SingularAttribute<Work, String> splitToken;
    public static volatile ListAttribute<Work, String> splitTokenList;
    public static volatile SingularAttribute<Work, String> splitValue;
    public static volatile SingularAttribute<Work, Boolean> splitting;
    public static volatile SingularAttribute<Work, Date> startTime;
    public static volatile SingularAttribute<Work, String> startTimeMonth;
    public static volatile SingularAttribute<Work, String> stringValue01;
    public static volatile SingularAttribute<Work, String> stringValue02;
    public static volatile SingularAttribute<Work, String> stringValue03;
    public static volatile SingularAttribute<Work, String> stringValue04;
    public static volatile SingularAttribute<Work, String> stringValue05;
    public static volatile SingularAttribute<Work, String> stringValue06;
    public static volatile SingularAttribute<Work, String> stringValue07;
    public static volatile SingularAttribute<Work, String> stringValue08;
    public static volatile SingularAttribute<Work, String> stringValue09;
    public static volatile SingularAttribute<Work, String> stringValue10;
    public static volatile SingularAttribute<Work, Date> timeValue01;
    public static volatile SingularAttribute<Work, Date> timeValue02;
    public static volatile SingularAttribute<Work, String> title;
    public static volatile SingularAttribute<Work, String> workCreateType;
    public static volatile SingularAttribute<Work, WorkStatus> workStatus;
    public static volatile SingularAttribute<Work, Boolean> workThroughManual;

    public WorkStatic() {
    }
}
