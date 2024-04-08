package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Mapping.class)
public class MappingStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Mapping, String> application;
    public static volatile SingularAttribute<Mapping, String> data;
    public static volatile SingularAttribute<Mapping, String> description;
    public static volatile SingularAttribute<Mapping, Boolean> enable;
    public static volatile SingularAttribute<Mapping, String> id;
    public static volatile SingularAttribute<Mapping, String> name;
    public static volatile SingularAttribute<Mapping, String> process;
    public static volatile SingularAttribute<Mapping, String> tableName;

    public MappingStatic() {
    }
}
