package com.x.organization.core.entity.accredit;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(EmpowerLog.class)
public class EmpowerLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<EmpowerLog, String> activity;
    public static volatile SingularAttribute<EmpowerLog, String> activityAlias;
    public static volatile SingularAttribute<EmpowerLog, String> activityName;
    public static volatile SingularAttribute<EmpowerLog, String> application;
    public static volatile SingularAttribute<EmpowerLog, String> applicationAlias;
    public static volatile SingularAttribute<EmpowerLog, String> applicationName;
    public static volatile SingularAttribute<EmpowerLog, Date> empowerTime;
    public static volatile SingularAttribute<EmpowerLog, String> fromIdentity;
    public static volatile SingularAttribute<EmpowerLog, String> fromPerson;
    public static volatile SingularAttribute<EmpowerLog, String> id;
    public static volatile SingularAttribute<EmpowerLog, String> job;
    public static volatile SingularAttribute<EmpowerLog, String> process;
    public static volatile SingularAttribute<EmpowerLog, String> processAlias;
    public static volatile SingularAttribute<EmpowerLog, String> processName;
    public static volatile SingularAttribute<EmpowerLog, String> title;
    public static volatile SingularAttribute<EmpowerLog, String> toIdentity;
    public static volatile SingularAttribute<EmpowerLog, String> toPerson;
    public static volatile SingularAttribute<EmpowerLog, String> work;

    public EmpowerLogStatic() {
    }
}
