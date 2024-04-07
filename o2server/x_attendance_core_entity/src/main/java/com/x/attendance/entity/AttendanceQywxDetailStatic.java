package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceQywxDetail.class)
public class AttendanceQywxDetailStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceQywxDetail, Long> checkin_time;
    public static volatile SingularAttribute<AttendanceQywxDetail, Date> checkin_time_date;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> checkin_type;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> exception_type;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> groupname;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> id;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> location_detail;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> location_title;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> notes;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> o2Unit;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> o2User;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> userid;
    public static volatile SingularAttribute<AttendanceQywxDetail, String> wifiname;

    public AttendanceQywxDetailStatic() {
    }
}
