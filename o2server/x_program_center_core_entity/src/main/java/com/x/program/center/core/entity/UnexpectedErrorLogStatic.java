package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(UnexpectedErrorLog.class)
public class UnexpectedErrorLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<UnexpectedErrorLog, Boolean> collected;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> exceptionClass;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> id;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> loggerName;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> message;
    public static volatile SingularAttribute<UnexpectedErrorLog, Date> occurTime;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> person;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> requestBody;
    public static volatile SingularAttribute<UnexpectedErrorLog, Long> requestBodyLength;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> requestHead;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> requestMethod;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> requestRemoteAddr;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> requestRemoteHost;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> requestUrl;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> stackTrace;
    public static volatile SingularAttribute<UnexpectedErrorLog, String> version;

    public UnexpectedErrorLogStatic() {
    }
}
