package com.x.portal.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TemplatePage.class)
public class TemplatePageStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<TemplatePage, String> alias;
    public static volatile ListAttribute<TemplatePage, String> availableIdentityList;
    public static volatile ListAttribute<TemplatePage, String> availableUnitList;
    public static volatile SingularAttribute<TemplatePage, String> category;
    public static volatile ListAttribute<TemplatePage, String> controllerList;
    public static volatile SingularAttribute<TemplatePage, String> creatorPerson;
    public static volatile SingularAttribute<TemplatePage, String> data;
    public static volatile SingularAttribute<TemplatePage, String> description;
    public static volatile SingularAttribute<TemplatePage, String> icon;
    public static volatile SingularAttribute<TemplatePage, String> id;
    public static volatile SingularAttribute<TemplatePage, String> lastUpdatePerson;
    public static volatile SingularAttribute<TemplatePage, Date> lastUpdateTime;
    public static volatile SingularAttribute<TemplatePage, String> mobileData;
    public static volatile SingularAttribute<TemplatePage, String> name;
    public static volatile SingularAttribute<TemplatePage, String> preview;

    public TemplatePageStatic() {
    }
}
