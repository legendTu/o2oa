package com.x.mind.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MindVersionInfo.class)
public class MindVersionInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<MindVersionInfo, String> creator;
    public static volatile SingularAttribute<MindVersionInfo, String> creatorUnit;
    public static volatile SingularAttribute<MindVersionInfo, String> description;
    public static volatile SingularAttribute<MindVersionInfo, Integer> fileVersion;
    public static volatile SingularAttribute<MindVersionInfo, String> folderId;
    public static volatile SingularAttribute<MindVersionInfo, String> id;
    public static volatile SingularAttribute<MindVersionInfo, String> mindId;
    public static volatile SingularAttribute<MindVersionInfo, String> name;
    public static volatile SingularAttribute<MindVersionInfo, Boolean> shared;

    public MindVersionInfoStatic() {
    }
}
