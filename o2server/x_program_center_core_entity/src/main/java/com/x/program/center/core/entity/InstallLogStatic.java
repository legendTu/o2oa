package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(InstallLog.class)
public class InstallLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<InstallLog, String> category;
    public static volatile SingularAttribute<InstallLog, String> data;
    public static volatile SingularAttribute<InstallLog, String> id;
    public static volatile SingularAttribute<InstallLog, String> installPerson;
    public static volatile SingularAttribute<InstallLog, Date> installTime;
    public static volatile SingularAttribute<InstallLog, String> name;
    public static volatile SingularAttribute<InstallLog, String> status;
    public static volatile SingularAttribute<InstallLog, String> unInstallPerson;
    public static volatile SingularAttribute<InstallLog, Date> unInstallTime;
    public static volatile SingularAttribute<InstallLog, String> version;

    public InstallLogStatic() {
    }
}
