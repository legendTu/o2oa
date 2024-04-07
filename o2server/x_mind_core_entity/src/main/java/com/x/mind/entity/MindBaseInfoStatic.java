package com.x.mind.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MindBaseInfo.class)
public class MindBaseInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<MindBaseInfo, Boolean> cooperative;
    public static volatile SingularAttribute<MindBaseInfo, String> cooperative_sequence;
    public static volatile SingularAttribute<MindBaseInfo, String> creator;
    public static volatile SingularAttribute<MindBaseInfo, String> creatorUnit;
    public static volatile SingularAttribute<MindBaseInfo, String> creatorUnit_sequence;
    public static volatile SingularAttribute<MindBaseInfo, String> creator_sequence;
    public static volatile SingularAttribute<MindBaseInfo, String> description;
    public static volatile ListAttribute<MindBaseInfo, String> editorList;
    public static volatile SingularAttribute<MindBaseInfo, Integer> fileVersion;
    public static volatile SingularAttribute<MindBaseInfo, String> folderId;
    public static volatile SingularAttribute<MindBaseInfo, String> folder_sequence;
    public static volatile SingularAttribute<MindBaseInfo, String> icon;
    public static volatile SingularAttribute<MindBaseInfo, String> id;
    public static volatile SingularAttribute<MindBaseInfo, String> name;
    public static volatile ListAttribute<MindBaseInfo, String> shareGroupList;
    public static volatile ListAttribute<MindBaseInfo, String> sharePersonList;
    public static volatile ListAttribute<MindBaseInfo, String> shareUnitList;
    public static volatile SingularAttribute<MindBaseInfo, Boolean> shared;
    public static volatile SingularAttribute<MindBaseInfo, String> shared_sequence;

    public MindBaseInfoStatic() {
    }
}
