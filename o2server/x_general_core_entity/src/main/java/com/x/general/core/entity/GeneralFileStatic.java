package com.x.general.core.entity;

import com.x.base.core.entity.StorageObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(GeneralFile.class)
public class GeneralFileStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<GeneralFile, Boolean> deepPath;
    public static volatile SingularAttribute<GeneralFile, String> extension;
    public static volatile SingularAttribute<GeneralFile, String> id;
    public static volatile SingularAttribute<GeneralFile, Date> lastUpdateTime;
    public static volatile SingularAttribute<GeneralFile, Long> length;
    public static volatile SingularAttribute<GeneralFile, String> name;
    public static volatile SingularAttribute<GeneralFile, String> person;
    public static volatile SingularAttribute<GeneralFile, String> storage;

    public GeneralFileStatic() {
    }
}
