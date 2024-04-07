package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DocumentCommend.class)
public class DocumentCommendStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<DocumentCommend, String> commendPerson;
    public static volatile SingularAttribute<DocumentCommend, String> commentId;
    public static volatile SingularAttribute<DocumentCommend, String> commentTitle;
    public static volatile SingularAttribute<DocumentCommend, String> creatorPerson;
    public static volatile SingularAttribute<DocumentCommend, String> documentId;
    public static volatile SingularAttribute<DocumentCommend, String> id;
    public static volatile SingularAttribute<DocumentCommend, String> title;
    public static volatile SingularAttribute<DocumentCommend, String> type;

    public DocumentCommendStatic() {
    }
}
