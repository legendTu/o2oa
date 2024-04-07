package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceWorkPlace.class)
public class AttendanceWorkPlaceStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceWorkPlace, String> creator;
    public static volatile SingularAttribute<AttendanceWorkPlace, String> description;
    public static volatile SingularAttribute<AttendanceWorkPlace, Integer> errorRange;
    public static volatile SingularAttribute<AttendanceWorkPlace, String> id;
    public static volatile SingularAttribute<AttendanceWorkPlace, String> latitude;
    public static volatile SingularAttribute<AttendanceWorkPlace, String> longitude;
    public static volatile SingularAttribute<AttendanceWorkPlace, String> placeAlias;
    public static volatile SingularAttribute<AttendanceWorkPlace, String> placeName;

    public AttendanceWorkPlaceStatic() {
    }
}
