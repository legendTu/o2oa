package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Log.class)
public class LogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Log, String> appId;
    public static volatile SingularAttribute<Log, String> categoryId;
    public static volatile SingularAttribute<Log, String> description;
    public static volatile SingularAttribute<Log, String> documentId;
    public static volatile SingularAttribute<Log, String> fileId;
    public static volatile SingularAttribute<Log, String> id;
    public static volatile SingularAttribute<Log, String> operationLevel;
    public static volatile SingularAttribute<Log, String> operationType;
    public static volatile SingularAttribute<Log, String> operatorName;
    public static volatile SingularAttribute<Log, String> operatorUid;

    public LogStatic() {
    }
}
