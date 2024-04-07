package com.x.calendar.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Calendar.class)
public class CalendarStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Calendar, String> color;
    public static volatile SingularAttribute<Calendar, String> createor;
    public static volatile SingularAttribute<Calendar, String> description;
    public static volatile ListAttribute<Calendar, String> followers;
    public static volatile SingularAttribute<Calendar, String> id;
    public static volatile SingularAttribute<Calendar, Boolean> isPublic;
    public static volatile ListAttribute<Calendar, String> manageablePersonList;
    public static volatile SingularAttribute<Calendar, String> name;
    public static volatile ListAttribute<Calendar, String> publishableGroupList;
    public static volatile ListAttribute<Calendar, String> publishablePersonList;
    public static volatile ListAttribute<Calendar, String> publishableUnitList;
    public static volatile SingularAttribute<Calendar, String> source;
    public static volatile SingularAttribute<Calendar, String> status;
    public static volatile SingularAttribute<Calendar, String> target;
    public static volatile SingularAttribute<Calendar, String> type;
    public static volatile ListAttribute<Calendar, String> viewableGroupList;
    public static volatile ListAttribute<Calendar, String> viewablePersonList;
    public static volatile ListAttribute<Calendar, String> viewableUnitList;

    public CalendarStatic() {
    }
}
