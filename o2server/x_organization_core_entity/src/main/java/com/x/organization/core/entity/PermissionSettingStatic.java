package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(PermissionSetting.class)
public class PermissionSettingStatic extends SliceJpaObjectStatic {
    public static volatile ListAttribute<PermissionSetting, String> excludePerson;
    public static volatile ListAttribute<PermissionSetting, String> excludeUnit;
    public static volatile SingularAttribute<PermissionSetting, String> explain;
    public static volatile SingularAttribute<PermissionSetting, String> extend1;
    public static volatile SingularAttribute<PermissionSetting, String> extend2;
    public static volatile SingularAttribute<PermissionSetting, String> extend3;
    public static volatile SingularAttribute<PermissionSetting, String> id;
    public static volatile ListAttribute<PermissionSetting, String> limitQueryAll;
    public static volatile ListAttribute<PermissionSetting, String> limitQueryOuter;
    public static volatile SingularAttribute<PermissionSetting, String> status;

    public PermissionSettingStatic() {
    }
}
