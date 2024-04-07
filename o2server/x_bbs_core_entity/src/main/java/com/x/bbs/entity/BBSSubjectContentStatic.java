package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSSubjectContent.class)
public class BBSSubjectContentStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSSubjectContent, String> content;
    public static volatile SingularAttribute<BBSSubjectContent, String> id;

    public BBSSubjectContentStatic() {
    }
}
