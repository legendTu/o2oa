package com.x.message.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(IMMsg.class)
public class IMMsgStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<IMMsg, String> body;
    public static volatile SingularAttribute<IMMsg, String> conversationId;
    public static volatile SingularAttribute<IMMsg, String> createPerson;
    public static volatile SingularAttribute<IMMsg, String> id;

    public IMMsgStatic() {
    }
}
