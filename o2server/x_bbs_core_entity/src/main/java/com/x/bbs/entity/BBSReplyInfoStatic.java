package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSReplyInfo.class)
public class BBSReplyInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSReplyInfo, String> auditorName;
    public static volatile SingularAttribute<BBSReplyInfo, String> content;
    public static volatile SingularAttribute<BBSReplyInfo, String> creatorName;
    public static volatile SingularAttribute<BBSReplyInfo, String> forumId;
    public static volatile SingularAttribute<BBSReplyInfo, String> forumName;
    public static volatile SingularAttribute<BBSReplyInfo, String> hostIp;
    public static volatile SingularAttribute<BBSReplyInfo, String> id;
    public static volatile SingularAttribute<BBSReplyInfo, String> machineName;
    public static volatile SingularAttribute<BBSReplyInfo, String> mainSectionId;
    public static volatile SingularAttribute<BBSReplyInfo, String> mainSectionName;
    public static volatile SingularAttribute<BBSReplyInfo, String> nickName;
    public static volatile SingularAttribute<BBSReplyInfo, Integer> orderNumber;
    public static volatile SingularAttribute<BBSReplyInfo, String> parentId;
    public static volatile SingularAttribute<BBSReplyInfo, String> picId;
    public static volatile SingularAttribute<BBSReplyInfo, String> replyAuditStatus;
    public static volatile SingularAttribute<BBSReplyInfo, String> sectionId;
    public static volatile SingularAttribute<BBSReplyInfo, String> sectionName;
    public static volatile SingularAttribute<BBSReplyInfo, String> subjectId;
    public static volatile SingularAttribute<BBSReplyInfo, String> systemType;
    public static volatile SingularAttribute<BBSReplyInfo, String> title;

    public BBSReplyInfoStatic() {
    }
}
