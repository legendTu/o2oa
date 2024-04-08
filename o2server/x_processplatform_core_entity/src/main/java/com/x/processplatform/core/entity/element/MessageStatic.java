package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Message.class)
public class MessageStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Message, String> process;
    public static volatile SingularAttribute<Message, String> id;
    public static volatile SingularAttribute<Message, String> form;
    public MessageStatic() {
    }
}
