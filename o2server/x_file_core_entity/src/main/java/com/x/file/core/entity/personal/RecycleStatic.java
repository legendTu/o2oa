package com.x.file.core.entity.personal;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Recycle.class)
public class RecycleStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Recycle, String> extension;
    public static volatile SingularAttribute<Recycle, String> fileId;
    public static volatile SingularAttribute<Recycle, String> fileType;
    public static volatile SingularAttribute<Recycle, String> id;
    public static volatile SingularAttribute<Recycle, Long> length;
    public static volatile SingularAttribute<Recycle, String> name;
    public static volatile SingularAttribute<Recycle, String> person;
    public static volatile SingularAttribute<Recycle, Date> validTime;

    public RecycleStatic() {
    }
}
