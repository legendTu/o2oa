package com.x.component.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Component.class)
public class ComponentStatic extends SliceJpaObjectStatic {
    public static volatile ListAttribute<Component, String> allowList;
    public static volatile ListAttribute<Component, String> denyList;
    public static volatile SingularAttribute<Component, String> iconPath;
    public static volatile SingularAttribute<Component, String> id;
    public static volatile SingularAttribute<Component, String> name;
    public static volatile SingularAttribute<Component, Integer> orderNumber;
    public static volatile SingularAttribute<Component, String> path;
    public static volatile SingularAttribute<Component, String> title;
    public static volatile SingularAttribute<Component, String> type;
    public static volatile SingularAttribute<Component, Boolean> visible;

    public ComponentStatic() {
    }
}
