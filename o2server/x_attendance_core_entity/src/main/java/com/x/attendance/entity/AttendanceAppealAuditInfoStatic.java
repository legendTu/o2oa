package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AttendanceAppealAuditInfo.class)
public class AttendanceAppealAuditInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> auditFlowType;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> currentProcessor;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> detailId;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> id;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, Date> lastFlowSyncTime;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> opinion1;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> opinion2;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> processPerson1;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> processPerson2;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> processPersonTopUnit1;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> processPersonTopUnit2;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> processPersonUnit1;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> processPersonUnit2;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, Date> processTime1;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, Date> processTime2;
    public static volatile SingularAttribute<AttendanceAppealAuditInfo, String> workId;

    public AttendanceAppealAuditInfoStatic() {
    }
}
