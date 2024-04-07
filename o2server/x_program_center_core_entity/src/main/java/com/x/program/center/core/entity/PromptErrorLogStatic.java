package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PromptErrorLog.class)
public class PromptErrorLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<PromptErrorLog, Boolean> collected;
    public static volatile SingularAttribute<PromptErrorLog, String> exceptionClass;
    public static volatile SingularAttribute<PromptErrorLog, String> id;
    public static volatile SingularAttribute<PromptErrorLog, String> loggerName;
    public static volatile SingularAttribute<PromptErrorLog, String> message;
    public static volatile SingularAttribute<PromptErrorLog, Date> occurTime;
    public static volatile SingularAttribute<PromptErrorLog, String> person;
    public static volatile SingularAttribute<PromptErrorLog, String> requestBody;
    public static volatile SingularAttribute<PromptErrorLog, Long> requestBodyLength;
    public static volatile SingularAttribute<PromptErrorLog, String> requestHead;
    public static volatile SingularAttribute<PromptErrorLog, String> requestMethod;
    public static volatile SingularAttribute<PromptErrorLog, String> requestRemoteAddr;
    public static volatile SingularAttribute<PromptErrorLog, String> requestRemoteHost;
    public static volatile SingularAttribute<PromptErrorLog, String> requestUrl;
    public static volatile SingularAttribute<PromptErrorLog, String> stackTrace;
    public static volatile SingularAttribute<PromptErrorLog, String> version;

    public PromptErrorLogStatic() {
    }
}
