package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSPermissionInfo.class)
public class BBSPermissionInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSPermissionInfo, String> description;
    public static volatile SingularAttribute<BBSPermissionInfo, String> forumId;
    public static volatile SingularAttribute<BBSPermissionInfo, String> forumName;
    public static volatile SingularAttribute<BBSPermissionInfo, String> id;
    public static volatile SingularAttribute<BBSPermissionInfo, String> mainSectionId;
    public static volatile SingularAttribute<BBSPermissionInfo, String> mainSectionName;
    public static volatile SingularAttribute<BBSPermissionInfo, Integer> orderNumber;
    public static volatile SingularAttribute<BBSPermissionInfo, String> permissionCode;
    public static volatile SingularAttribute<BBSPermissionInfo, String> permissionFunction;
    public static volatile SingularAttribute<BBSPermissionInfo, String> permissionName;
    public static volatile SingularAttribute<BBSPermissionInfo, String> permissionType;
    public static volatile SingularAttribute<BBSPermissionInfo, String> sectionId;
    public static volatile SingularAttribute<BBSPermissionInfo, String> sectionName;

    public BBSPermissionInfoStatic() {
    }
}
