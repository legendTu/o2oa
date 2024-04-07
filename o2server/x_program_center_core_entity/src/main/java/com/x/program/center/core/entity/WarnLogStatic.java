package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(WarnLog.class)
public class WarnLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<WarnLog, Boolean> collected;
    public static volatile SingularAttribute<WarnLog, String> id;
    public static volatile SingularAttribute<WarnLog, String> loggerName;
    public static volatile SingularAttribute<WarnLog, String> message;
    public static volatile SingularAttribute<WarnLog, Date> occurTime;
    public static volatile SingularAttribute<WarnLog, String> version;

    public WarnLogStatic() {
    }
}
