package com.x.file.core.entity.personal;

import com.x.base.core.entity.StorageObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Attachment.class)
public class AttachmentStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<Attachment, Boolean> deepPath;
    public static volatile ListAttribute<Attachment, String> editorList;
    public static volatile SingularAttribute<Attachment, String> extension;
    public static volatile SingularAttribute<Attachment, String> folder;
    public static volatile SingularAttribute<Attachment, String> id;
    public static volatile SingularAttribute<Attachment, String> lastUpdatePerson;
    public static volatile SingularAttribute<Attachment, Date> lastUpdateTime;
    public static volatile SingularAttribute<Attachment, Long> length;
    public static volatile SingularAttribute<Attachment, String> name;
    public static volatile SingularAttribute<Attachment, String> person;
    public static volatile ListAttribute<Attachment, String> shareList;
    public static volatile SingularAttribute<Attachment, String> storage;

    public AttachmentStatic() {
    }
}
