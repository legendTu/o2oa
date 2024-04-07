package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DocumentViewRecord.class)
public class DocumentViewRecordStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<DocumentViewRecord, String> appId;
    public static volatile SingularAttribute<DocumentViewRecord, String> appName;
    public static volatile SingularAttribute<DocumentViewRecord, String> categoryId;
    public static volatile SingularAttribute<DocumentViewRecord, String> categoryName;
    public static volatile SingularAttribute<DocumentViewRecord, String> documentId;
    public static volatile SingularAttribute<DocumentViewRecord, String> id;
    public static volatile SingularAttribute<DocumentViewRecord, Date> lastViewTime;
    public static volatile SingularAttribute<DocumentViewRecord, String> title;
    public static volatile SingularAttribute<DocumentViewRecord, Integer> viewCount;
    public static volatile SingularAttribute<DocumentViewRecord, String> viewerName;
    public static volatile SingularAttribute<DocumentViewRecord, String> viewerTopUnitName;
    public static volatile SingularAttribute<DocumentViewRecord, String> viewerUnitName;

    public DocumentViewRecordStatic() {
    }
}
