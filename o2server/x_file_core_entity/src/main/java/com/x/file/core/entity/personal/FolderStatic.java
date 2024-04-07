package com.x.file.core.entity.personal;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Folder.class)
public class FolderStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Folder, String> id;
    public static volatile SingularAttribute<Folder, String> name;
    public static volatile SingularAttribute<Folder, String> person;
    public static volatile SingularAttribute<Folder, String> superior;

    public FolderStatic() {
    }
}
