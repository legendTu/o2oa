package com.x.portal.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Page.class)
public class PageStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Page, String> alias;
    public static volatile SingularAttribute<Page, String> category;
    public static volatile SingularAttribute<Page, String> data;
    public static volatile SingularAttribute<Page, String> description;
    public static volatile SingularAttribute<Page, Boolean> hasMobile;
    public static volatile SingularAttribute<Page, String> id;
    public static volatile SingularAttribute<Page, String> mobileData;
    public static volatile SingularAttribute<Page, String> name;
    public static volatile SingularAttribute<Page, String> portal;
    public static volatile SingularAttribute<Page, PageProperties> properties;

    public PageStatic() {
    }
}
