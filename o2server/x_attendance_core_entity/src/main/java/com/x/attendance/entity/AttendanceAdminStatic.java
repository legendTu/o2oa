package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceAdmin.class)
public class AttendanceAdminStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceAdmin, String> admin;
    public static volatile SingularAttribute<AttendanceAdmin, String> adminLevel;
    public static volatile SingularAttribute<AttendanceAdmin, String> adminName;
    public static volatile SingularAttribute<AttendanceAdmin, String> id;
    public static volatile SingularAttribute<AttendanceAdmin, String> unitName;
    public static volatile SingularAttribute<AttendanceAdmin, String> unitOu;

    public AttendanceAdminStatic() {
    }
}
