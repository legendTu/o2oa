package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.processplatform.core.entity.element.ActivityType;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Read.class)
public class ReadStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Read, String> activity;
    public static volatile SingularAttribute<Read, String> activityAlias;
    public static volatile SingularAttribute<Read, String> activityDescription;
    public static volatile SingularAttribute<Read, String> activityName;
    public static volatile SingularAttribute<Read, String> activityToken;
    public static volatile SingularAttribute<Read, ActivityType> activityType;
    public static volatile SingularAttribute<Read, String> application;
    public static volatile SingularAttribute<Read, String> applicationAlias;
    public static volatile SingularAttribute<Read, String> applicationName;
    public static volatile SingularAttribute<Read, Boolean> booleanValue01;
    public static volatile SingularAttribute<Read, Boolean> booleanValue02;
    public static volatile SingularAttribute<Read, Boolean> completed;
    public static volatile SingularAttribute<Read, String> creatorIdentity;
    public static volatile SingularAttribute<Read, String> creatorPerson;
    public static volatile SingularAttribute<Read, String> creatorUnit;
    public static volatile SingularAttribute<Read, String> currentActivityName;
    public static volatile SingularAttribute<Read, Date> dateTimeValue01;
    public static volatile SingularAttribute<Read, Date> dateTimeValue02;
    public static volatile SingularAttribute<Read, Date> dateTimeValue03;
    public static volatile SingularAttribute<Read, Date> dateTimeValue04;
    public static volatile SingularAttribute<Read, Date> dateTimeValue05;
    public static volatile SingularAttribute<Read, Date> dateValue01;
    public static volatile SingularAttribute<Read, Date> dateValue02;
    public static volatile SingularAttribute<Read, Double> doubleValue01;
    public static volatile SingularAttribute<Read, Double> doubleValue02;
    public static volatile SingularAttribute<Read, Double> doubleValue03;
    public static volatile SingularAttribute<Read, Double> doubleValue04;
    public static volatile SingularAttribute<Read, Double> doubleValue05;
    public static volatile SingularAttribute<Read, String> id;
    public static volatile SingularAttribute<Read, String> identity;
    public static volatile SingularAttribute<Read, String> job;
    public static volatile SingularAttribute<Read, Long> longValue01;
    public static volatile SingularAttribute<Read, Long> longValue02;
    public static volatile SingularAttribute<Read, Long> longValue03;
    public static volatile SingularAttribute<Read, Long> longValue04;
    public static volatile SingularAttribute<Read, Long> longValue05;
    public static volatile SingularAttribute<Read, String> opinion;
    public static volatile SingularAttribute<Read, String> opinionLob;
    public static volatile SingularAttribute<Read, String> person;
    public static volatile SingularAttribute<Read, String> process;
    public static volatile SingularAttribute<Read, String> processAlias;
    public static volatile SingularAttribute<Read, String> processName;
    public static volatile SingularAttribute<Read, ReadProperties> properties;
    public static volatile SingularAttribute<Read, String> serial;
    public static volatile SingularAttribute<Read, Date> startTime;
    public static volatile SingularAttribute<Read, String> startTimeMonth;
    public static volatile SingularAttribute<Read, String> stringValue01;
    public static volatile SingularAttribute<Read, String> stringValue02;
    public static volatile SingularAttribute<Read, String> stringValue03;
    public static volatile SingularAttribute<Read, String> stringValue04;
    public static volatile SingularAttribute<Read, String> stringValue05;
    public static volatile SingularAttribute<Read, String> stringValue06;
    public static volatile SingularAttribute<Read, String> stringValue07;
    public static volatile SingularAttribute<Read, String> stringValue08;
    public static volatile SingularAttribute<Read, String> stringValue09;
    public static volatile SingularAttribute<Read, String> stringValue10;
    public static volatile SingularAttribute<Read, Date> timeValue01;
    public static volatile SingularAttribute<Read, Date> timeValue02;
    public static volatile SingularAttribute<Read, String> title;
    public static volatile SingularAttribute<Read, String> unit;
    public static volatile SingularAttribute<Read, Date> viewTime;
    public static volatile SingularAttribute<Read, String> work;
    public static volatile SingularAttribute<Read, String> workCompleted;

    public ReadStatic() {
    }
}
