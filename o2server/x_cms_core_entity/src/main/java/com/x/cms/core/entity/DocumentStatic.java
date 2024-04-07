//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;

import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Document.class)
public class DocumentStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Document, String> appAlias;
    public static volatile SingularAttribute<Document, String> appId;
    public static volatile SingularAttribute<Document, String> appName;
    public static volatile ListAttribute<Document, String> authorGroupList;
    public static volatile ListAttribute<Document, String> authorPersonList;
    public static volatile ListAttribute<Document, String> authorUnitList;
    public static volatile SingularAttribute<Document, String> categoryAlias;
    public static volatile SingularAttribute<Document, String> categoryId;
    public static volatile SingularAttribute<Document, String> categoryName;
    public static volatile SingularAttribute<Document, Long> commendCount;
    public static volatile SingularAttribute<Document, Long> commentCount;
    public static volatile SingularAttribute<Document, String> creatorIdentity;
    public static volatile SingularAttribute<Document, String> creatorPerson;
    public static volatile SingularAttribute<Document, String> creatorTopUnitName;
    public static volatile SingularAttribute<Document, String> creatorUnitName;
    public static volatile SingularAttribute<Document, Date> dateTimeValue01;
    public static volatile SingularAttribute<Document, Date> dateTimeValue02;
    public static volatile SingularAttribute<Document, Date> dateTimeValue03;
    public static volatile SingularAttribute<Document, String> description;
    public static volatile SingularAttribute<Document, String> docStatus;
    public static volatile SingularAttribute<Document, String> documentType;
    public static volatile SingularAttribute<Document, Double> doubleValue01;
    public static volatile SingularAttribute<Document, Double> doubleValue02;
    public static volatile SingularAttribute<Document, String> form;
    public static volatile SingularAttribute<Document, String> formName;
    public static volatile SingularAttribute<Document, Boolean> hasIndexPic;
    public static volatile SingularAttribute<Document, String> id;
    public static volatile SingularAttribute<Document, String> importBatchName;
    public static volatile SingularAttribute<Document, String> indexPics;
    public static volatile SingularAttribute<Document, Boolean> isAllRead;
    public static volatile SingularAttribute<Document, Boolean> isTop;
    public static volatile SingularAttribute<Document, Long> longValue01;
    public static volatile SingularAttribute<Document, Long> longValue02;
    public static volatile ListAttribute<Document, String> managerList;
    public static volatile SingularAttribute<Document, Date> modifyTime;
    public static volatile SingularAttribute<Document, Integer> objectSecurityClearance;
    public static volatile ListAttribute<Document, String> pictureList;
    public static volatile SingularAttribute<Document, String> ppFormId;
    public static volatile SingularAttribute<Document, DocumentProperties> properties;
    public static volatile SingularAttribute<Document, Date> publishTime;
    public static volatile SingularAttribute<Document, String> readFormId;
    public static volatile SingularAttribute<Document, String> readFormName;
    public static volatile ListAttribute<Document, String> readGroupList;
    public static volatile ListAttribute<Document, String> readPersonList;
    public static volatile ListAttribute<Document, String> readUnitList;
    public static volatile SingularAttribute<Document, Boolean> reviewed;
    public static volatile SingularAttribute<Document, String> sequenceAppAlias;
    public static volatile SingularAttribute<Document, String> sequenceCategoryAlias;
    public static volatile SingularAttribute<Document, String> sequenceCreatorPerson;
    public static volatile SingularAttribute<Document, String> sequenceCreatorUnitName;
    public static volatile SingularAttribute<Document, String> sequenceTitle;
    public static volatile SingularAttribute<Document, String> stringValue01;
    public static volatile SingularAttribute<Document, String> stringValue02;
    public static volatile SingularAttribute<Document, String> stringValue03;
    public static volatile SingularAttribute<Document, String> stringValue04;
    public static volatile SingularAttribute<Document, String> stringValue05;
    public static volatile SingularAttribute<Document, String> stringValue06;
    public static volatile SingularAttribute<Document, String> stringValue07;
    public static volatile SingularAttribute<Document, String> stringValue08;
    public static volatile SingularAttribute<Document, String> stringValue09;
    public static volatile SingularAttribute<Document, String> stringValue10;
    public static volatile SingularAttribute<Document, String> summary;
    public static volatile SingularAttribute<Document, String> title;
    public static volatile SingularAttribute<Document, Long> viewCount;

    public DocumentStatic() {
    }
}
