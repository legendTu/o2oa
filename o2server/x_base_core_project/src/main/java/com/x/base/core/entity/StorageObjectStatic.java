package com.x.base.core.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(StorageObject.class)
public class StorageObjectStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<StorageObject, String> encryptKey;

    public StorageObjectStatic() {
    }
}
