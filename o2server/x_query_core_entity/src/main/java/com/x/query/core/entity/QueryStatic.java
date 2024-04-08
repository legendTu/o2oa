package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Query.class)
public class QueryStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Query, String> alias;
    public static volatile ListAttribute<Query, String> availableGroupList;
    public static volatile ListAttribute<Query, String> availableIdentityList;
    public static volatile ListAttribute<Query, String> availableUnitList;
    public static volatile ListAttribute<Query, String> controllerList;
    public static volatile SingularAttribute<Query, String> creatorPerson;
    public static volatile SingularAttribute<Query, String> data;
    public static volatile SingularAttribute<Query, String> description;
    public static volatile SingularAttribute<Query, String> icon;
    public static volatile SingularAttribute<Query, String> iconHue;
    public static volatile SingularAttribute<Query, String> id;
    public static volatile SingularAttribute<Query, String> lastUpdatePerson;
    public static volatile SingularAttribute<Query, Date> lastUpdateTime;
    public static volatile SingularAttribute<Query, String> name;
    public static volatile SingularAttribute<Query, String> queryCategory;

    public QueryStatic() {
    }
}
