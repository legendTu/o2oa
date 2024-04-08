package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(KeyLock.class)
public class KeyLockStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<KeyLock, String> id;
    public static volatile SingularAttribute<KeyLock, String> key;
    public static volatile SingularAttribute<KeyLock, String> person;

    public KeyLockStatic() {
    }
}
