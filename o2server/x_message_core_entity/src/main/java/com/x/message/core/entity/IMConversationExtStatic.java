//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.x.message.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(IMConversationExt.class)
public class IMConversationExtStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<IMConversationExt, String> conversationId;
    public static volatile SingularAttribute<IMConversationExt, String> id;
    public static volatile SingularAttribute<IMConversationExt, Boolean> isDeleted;
    public static volatile SingularAttribute<IMConversationExt, Boolean> isTop;
    public static volatile SingularAttribute<IMConversationExt, Date> lastDeleteTime;
    public static volatile SingularAttribute<IMConversationExt, Date> lastReadTime;
    public static volatile SingularAttribute<IMConversationExt, String> person;

    public IMConversationExtStatic() {
    }
}
