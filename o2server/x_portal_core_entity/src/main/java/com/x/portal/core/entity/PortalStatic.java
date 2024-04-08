package com.x.portal.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Portal.class)
public class PortalStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Portal, String> alias;
    public static volatile ListAttribute<Portal, String> availableGroupList;
    public static volatile ListAttribute<Portal, String> availableIdentityList;
    public static volatile ListAttribute<Portal, String> availableUnitList;
    public static volatile ListAttribute<Portal, String> controllerList;
    public static volatile SingularAttribute<Portal, String> creatorPerson;
    public static volatile SingularAttribute<Portal, String> description;
    public static volatile SingularAttribute<Portal, String> firstPage;
    public static volatile SingularAttribute<Portal, String> icon;
    public static volatile SingularAttribute<Portal, String> id;
    public static volatile SingularAttribute<Portal, String> lastUpdatePerson;
    public static volatile SingularAttribute<Portal, Date> lastUpdateTime;
    public static volatile SingularAttribute<Portal, Boolean> mobileClient;
    public static volatile SingularAttribute<Portal, String> name;
    public static volatile SingularAttribute<Portal, Boolean> pcClient;
    public static volatile SingularAttribute<Portal, String> portalCategory;
    public static volatile SingularAttribute<Portal, PortalProperties> properties;

    public PortalStatic() {
    }
}
