package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DocumentCommentCommend.class)
public class DocumentCommentCommendStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<DocumentCommentCommend, String> commendPerson;
    public static volatile SingularAttribute<DocumentCommentCommend, String> commentId;
    public static volatile SingularAttribute<DocumentCommentCommend, String> documentId;
    public static volatile SingularAttribute<DocumentCommentCommend, String> id;

    public DocumentCommentCommendStatic() {
    }
}
