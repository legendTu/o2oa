package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CmsBatchOperation.class)
public class CmsBatchOperationStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<CmsBatchOperation, String> bundle;
    public static volatile SingularAttribute<CmsBatchOperation, String> description;
    public static volatile SingularAttribute<CmsBatchOperation, Integer> errorCount;
    public static volatile SingularAttribute<CmsBatchOperation, String> id;
    public static volatile SingularAttribute<CmsBatchOperation, Boolean> isRunning;
    public static volatile SingularAttribute<CmsBatchOperation, String> objType;
    public static volatile SingularAttribute<CmsBatchOperation, String> oldInfo;
    public static volatile SingularAttribute<CmsBatchOperation, String> optType;

    public CmsBatchOperationStatic() {
    }
}
