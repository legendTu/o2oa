package com.x.file.core.entity.open;

import com.x.base.core.entity.StorageObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(File.class)
public class FileStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<File, Boolean> deepPath;
    public static volatile SingularAttribute<File, String> extension;
    public static volatile SingularAttribute<File, String> id;
    public static volatile SingularAttribute<File, Date> lastUpdateTime;
    public static volatile SingularAttribute<File, Long> length;
    public static volatile SingularAttribute<File, String> name;
    public static volatile SingularAttribute<File, String> person;
    public static volatile SingularAttribute<File, String> reference;
    public static volatile SingularAttribute<File, ReferenceType> referenceType;
    public static volatile SingularAttribute<File, String> storage;

    public FileStatic() {
    }
}
