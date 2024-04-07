package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(AppDict.class)
public class AppDictStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<AppDict, String> alias;
    public static volatile SingularAttribute<AppDict, String> appId;
    public static volatile SingularAttribute<AppDict, String> creatorUid;
    public static volatile SingularAttribute<AppDict, String> description;
    public static volatile SingularAttribute<AppDict, String> id;
    public static volatile SingularAttribute<AppDict, String> name;

    public AppDictStatic() {
    }
}
