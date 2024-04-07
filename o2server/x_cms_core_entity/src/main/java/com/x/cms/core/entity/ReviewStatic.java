package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Review.class)
public class ReviewStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Review, String> appAlias;
    public static volatile SingularAttribute<Review, String> appId;
    public static volatile SingularAttribute<Review, String> appName;
    public static volatile SingularAttribute<Review, String> categoryAlias;
    public static volatile SingularAttribute<Review, String> categoryId;
    public static volatile SingularAttribute<Review, String> categoryName;
    public static volatile SingularAttribute<Review, String> creatorIdentity;
    public static volatile SingularAttribute<Review, String> creatorPerson;
    public static volatile SingularAttribute<Review, String> creatorTopUnitName;
    public static volatile SingularAttribute<Review, String> creatorUnitName;
    public static volatile SingularAttribute<Review, Date> docCreateTime;
    public static volatile SingularAttribute<Review, String> docId;
    public static volatile SingularAttribute<Review, String> docSequence;
    public static volatile SingularAttribute<Review, String> docStatus;
    public static volatile SingularAttribute<Review, String> documentType;
    public static volatile SingularAttribute<Review, String> id;
    public static volatile SingularAttribute<Review, String> permissionObj;
    public static volatile SingularAttribute<Review, String> permissionObjType;
    public static volatile SingularAttribute<Review, Date> publishTime;
    public static volatile SingularAttribute<Review, String> title;
    public static volatile String job;

    public ReviewStatic() {
    }
}
