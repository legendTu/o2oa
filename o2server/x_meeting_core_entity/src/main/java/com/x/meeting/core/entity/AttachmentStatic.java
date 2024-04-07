package com.x.meeting.core.entity;

import com.x.base.core.entity.StorageObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Attachment.class)
public class AttachmentStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<Attachment, Boolean> deepPath;
    public static volatile SingularAttribute<Attachment, String> extension;
    public static volatile SingularAttribute<Attachment, String> id;
    public static volatile SingularAttribute<Attachment, String> lastUpdatePerson;
    public static volatile SingularAttribute<Attachment, Date> lastUpdateTime;
    public static volatile SingularAttribute<Attachment, Long> length;
    public static volatile SingularAttribute<Attachment, String> meeting;
    public static volatile SingularAttribute<Attachment, String> name;
    public static volatile SingularAttribute<Attachment, String> storage;
    public static volatile SingularAttribute<Attachment, Boolean> summary;

    public AttachmentStatic() {
    }
}
