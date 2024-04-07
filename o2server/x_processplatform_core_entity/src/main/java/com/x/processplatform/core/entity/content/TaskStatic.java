//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.processplatform.core.entity.element.ActivityType;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Task.class)
public class TaskStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Task, String> activity;
    public static volatile SingularAttribute<Task, String> activityAlias;
    public static volatile SingularAttribute<Task, String> activityDescription;
    public static volatile SingularAttribute<Task, String> activityName;
    public static volatile SingularAttribute<Task, String> activityToken;
    public static volatile SingularAttribute<Task, ActivityType> activityType;
    public static volatile SingularAttribute<Task, Boolean> allowRapid;
    public static volatile SingularAttribute<Task, String> application;
    public static volatile SingularAttribute<Task, String> applicationAlias;
    public static volatile SingularAttribute<Task, String> applicationName;
    public static volatile SingularAttribute<Task, Boolean> booleanValue01;
    public static volatile SingularAttribute<Task, Boolean> booleanValue02;
    public static volatile SingularAttribute<Task, String> creatorIdentity;
    public static volatile SingularAttribute<Task, String> creatorPerson;
    public static volatile SingularAttribute<Task, String> creatorUnit;
    public static volatile SingularAttribute<Task, Date> dateTimeValue01;
    public static volatile SingularAttribute<Task, Date> dateTimeValue02;
    public static volatile SingularAttribute<Task, Date> dateTimeValue03;
    public static volatile SingularAttribute<Task, Date> dateTimeValue04;
    public static volatile SingularAttribute<Task, Date> dateTimeValue05;
    public static volatile SingularAttribute<Task, Date> dateValue01;
    public static volatile SingularAttribute<Task, Date> dateValue02;
    public static volatile SingularAttribute<Task, String> distinguishedName;
    public static volatile SingularAttribute<Task, Double> doubleValue01;
    public static volatile SingularAttribute<Task, Double> doubleValue02;
    public static volatile SingularAttribute<Task, Double> doubleValue03;
    public static volatile SingularAttribute<Task, Double> doubleValue04;
    public static volatile SingularAttribute<Task, Double> doubleValue05;
    public static volatile SingularAttribute<Task, String> empowerFromIdentity;
    public static volatile SingularAttribute<Task, Date> expireTime;
    public static volatile SingularAttribute<Task, Boolean> expired;
    public static volatile SingularAttribute<Task, Boolean> first;
    public static volatile SingularAttribute<Task, String> fromDistinguishedName;
    public static volatile SingularAttribute<Task, String> id;
    public static volatile SingularAttribute<Task, String> identity;
    public static volatile SingularAttribute<Task, String> job;
    public static volatile SingularAttribute<Task, String> label;
    public static volatile SingularAttribute<Task, Long> longValue01;
    public static volatile SingularAttribute<Task, Long> longValue02;
    public static volatile SingularAttribute<Task, Long> longValue03;
    public static volatile SingularAttribute<Task, Long> longValue04;
    public static volatile SingularAttribute<Task, Long> longValue05;
    public static volatile SingularAttribute<Task, String> mediaOpinion;
    public static volatile SingularAttribute<Task, Boolean> modified;
    public static volatile SingularAttribute<Task, String> opinion;
    public static volatile SingularAttribute<Task, String> opinionLob;
    public static volatile SingularAttribute<Task, Boolean> pause;
    public static volatile SingularAttribute<Task, String> person;
    public static volatile SingularAttribute<Task, String> process;
    public static volatile SingularAttribute<Task, String> processAlias;
    public static volatile SingularAttribute<Task, String> processName;
    public static volatile SingularAttribute<Task, TaskProperties> properties;
    public static volatile SingularAttribute<Task, String> routeAlias;
    public static volatile ListAttribute<Task, String> routeDecisionOpinionList;
    public static volatile ListAttribute<Task, String> routeList;
    public static volatile SingularAttribute<Task, String> routeName;
    public static volatile ListAttribute<Task, String> routeNameList;
    public static volatile ListAttribute<Task, String> routeOpinionList;
    public static volatile SingularAttribute<Task, String> serial;
    public static volatile SingularAttribute<Task, String> series;
    public static volatile SingularAttribute<Task, Date> startTime;
    public static volatile SingularAttribute<Task, String> startTimeMonth;
    public static volatile SingularAttribute<Task, String> stringValue01;
    public static volatile SingularAttribute<Task, String> stringValue02;
    public static volatile SingularAttribute<Task, String> stringValue03;
    public static volatile SingularAttribute<Task, String> stringValue04;
    public static volatile SingularAttribute<Task, String> stringValue05;
    public static volatile SingularAttribute<Task, String> stringValue06;
    public static volatile SingularAttribute<Task, String> stringValue07;
    public static volatile SingularAttribute<Task, String> stringValue08;
    public static volatile SingularAttribute<Task, String> stringValue09;
    public static volatile SingularAttribute<Task, String> stringValue10;
    public static volatile SingularAttribute<Task, Date> timeValue01;
    public static volatile SingularAttribute<Task, Date> timeValue02;
    public static volatile SingularAttribute<Task, String> title;
    public static volatile SingularAttribute<Task, String> unit;
    public static volatile SingularAttribute<Task, Date> urgeTime;
    public static volatile SingularAttribute<Task, Boolean> urged;
    public static volatile SingularAttribute<Task, Date> viewTime;
    public static volatile SingularAttribute<Task, String> work;
    public static volatile SingularAttribute<Task, String> workCreateType;

    public TaskStatic() {
    }
}
