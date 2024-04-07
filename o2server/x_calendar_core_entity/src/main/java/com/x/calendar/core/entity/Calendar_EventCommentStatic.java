package com.x.calendar.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Calendar_EventComment.class)
public class Calendar_EventCommentStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Calendar_EventComment, Date> checkTime;
    public static volatile SingularAttribute<Calendar_EventComment, String> id;
    public static volatile SingularAttribute<Calendar_EventComment, String> lobValue;

    public Calendar_EventCommentStatic() {
    }
}
