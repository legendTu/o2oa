package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSRoleInfo.class)
public class BBSRoleInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSRoleInfo, String> creatorName;
    public static volatile SingularAttribute<BBSRoleInfo, String> description;
    public static volatile SingularAttribute<BBSRoleInfo, String> forumId;
    public static volatile SingularAttribute<BBSRoleInfo, String> forumName;
    public static volatile SingularAttribute<BBSRoleInfo, String> id;
    public static volatile SingularAttribute<BBSRoleInfo, String> mainSectionId;
    public static volatile SingularAttribute<BBSRoleInfo, String> mainSectionName;
    public static volatile SingularAttribute<BBSRoleInfo, Integer> orderNumber;
    public static volatile SingularAttribute<BBSRoleInfo, String> roleCode;
    public static volatile SingularAttribute<BBSRoleInfo, String> roleName;
    public static volatile SingularAttribute<BBSRoleInfo, String> roleType;
    public static volatile SingularAttribute<BBSRoleInfo, String> sectionId;
    public static volatile SingularAttribute<BBSRoleInfo, String> sectionName;

    public BBSRoleInfoStatic() {
    }
}
