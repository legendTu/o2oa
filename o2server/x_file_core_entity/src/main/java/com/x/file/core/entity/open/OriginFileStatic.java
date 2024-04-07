package com.x.file.core.entity.open;

import com.x.base.core.entity.StorageObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OriginFile.class)
public class OriginFileStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<OriginFile, Boolean> deepPath;
    public static volatile SingularAttribute<OriginFile, String> extension;
    public static volatile SingularAttribute<OriginFile, String> fileMd5;
    public static volatile SingularAttribute<OriginFile, String> id;
    public static volatile SingularAttribute<OriginFile, String> lastUpdatePerson;
    public static volatile SingularAttribute<OriginFile, Date> lastUpdateTime;
    public static volatile SingularAttribute<OriginFile, Long> length;
    public static volatile SingularAttribute<OriginFile, String> name;
    public static volatile SingularAttribute<OriginFile, String> person;
    public static volatile SingularAttribute<OriginFile, String> storage;
    public static volatile SingularAttribute<OriginFile, String> type;

    public OriginFileStatic() {
    }
}
