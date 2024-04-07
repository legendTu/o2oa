package com.x.attendance.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DingdingQywxSyncRecord.class)
public class DingdingQywxSyncRecordStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<DingdingQywxSyncRecord, Long> dateFrom;
    public static volatile SingularAttribute<DingdingQywxSyncRecord, Long> dateTo;
    public static volatile SingularAttribute<DingdingQywxSyncRecord, Date> endTime;
    public static volatile SingularAttribute<DingdingQywxSyncRecord, String> exceptionMessage;
    public static volatile SingularAttribute<DingdingQywxSyncRecord, String> id;
    public static volatile SingularAttribute<DingdingQywxSyncRecord, Date> startTime;
    public static volatile SingularAttribute<DingdingQywxSyncRecord, String> status;
    public static volatile SingularAttribute<DingdingQywxSyncRecord, String> type;

    public DingdingQywxSyncRecordStatic() {
    }
}
