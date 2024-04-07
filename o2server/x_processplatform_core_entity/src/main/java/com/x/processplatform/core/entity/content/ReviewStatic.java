package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Review.class)
public class ReviewStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Review, String> application;
    public static volatile SingularAttribute<Review, String> applicationAlias;
    public static volatile SingularAttribute<Review, String> applicationName;
    public static volatile SingularAttribute<Review, Boolean> booleanValue01;
    public static volatile SingularAttribute<Review, Boolean> booleanValue02;
    public static volatile SingularAttribute<Review, Boolean> completed;
    public static volatile SingularAttribute<Review, Date> completedTime;
    public static volatile SingularAttribute<Review, String> completedTimeMonth;
    public static volatile SingularAttribute<Review, String> creatorIdentity;
    public static volatile SingularAttribute<Review, String> creatorPerson;
    public static volatile SingularAttribute<Review, String> creatorUnit;
    public static volatile SingularAttribute<Review, String> currentActivityName;
    public static volatile SingularAttribute<Review, Date> dateTimeValue01;
    public static volatile SingularAttribute<Review, Date> dateTimeValue02;
    public static volatile SingularAttribute<Review, Date> dateTimeValue03;
    public static volatile SingularAttribute<Review, Date> dateTimeValue04;
    public static volatile SingularAttribute<Review, Date> dateTimeValue05;
    public static volatile SingularAttribute<Review, Date> dateValue01;
    public static volatile SingularAttribute<Review, Date> dateValue02;
    public static volatile SingularAttribute<Review, Double> doubleValue01;
    public static volatile SingularAttribute<Review, Double> doubleValue02;
    public static volatile SingularAttribute<Review, Double> doubleValue03;
    public static volatile SingularAttribute<Review, Double> doubleValue04;
    public static volatile SingularAttribute<Review, Double> doubleValue05;
    public static volatile SingularAttribute<Review, String> id;
    public static volatile SingularAttribute<Review, String> job;
    public static volatile SingularAttribute<Review, Long> longValue01;
    public static volatile SingularAttribute<Review, Long> longValue02;
    public static volatile SingularAttribute<Review, Long> longValue03;
    public static volatile SingularAttribute<Review, Long> longValue04;
    public static volatile SingularAttribute<Review, Long> longValue05;
    public static volatile SingularAttribute<Review, Boolean> permissionWrite;
    public static volatile SingularAttribute<Review, String> person;
    public static volatile SingularAttribute<Review, String> process;
    public static volatile SingularAttribute<Review, String> processAlias;
    public static volatile SingularAttribute<Review, String> processName;
    public static volatile SingularAttribute<Review, ReviewProperties> properties;
    public static volatile SingularAttribute<Review, String> serial;
    public static volatile SingularAttribute<Review, Date> startTime;
    public static volatile SingularAttribute<Review, String> startTimeMonth;
    public static volatile SingularAttribute<Review, String> stringValue01;
    public static volatile SingularAttribute<Review, String> stringValue02;
    public static volatile SingularAttribute<Review, String> stringValue03;
    public static volatile SingularAttribute<Review, String> stringValue04;
    public static volatile SingularAttribute<Review, String> stringValue05;
    public static volatile SingularAttribute<Review, String> stringValue06;
    public static volatile SingularAttribute<Review, String> stringValue07;
    public static volatile SingularAttribute<Review, String> stringValue08;
    public static volatile SingularAttribute<Review, String> stringValue09;
    public static volatile SingularAttribute<Review, String> stringValue10;
    public static volatile SingularAttribute<Review, Date> timeValue01;
    public static volatile SingularAttribute<Review, Date> timeValue02;
    public static volatile SingularAttribute<Review, String> title;
    public static volatile SingularAttribute<Review, String> work;
    public static volatile SingularAttribute<Review, String> workCompleted;

    public ReviewStatic() {
    }
}
