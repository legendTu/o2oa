package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import com.x.processplatform.core.entity.element.ActivityType;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DocumentVersion.class)
public class DocumentVersionStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<DocumentVersion, String> activity;
    public static volatile SingularAttribute<DocumentVersion, String> activityAlias;
    public static volatile SingularAttribute<DocumentVersion, String> activityDescription;
    public static volatile SingularAttribute<DocumentVersion, String> activityName;
    public static volatile SingularAttribute<DocumentVersion, String> activityToken;
    public static volatile SingularAttribute<DocumentVersion, ActivityType> activityType;
    public static volatile SingularAttribute<DocumentVersion, String> application;
    public static volatile SingularAttribute<DocumentVersion, String> category;
    public static volatile SingularAttribute<DocumentVersion, Boolean> completed;
    public static volatile SingularAttribute<DocumentVersion, String> data;
    public static volatile SingularAttribute<DocumentVersion, String> id;
    public static volatile SingularAttribute<DocumentVersion, String> job;
    public static volatile SingularAttribute<DocumentVersion, String> person;
    public static volatile SingularAttribute<DocumentVersion, String> process;

    public DocumentVersionStatic() {
    }
}
