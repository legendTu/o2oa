package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceDetailMobile.class)
public class AttendanceDetailMobileStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceDetailMobile, Long> checkin_time;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> checkin_type;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> description;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> empName;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> empNo;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> id;
    public static volatile SingularAttribute<AttendanceDetailMobile, Boolean> isExternal;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> latitude;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> longitude;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> optMachineType;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> optSystemName;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> recordAddress;
    public static volatile SingularAttribute<AttendanceDetailMobile, Date> recordDate;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> recordDateString;
    public static volatile SingularAttribute<AttendanceDetailMobile, Integer> recordStatus;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> signDescription;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> signTime;
    public static volatile SingularAttribute<AttendanceDetailMobile, String> workAddress;

    public AttendanceDetailMobileStatic() {
    }
}
