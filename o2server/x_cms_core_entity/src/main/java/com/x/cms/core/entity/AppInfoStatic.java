package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AppInfo.class)
public class AppInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AppInfo, Boolean> allPeoplePublish;
    public static volatile SingularAttribute<AppInfo, Boolean> allPeopleView;
    public static volatile SingularAttribute<AppInfo, Boolean> allowWaitPublish;
    public static volatile SingularAttribute<AppInfo, Boolean> anonymousAble;
    public static volatile SingularAttribute<AppInfo, String> appAlias;
    public static volatile SingularAttribute<AppInfo, String> appIcon;
    public static volatile SingularAttribute<AppInfo, String> appInfoSeq;
    public static volatile SingularAttribute<AppInfo, String> appMemo;
    public static volatile SingularAttribute<AppInfo, String> appName;
    public static volatile SingularAttribute<AppInfo, String> appType;
    public static volatile ListAttribute<AppInfo, String> categoryList;
    public static volatile SingularAttribute<AppInfo, String> creatorIdentity;
    public static volatile SingularAttribute<AppInfo, String> creatorPerson;
    public static volatile SingularAttribute<AppInfo, String> creatorTopUnitName;
    public static volatile SingularAttribute<AppInfo, String> creatorUnitName;
    public static volatile SingularAttribute<AppInfo, String> defaultEditForm;
    public static volatile SingularAttribute<AppInfo, String> defaultReadForm;
    public static volatile SingularAttribute<AppInfo, String> description;
    public static volatile SingularAttribute<AppInfo, String> documentType;
    public static volatile SingularAttribute<AppInfo, String> iconColor;
    public static volatile SingularAttribute<AppInfo, String> id;
    public static volatile ListAttribute<AppInfo, String> manageableGroupList;
    public static volatile ListAttribute<AppInfo, String> manageablePersonList;
    public static volatile ListAttribute<AppInfo, String> manageableUnitList;
    public static volatile ListAttribute<AppInfo, String> publishableGroupList;
    public static volatile ListAttribute<AppInfo, String> publishablePersonList;
    public static volatile ListAttribute<AppInfo, String> publishableUnitList;
    public static volatile SingularAttribute<AppInfo, Boolean> sendNotify;
    public static volatile SingularAttribute<AppInfo, Boolean> showAllDocuments;
    public static volatile ListAttribute<AppInfo, String> viewableGroupList;
    public static volatile ListAttribute<AppInfo, String> viewablePersonList;
    public static volatile ListAttribute<AppInfo, String> viewableUnitList;

    public AppInfoStatic() {
    }
}
