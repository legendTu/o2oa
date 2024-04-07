package com.x.file.core.entity.personal;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Folder2.class)
public class Folder2Static extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Folder2, String> id;
    public static volatile SingularAttribute<Folder2, Date> lastUpdateTime;
    public static volatile SingularAttribute<Folder2, String> name;
    public static volatile SingularAttribute<Folder2, String> person;
    public static volatile SingularAttribute<Folder2, String> status;
    public static volatile SingularAttribute<Folder2, String> superior;

    public Folder2Static() {
    }
}
