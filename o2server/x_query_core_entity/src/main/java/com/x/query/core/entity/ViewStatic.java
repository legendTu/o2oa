package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(View.class)
public class ViewStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<View, String> afterCalculateGridScriptText;
    public static volatile SingularAttribute<View, String> afterGridScriptText;
    public static volatile SingularAttribute<View, String> afterGroupGridScriptText;
    public static volatile SingularAttribute<View, String> alias;
    public static volatile ListAttribute<View, String> availableGroupList;
    public static volatile ListAttribute<View, String> availableIdentityList;
    public static volatile ListAttribute<View, String> availableUnitList;
    public static volatile SingularAttribute<View, Boolean> cacheAccess;
    public static volatile SingularAttribute<View, String> code;
    public static volatile SingularAttribute<View, Integer> count;
    public static volatile SingularAttribute<View, String> data;
    public static volatile SingularAttribute<View, String> description;
    public static volatile SingularAttribute<View, Boolean> display;
    public static volatile SingularAttribute<View, Boolean> enableCache;
    public static volatile SingularAttribute<View, String> id;
    public static volatile SingularAttribute<View, String> layout;
    public static volatile SingularAttribute<View, String> name;
    public static volatile SingularAttribute<View, Integer> orderNumber;
    public static volatile SingularAttribute<View, Integer> pageSize;
    public static volatile SingularAttribute<View, String> query;
    public static volatile SingularAttribute<View, String> toolbar;
    public static volatile SingularAttribute<View, String> type;

    public ViewStatic() {
    }
}
