package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSOperationRecord.class)
public class BBSOperationRecordStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSOperationRecord, String> forumId;
    public static volatile SingularAttribute<BBSOperationRecord, String> forumName;
    public static volatile SingularAttribute<BBSOperationRecord, String> hostIp;
    public static volatile SingularAttribute<BBSOperationRecord, String> hostname;
    public static volatile SingularAttribute<BBSOperationRecord, String> id;
    public static volatile SingularAttribute<BBSOperationRecord, String> mainSectionId;
    public static volatile SingularAttribute<BBSOperationRecord, String> mainSectionName;
    public static volatile SingularAttribute<BBSOperationRecord, String> objectId;
    public static volatile SingularAttribute<BBSOperationRecord, String> objectName;
    public static volatile SingularAttribute<BBSOperationRecord, String> objectType;
    public static volatile SingularAttribute<BBSOperationRecord, String> operatorName;
    public static volatile SingularAttribute<BBSOperationRecord, String> optType;
    public static volatile SingularAttribute<BBSOperationRecord, String> sectionId;
    public static volatile SingularAttribute<BBSOperationRecord, String> sectionName;
    public static volatile SingularAttribute<BBSOperationRecord, String> subjectId;
    public static volatile SingularAttribute<BBSOperationRecord, String> title;

    public BBSOperationRecordStatic() {
    }
}
