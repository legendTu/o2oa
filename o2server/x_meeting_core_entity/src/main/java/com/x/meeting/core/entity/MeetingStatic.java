package com.x.meeting.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Meeting.class)
public class MeetingStatic extends SliceJpaObjectStatic {
    public static volatile ListAttribute<Meeting, String> acceptPersonList;
    public static volatile SingularAttribute<Meeting, Date> actualCompletedTime;
    public static volatile SingularAttribute<Meeting, Date> actualStartTime;
    public static volatile SingularAttribute<Meeting, String> applicant;
    public static volatile SingularAttribute<Meeting, String> auditor;
    public static volatile ListAttribute<Meeting, String> checkinPersonList;
    public static volatile SingularAttribute<Meeting, Date> completedTime;
    public static volatile SingularAttribute<Meeting, ConfirmStatus> confirmStatus;
    public static volatile SingularAttribute<Meeting, String> description;
    public static volatile SingularAttribute<Meeting, String> hostPerson;
    public static volatile SingularAttribute<Meeting, String> hostUnit;
    public static volatile SingularAttribute<Meeting, String> id;
    public static volatile ListAttribute<Meeting, String> inviteDelPersonList;
    public static volatile ListAttribute<Meeting, String> inviteMemberList;
    public static volatile ListAttribute<Meeting, String> invitePersonList;
    public static volatile SingularAttribute<Meeting, Boolean> manualCompleted;
    public static volatile SingularAttribute<Meeting, String> memo;
    public static volatile SingularAttribute<Meeting, String> mode;
    public static volatile SingularAttribute<Meeting, String> pinyin;
    public static volatile SingularAttribute<Meeting, String> pinyinInitial;
    public static volatile ListAttribute<Meeting, String> rejectPersonList;
    public static volatile SingularAttribute<Meeting, String> room;
    public static volatile SingularAttribute<Meeting, String> roomId;
    public static volatile SingularAttribute<Meeting, String> roomLink;
    public static volatile SingularAttribute<Meeting, Date> startTime;
    public static volatile SingularAttribute<Meeting, String> subject;
    public static volatile SingularAttribute<Meeting, String> summary;
    public static volatile SingularAttribute<Meeting, String> type;

    public MeetingStatic() {
    }
}
