package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSForumInfo.class)
public class BBSForumInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSForumInfo, String> creatorName;
    public static volatile SingularAttribute<BBSForumInfo, String> forumColor;
    public static volatile SingularAttribute<BBSForumInfo, String> forumIndexStyle;
    public static volatile ListAttribute<BBSForumInfo, String> forumManagerList;
    public static volatile SingularAttribute<BBSForumInfo, String> forumName;
    public static volatile SingularAttribute<BBSForumInfo, String> forumNotice;
    public static volatile SingularAttribute<BBSForumInfo, String> forumStatus;
    public static volatile SingularAttribute<BBSForumInfo, String> forumVisible;
    public static volatile SingularAttribute<BBSForumInfo, String> id;
    public static volatile SingularAttribute<BBSForumInfo, String> indexListStyle;
    public static volatile SingularAttribute<BBSForumInfo, Boolean> indexRecommendable;
    public static volatile SingularAttribute<BBSForumInfo, Integer> orderNumber;
    public static volatile ListAttribute<BBSForumInfo, String> publishPermissionList;
    public static volatile SingularAttribute<BBSForumInfo, Boolean> replyMessageNotify;
    public static volatile SingularAttribute<BBSForumInfo, String> replyMessageNotifyType;
    public static volatile SingularAttribute<BBSForumInfo, Boolean> replyNeedAudit;
    public static volatile ListAttribute<BBSForumInfo, String> replyPermissionList;
    public static volatile SingularAttribute<BBSForumInfo, String> replyPublishAble;
    public static volatile SingularAttribute<BBSForumInfo, Long> replyTotal;
    public static volatile SingularAttribute<BBSForumInfo, Long> replyTotalToday;
    public static volatile SingularAttribute<BBSForumInfo, Boolean> sectionCreateAble;
    public static volatile SingularAttribute<BBSForumInfo, Long> sectionTotal;
    public static volatile SingularAttribute<BBSForumInfo, Boolean> subjectMessageNotify;
    public static volatile SingularAttribute<BBSForumInfo, String> subjectMessageNotifyType;
    public static volatile SingularAttribute<BBSForumInfo, Boolean> subjectNeedAudit;
    public static volatile SingularAttribute<BBSForumInfo, String> subjectPublishAble;
    public static volatile SingularAttribute<BBSForumInfo, Long> subjectTotal;
    public static volatile SingularAttribute<BBSForumInfo, Long> subjectTotalToday;
    public static volatile SingularAttribute<BBSForumInfo, String> subjectType;
    public static volatile SingularAttribute<BBSForumInfo, String> typeCategory;
    public static volatile ListAttribute<BBSForumInfo, String> visiblePermissionList;

    public BBSForumInfoStatic() {
    }
}
