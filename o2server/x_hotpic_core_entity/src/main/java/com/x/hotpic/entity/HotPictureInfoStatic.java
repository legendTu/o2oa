package com.x.hotpic.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(HotPictureInfo.class)
public class HotPictureInfoStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<HotPictureInfo, String> application;
    public static volatile SingularAttribute<HotPictureInfo, String> creator;
    public static volatile SingularAttribute<HotPictureInfo, String> id;
    public static volatile SingularAttribute<HotPictureInfo, String> infoId;
    public static volatile SingularAttribute<HotPictureInfo, String> picId;
    public static volatile SingularAttribute<HotPictureInfo, String> summary;
    public static volatile SingularAttribute<HotPictureInfo, String> title;

    public HotPictureInfoStatic() {
    }
}
