package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ImportRecord.class)
public class ImportRecordStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ImportRecord, Integer> count;
    public static volatile SingularAttribute<ImportRecord, String> creatorPerson;
    public static volatile SingularAttribute<ImportRecord, String> data;
    public static volatile SingularAttribute<ImportRecord, String> distribution;
    public static volatile SingularAttribute<ImportRecord, Integer> failCount;
    public static volatile SingularAttribute<ImportRecord, String> id;
    public static volatile SingularAttribute<ImportRecord, String> modelId;
    public static volatile SingularAttribute<ImportRecord, String> name;
    public static volatile SingularAttribute<ImportRecord, String> query;
    public static volatile SingularAttribute<ImportRecord, String> status;

    public ImportRecordStatic() {
    }
}
