package com.x.program.center.core.entity;

import com.x.base.core.entity.StorageObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Structure.class)
public class StructureStatic extends StorageObjectStatic {
    public static volatile SingularAttribute<Structure, String> data;
    public static volatile SingularAttribute<Structure, Boolean> deepPath;
    public static volatile SingularAttribute<Structure, String> description;
    public static volatile SingularAttribute<Structure, String> descriptionLob;
    public static volatile SingularAttribute<Structure, String> extension;
    public static volatile SingularAttribute<Structure, String> id;
    public static volatile SingularAttribute<Structure, Date> lastUpdateTime;
    public static volatile SingularAttribute<Structure, Long> length;
    public static volatile SingularAttribute<Structure, String> name;
    public static volatile SingularAttribute<Structure, String> storage;

    public StructureStatic() {
    }
}
