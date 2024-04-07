package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSVoteOption.class)
public class BBSVoteOptionStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSVoteOption, Integer> chooseCount;
    public static volatile SingularAttribute<BBSVoteOption, String> creatorName;
    public static volatile SingularAttribute<BBSVoteOption, String> forumId;
    public static volatile SingularAttribute<BBSVoteOption, String> id;
    public static volatile SingularAttribute<BBSVoteOption, String> mainSectionId;
    public static volatile SingularAttribute<BBSVoteOption, String> optionContentType;
    public static volatile SingularAttribute<BBSVoteOption, String> optionGroupId;
    public static volatile SingularAttribute<BBSVoteOption, String> optionPictureId;
    public static volatile SingularAttribute<BBSVoteOption, String> optionTextContent;
    public static volatile SingularAttribute<BBSVoteOption, Integer> orderNumber;
    public static volatile SingularAttribute<BBSVoteOption, String> sectionId;
    public static volatile SingularAttribute<BBSVoteOption, String> subjectId;

    public BBSVoteOptionStatic() {
    }
}
