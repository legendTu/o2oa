package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceEmployeeConfig.class)
public class AttendanceEmployeeConfigStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> configType;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> empInTopUnitTime;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> employeeName;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> employeeNumber;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> id;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> topUnitName;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> topUnitOu;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> unitName;
    public static volatile SingularAttribute<AttendanceEmployeeConfig, String> unitOu;

    public AttendanceEmployeeConfigStatic() {
    }
}
