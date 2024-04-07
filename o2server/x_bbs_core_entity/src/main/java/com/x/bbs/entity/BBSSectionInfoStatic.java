//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSSectionInfo.class)
public class BBSSectionInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSSectionInfo, String> creatorName;
    public static volatile SingularAttribute<BBSSectionInfo, String> forumId;
    public static volatile SingularAttribute<BBSSectionInfo, String> forumName;
    public static volatile SingularAttribute<BBSSectionInfo, String> icon;
    public static volatile SingularAttribute<BBSSectionInfo, String> id;
    public static volatile SingularAttribute<BBSSectionInfo, Boolean> indexRecommendable;
    public static volatile SingularAttribute<BBSSectionInfo, String> mainSectionId;
    public static volatile SingularAttribute<BBSSectionInfo, String> mainSectionName;
    public static volatile ListAttribute<BBSSectionInfo, String> moderatorNames;
    public static volatile SingularAttribute<BBSSectionInfo, Integer> orderNumber;
    public static volatile ListAttribute<BBSSectionInfo, String> publishPermissionList;
    public static volatile SingularAttribute<BBSSectionInfo, Boolean> replyMessageNotify;
    public static volatile SingularAttribute<BBSSectionInfo, String> replyMessageNotifyType;
    public static volatile SingularAttribute<BBSSectionInfo, Boolean> replyNeedAudit;
    public static volatile ListAttribute<BBSSectionInfo, String> replyPermissionList;
    public static volatile SingularAttribute<BBSSectionInfo, String> replyPublishAble;
    public static volatile SingularAttribute<BBSSectionInfo, Long> replyTotal;
    public static volatile SingularAttribute<BBSSectionInfo, Long> replyTotalToday;
    public static volatile SingularAttribute<BBSSectionInfo, String> sectionDescription;
    public static volatile SingularAttribute<BBSSectionInfo, Boolean> sectionGrade;
    public static volatile SingularAttribute<BBSSectionInfo, String> sectionLevel;
    public static volatile SingularAttribute<BBSSectionInfo, String> sectionName;
    public static volatile SingularAttribute<BBSSectionInfo, String> sectionNotice;
    public static volatile SingularAttribute<BBSSectionInfo, String> sectionStatus;
    public static volatile SingularAttribute<BBSSectionInfo, String> sectionType;
    public static volatile SingularAttribute<BBSSectionInfo, String> sectionVisible;
    public static volatile SingularAttribute<BBSSectionInfo, Boolean> subSectionCreateAble;
    public static volatile SingularAttribute<BBSSectionInfo, Boolean> subjectMessageNotify;
    public static volatile SingularAttribute<BBSSectionInfo, String> subjectMessageNotifyType;
    public static volatile SingularAttribute<BBSSectionInfo, Boolean> subjectNeedAudit;
    public static volatile SingularAttribute<BBSSectionInfo, String> subjectPublishAble;
    public static volatile SingularAttribute<BBSSectionInfo, Long> subjectTotal;
    public static volatile SingularAttribute<BBSSectionInfo, Long> subjectTotalToday;
    public static volatile SingularAttribute<BBSSectionInfo, String> subjectType;
    public static volatile ListAttribute<BBSSectionInfo, String> subjectTypeList;
    public static volatile SingularAttribute<BBSSectionInfo, String> typeCategory;
    public static volatile ListAttribute<BBSSectionInfo, String> visiblePermissionList;

    public BBSSectionInfoStatic() {
    }
}
