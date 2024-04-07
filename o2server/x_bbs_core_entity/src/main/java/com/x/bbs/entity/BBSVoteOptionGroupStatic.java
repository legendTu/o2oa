package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSVoteOptionGroup.class)
public class BBSVoteOptionGroupStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSVoteOptionGroup, String> creatorName;
    public static volatile SingularAttribute<BBSVoteOptionGroup, String> forumId;
    public static volatile SingularAttribute<BBSVoteOptionGroup, String> groupName;
    public static volatile SingularAttribute<BBSVoteOptionGroup, String> id;
    public static volatile SingularAttribute<BBSVoteOptionGroup, String> mainSectionId;
    public static volatile SingularAttribute<BBSVoteOptionGroup, Integer> orderNumber;
    public static volatile SingularAttribute<BBSVoteOptionGroup, String> sectionId;
    public static volatile SingularAttribute<BBSVoteOptionGroup, String> subjectId;
    public static volatile SingularAttribute<BBSVoteOptionGroup, Integer> voteChooseCount;

    public BBSVoteOptionGroupStatic() {
    }
}
