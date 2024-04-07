package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSPermissionRole.class)
public class BBSPermissionRoleStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSPermissionRole, String> description;
    public static volatile SingularAttribute<BBSPermissionRole, String> forumId;
    public static volatile SingularAttribute<BBSPermissionRole, String> forumName;
    public static volatile SingularAttribute<BBSPermissionRole, String> id;
    public static volatile SingularAttribute<BBSPermissionRole, String> mainSectionId;
    public static volatile SingularAttribute<BBSPermissionRole, String> mainSectionName;
    public static volatile SingularAttribute<BBSPermissionRole, Integer> orderNumber;
    public static volatile SingularAttribute<BBSPermissionRole, String> permissionCode;
    public static volatile SingularAttribute<BBSPermissionRole, String> permissionName;
    public static volatile SingularAttribute<BBSPermissionRole, String> permissionType;
    public static volatile SingularAttribute<BBSPermissionRole, String> roleCode;
    public static volatile SingularAttribute<BBSPermissionRole, String> roleId;
    public static volatile SingularAttribute<BBSPermissionRole, String> roleName;
    public static volatile SingularAttribute<BBSPermissionRole, String> sectionId;
    public static volatile SingularAttribute<BBSPermissionRole, String> sectionName;

    public BBSPermissionRoleStatic() {
    }
}
