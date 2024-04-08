package com.x.organization.core.entity.accredit;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Empower.class)
public class EmpowerStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Empower, String> application;
    public static volatile SingularAttribute<Empower, String> applicationAlias;
    public static volatile SingularAttribute<Empower, String> applicationName;
    public static volatile SingularAttribute<Empower, Date> completedTime;
    public static volatile SingularAttribute<Empower, String> edition;
    public static volatile SingularAttribute<Empower, Boolean> enable;
    public static volatile SingularAttribute<Empower, String> filterListData;
    public static volatile SingularAttribute<Empower, String> fromIdentity;
    public static volatile SingularAttribute<Empower, String> fromPerson;
    public static volatile SingularAttribute<Empower, String> id;
    public static volatile SingularAttribute<Empower, Boolean> keepEnable;
    public static volatile SingularAttribute<Empower, String> process;
    public static volatile SingularAttribute<Empower, String> processAlias;
    public static volatile SingularAttribute<Empower, String> processName;
    public static volatile SingularAttribute<Empower, Date> startTime;
    public static volatile SingularAttribute<Empower, String> toIdentity;
    public static volatile SingularAttribute<Empower, String> toPerson;
    public static volatile SingularAttribute<Empower, String> type;

    public EmpowerStatic() {
    }
}
