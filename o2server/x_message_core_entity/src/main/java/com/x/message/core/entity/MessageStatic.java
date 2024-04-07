package com.x.message.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Message.class)
public class MessageStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Message, String> body;
    public static volatile SingularAttribute<Message, Boolean> consumed;
    public static volatile SingularAttribute<Message, String> consumer;
    public static volatile SingularAttribute<Message, String> id;
    public static volatile SingularAttribute<Message, String> instant;
    public static volatile SingularAttribute<Message, String> person;
    public static volatile SingularAttribute<Message, MessageProperties> properties;
    public static volatile SingularAttribute<Message, String> title;
    public static volatile SingularAttribute<Message, String> type;

    public MessageStatic() {
    }
}
