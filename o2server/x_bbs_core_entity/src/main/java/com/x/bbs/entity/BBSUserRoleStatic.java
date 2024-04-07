package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSUserRole.class)
public class BBSUserRoleStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSUserRole, String> forumId;
    public static volatile SingularAttribute<BBSUserRole, String> id;
    public static volatile SingularAttribute<BBSUserRole, String> mainSectionId;
    public static volatile SingularAttribute<BBSUserRole, String> objectName;
    public static volatile SingularAttribute<BBSUserRole, String> objectType;
    public static volatile SingularAttribute<BBSUserRole, Integer> orderNumber;
    public static volatile SingularAttribute<BBSUserRole, String> roleCode;
    public static volatile SingularAttribute<BBSUserRole, String> roleId;
    public static volatile SingularAttribute<BBSUserRole, String> roleName;
    public static volatile SingularAttribute<BBSUserRole, String> sectionId;
    public static volatile SingularAttribute<BBSUserRole, String> topUnitName;
    public static volatile SingularAttribute<BBSUserRole, String> uniqueId;
    public static volatile SingularAttribute<BBSUserRole, String> unitName;

    public BBSUserRoleStatic() {
    }
}
