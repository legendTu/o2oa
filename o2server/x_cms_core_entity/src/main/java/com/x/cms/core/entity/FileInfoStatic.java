package com.x.cms.core.entity;

import com.x.base.core.entity.StorageObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(FileInfo.class)
public class FileInfoStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<FileInfo, String> appId;
    public static volatile SingularAttribute<FileInfo, String> categoryId;
    public static volatile SingularAttribute<FileInfo, String> cloudId;
    public static volatile ListAttribute<FileInfo, String> controllerIdentityList;
    public static volatile ListAttribute<FileInfo, String> controllerUnitList;
    public static volatile SingularAttribute<FileInfo, String> creatorUid;
    public static volatile SingularAttribute<FileInfo, Boolean> deepPath;
    public static volatile SingularAttribute<FileInfo, String> description;
    public static volatile SingularAttribute<FileInfo, String> documentId;
    public static volatile ListAttribute<FileInfo, String> editIdentityList;
    public static volatile ListAttribute<FileInfo, String> editUnitList;
    public static volatile SingularAttribute<FileInfo, String> extension;
    public static volatile SingularAttribute<FileInfo, String> fileExtType;
    public static volatile SingularAttribute<FileInfo, String> fileHost;
    public static volatile SingularAttribute<FileInfo, String> fileName;
    public static volatile SingularAttribute<FileInfo, String> filePath;
    public static volatile SingularAttribute<FileInfo, String> fileType;
    public static volatile SingularAttribute<FileInfo, String> id;
    public static volatile SingularAttribute<FileInfo, Date> lastUpdateTime;
    public static volatile SingularAttribute<FileInfo, Long> length;
    public static volatile SingularAttribute<FileInfo, String> name;
    public static volatile SingularAttribute<FileInfo, Integer> objectSecurityClearance;
    public static volatile SingularAttribute<FileInfo, FileInfoProperties> properties;
    public static volatile ListAttribute<FileInfo, String> readIdentityList;
    public static volatile ListAttribute<FileInfo, String> readUnitList;
    public static volatile SingularAttribute<FileInfo, Integer> seqNumber;
    public static volatile SingularAttribute<FileInfo, String> site;
    public static volatile SingularAttribute<FileInfo, String> storage;
    public static volatile SingularAttribute<FileInfo, String> text;
    public static volatile SingularAttribute<FileInfo, String> type;

    public FileInfoStatic() {
    }
}
