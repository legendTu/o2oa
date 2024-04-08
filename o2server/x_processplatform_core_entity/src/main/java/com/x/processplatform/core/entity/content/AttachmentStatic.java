package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.StorageObjectStatic;
import com.x.processplatform.core.entity.element.ActivityType;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Attachment.class)
public class AttachmentStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<Attachment, String> activity;
    public static volatile SingularAttribute<Attachment, String> activityName;
    public static volatile SingularAttribute<Attachment, String> activityToken;
    public static volatile SingularAttribute<Attachment, ActivityType> activityType;
    public static volatile SingularAttribute<Attachment, String> application;
    public static volatile SingularAttribute<Attachment, Boolean> completed;
    public static volatile ListAttribute<Attachment, String> controllerIdentityList;
    public static volatile ListAttribute<Attachment, String> controllerUnitList;
    public static volatile SingularAttribute<Attachment, Boolean> deepPath;
    public static volatile ListAttribute<Attachment, String> divisionList;
    public static volatile ListAttribute<Attachment, String> editIdentityList;
    public static volatile ListAttribute<Attachment, String> editUnitList;
    public static volatile SingularAttribute<Attachment, String> extension;
    public static volatile SingularAttribute<Attachment, String> fromId;
    public static volatile SingularAttribute<Attachment, String> fromJob;
    public static volatile SingularAttribute<Attachment, String> fromPath;
    public static volatile SingularAttribute<Attachment, String> id;
    public static volatile SingularAttribute<Attachment, String> job;
    public static volatile SingularAttribute<Attachment, String> lastUpdatePerson;
    public static volatile SingularAttribute<Attachment, Date> lastUpdateTime;
    public static volatile SingularAttribute<Attachment, Long> length;
    public static volatile SingularAttribute<Attachment, String> name;
    public static volatile SingularAttribute<Attachment, Integer> objectSecurityClearance;
    public static volatile SingularAttribute<Attachment, Integer> orderNumber;
    public static volatile SingularAttribute<Attachment, String> person;
    public static volatile SingularAttribute<Attachment, String> process;
    public static volatile SingularAttribute<Attachment, AttachmentProperties> properties;
    public static volatile ListAttribute<Attachment, String> readIdentityList;
    public static volatile ListAttribute<Attachment, String> readUnitList;
    public static volatile SingularAttribute<Attachment, String> site;
    public static volatile SingularAttribute<Attachment, String> storage;
    public static volatile SingularAttribute<Attachment, String> stringValue01;
    public static volatile SingularAttribute<Attachment, String> stringValue02;
    public static volatile SingularAttribute<Attachment, String> stringValue03;
    public static volatile SingularAttribute<Attachment, String> text;
    public static volatile SingularAttribute<Attachment, String> type;
    public static volatile SingularAttribute<Attachment, String> work;
    public static volatile SingularAttribute<Attachment, String> workCompleted;
    public static volatile SingularAttribute<Attachment, Date> workCreateTime;

    public AttachmentStatic() {
    }
}
