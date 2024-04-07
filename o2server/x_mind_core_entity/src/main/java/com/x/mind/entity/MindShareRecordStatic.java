package com.x.mind.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MindShareRecord.class)
public class MindShareRecordStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<MindShareRecord, String> fileId;
    public static volatile SingularAttribute<MindShareRecord, String> fileStatus;
    public static volatile SingularAttribute<MindShareRecord, String> fileType;
    public static volatile SingularAttribute<MindShareRecord, String> id;
    public static volatile SingularAttribute<MindShareRecord, String> name;
    public static volatile SingularAttribute<MindShareRecord, String> shareType;
    public static volatile SingularAttribute<MindShareRecord, String> source;
    public static volatile SingularAttribute<MindShareRecord, String> target;
    public static volatile SingularAttribute<MindShareRecord, String> targetType;

    public MindShareRecordStatic() {
    }
}
