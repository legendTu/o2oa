package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceDingtalkDetail.class)
public class AttendanceDingtalkDetailStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Long> baseCheckTime;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> checkType;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Long> ddId;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Long> groupId;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> id;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> locationResult;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> o2Unit;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> o2User;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Long> planId;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Long> recordId;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> sourceType;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> timeResult;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Long> userCheckTime;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Date> userCheckTimeDate;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, String> userId;
    public static volatile SingularAttribute<AttendanceDingtalkDetail, Long> workDate;

    public AttendanceDingtalkDetailStatic() {
    }
}
