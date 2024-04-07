package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceStatisticRequireLog.class)
public class AttendanceStatisticRequireLogStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> description;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> id;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> processStatus;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, Date> processTime;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> statisticDay;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> statisticKey;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> statisticMonth;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> statisticName;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> statisticType;
    public static volatile SingularAttribute<AttendanceStatisticRequireLog, String> statisticYear;

    public AttendanceStatisticRequireLogStatic() {
    }
}
