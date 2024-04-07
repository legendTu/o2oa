package com.x.message.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(IMConversation.class)
public class IMConversationStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<IMConversation, String> adminPerson;
    public static volatile SingularAttribute<IMConversation, String> businessBody;
    public static volatile SingularAttribute<IMConversation, String> businessId;
    public static volatile SingularAttribute<IMConversation, String> businessType;
    public static volatile SingularAttribute<IMConversation, String> id;
    public static volatile SingularAttribute<IMConversation, Date> lastMessageTime;
    public static volatile SingularAttribute<IMConversation, String> note;
    public static volatile ListAttribute<IMConversation, String> personList;
    public static volatile SingularAttribute<IMConversation, String> title;
    public static volatile SingularAttribute<IMConversation, String> type;

    public IMConversationStatic() {
    }
}
