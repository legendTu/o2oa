package com.x.mind.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(MindRecycleInfo.class)
public class MindRecycleInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<MindRecycleInfo, String> creator;
    public static volatile SingularAttribute<MindRecycleInfo, String> creatorUnit;
    public static volatile SingularAttribute<MindRecycleInfo, String> creatorUnit_sequence;
    public static volatile SingularAttribute<MindRecycleInfo, String> creator_sequence;
    public static volatile SingularAttribute<MindRecycleInfo, String> deleteor;
    public static volatile SingularAttribute<MindRecycleInfo, String> description;
    public static volatile SingularAttribute<MindRecycleInfo, Date> fileCreateTime;
    public static volatile SingularAttribute<MindRecycleInfo, Integer> fileVersion;
    public static volatile SingularAttribute<MindRecycleInfo, String> folderId;
    public static volatile SingularAttribute<MindRecycleInfo, String> folder_sequence;
    public static volatile SingularAttribute<MindRecycleInfo, String> id;
    public static volatile SingularAttribute<MindRecycleInfo, String> name;
    public static volatile SingularAttribute<MindRecycleInfo, Boolean> shared;
    public static volatile SingularAttribute<MindRecycleInfo, String> shared_sequence;

    public MindRecycleInfoStatic() {
    }
}
