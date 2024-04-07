package com.x.mind.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MindFolderInfo.class)
public class MindFolderInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<MindFolderInfo, String> creator;
    public static volatile SingularAttribute<MindFolderInfo, String> creatorUnit;
    public static volatile SingularAttribute<MindFolderInfo, String> description;
    public static volatile SingularAttribute<MindFolderInfo, String> id;
    public static volatile SingularAttribute<MindFolderInfo, String> name;
    public static volatile SingularAttribute<MindFolderInfo, Integer> orderNumber;
    public static volatile SingularAttribute<MindFolderInfo, String> parentId;

    public MindFolderInfoStatic() {
    }
}
