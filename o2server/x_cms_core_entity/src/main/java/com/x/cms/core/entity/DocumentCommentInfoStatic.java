
package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(DocumentCommentInfo.class)
public class DocumentCommentInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<DocumentCommentInfo, String> appId;
    public static volatile SingularAttribute<DocumentCommentInfo, String> appName;
    public static volatile SingularAttribute<DocumentCommentInfo, String> auditorName;
    public static volatile SingularAttribute<DocumentCommentInfo, String> categoryId;
    public static volatile SingularAttribute<DocumentCommentInfo, String> categoryName;
    public static volatile SingularAttribute<DocumentCommentInfo, Long> commendCount;
    public static volatile SingularAttribute<DocumentCommentInfo, String> commentAuditStatus;
    public static volatile SingularAttribute<DocumentCommentInfo, String> creatorName;
    public static volatile SingularAttribute<DocumentCommentInfo, String> documentId;
    public static volatile SingularAttribute<DocumentCommentInfo, String> id;
    public static volatile SingularAttribute<DocumentCommentInfo, Boolean> isPrivate;
    public static volatile SingularAttribute<DocumentCommentInfo, Integer> orderNumber;
    public static volatile SingularAttribute<DocumentCommentInfo, String> parentId;
    public static volatile SingularAttribute<DocumentCommentInfo, String> title;

    public DocumentCommentInfoStatic() {
    }
}
