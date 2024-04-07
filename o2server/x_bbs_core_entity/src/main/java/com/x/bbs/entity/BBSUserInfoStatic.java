package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSUserInfo.class)
public class BBSUserInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSUserInfo, String> cardId;
    public static volatile SingularAttribute<BBSUserInfo, Long> creamCount;
    public static volatile SingularAttribute<BBSUserInfo, Long> credit;
    public static volatile SingularAttribute<BBSUserInfo, Long> fansCount;
    public static volatile SingularAttribute<BBSUserInfo, String> id;
    public static volatile SingularAttribute<BBSUserInfo, Date> lastOperationTime;
    public static volatile SingularAttribute<BBSUserInfo, Date> lastVisitTime;
    public static volatile SingularAttribute<BBSUserInfo, String> mobile;
    public static volatile SingularAttribute<BBSUserInfo, String> nickName;
    public static volatile SingularAttribute<BBSUserInfo, Boolean> online;
    public static volatile SingularAttribute<BBSUserInfo, Integer> orderNumber;
    public static volatile SingularAttribute<BBSUserInfo, Long> originalCount;
    public static volatile SingularAttribute<BBSUserInfo, String> permissionContent;
    public static volatile SingularAttribute<BBSUserInfo, Long> popularity;
    public static volatile SingularAttribute<BBSUserInfo, Long> replyCount;
    public static volatile SingularAttribute<BBSUserInfo, Long> replyCountToday;
    public static volatile SingularAttribute<BBSUserInfo, Integer> sex;
    public static volatile SingularAttribute<BBSUserInfo, String> signContent;
    public static volatile SingularAttribute<BBSUserInfo, Long> subjectCount;
    public static volatile SingularAttribute<BBSUserInfo, Long> subjectCountToday;
    public static volatile SingularAttribute<BBSUserInfo, String> userName;
    public static volatile SingularAttribute<BBSUserInfo, String> userStatus;

    public BBSUserInfoStatic() {
    }
}
