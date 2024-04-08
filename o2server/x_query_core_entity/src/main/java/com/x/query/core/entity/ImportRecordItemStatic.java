package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ImportRecordItem.class)
public class ImportRecordItemStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ImportRecordItem, String> data;
    public static volatile SingularAttribute<ImportRecordItem, String> distribution;
    public static volatile SingularAttribute<ImportRecordItem, String> docId;
    public static volatile SingularAttribute<ImportRecordItem, String> docTitle;
    public static volatile SingularAttribute<ImportRecordItem, String> docType;
    public static volatile SingularAttribute<ImportRecordItem, String> id;
    public static volatile SingularAttribute<ImportRecordItem, String> modelId;
    public static volatile SingularAttribute<ImportRecordItem, String> query;
    public static volatile SingularAttribute<ImportRecordItem, String> recordId;
    public static volatile SingularAttribute<ImportRecordItem, String> srcData;
    public static volatile SingularAttribute<ImportRecordItem, String> status;

    public ImportRecordItemStatic() {
    }
}
