package com.x.portal.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Widget.class)
public class WidgetStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Widget, String> alias;
    public static volatile SingularAttribute<Widget, String> category;
    public static volatile SingularAttribute<Widget, String> data;
    public static volatile SingularAttribute<Widget, String> description;
    public static volatile SingularAttribute<Widget, Boolean> hasMobile;
    public static volatile SingularAttribute<Widget, String> id;
    public static volatile SingularAttribute<Widget, String> mobileData;
    public static volatile SingularAttribute<Widget, String> name;
    public static volatile SingularAttribute<Widget, String> portal;

    public WidgetStatic() {
    }
}
