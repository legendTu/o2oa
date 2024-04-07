package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.List;

@StaticMetamodel(QueryViewStatic.class)
public class QueryViewStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<QueryView, String> id;
    public static volatile SingularAttribute<QueryView, String> appId;
    public static volatile SingularAttribute<QueryView, String> creatorPerson;
    public static volatile SingularAttribute<QueryView, String> controllerList;
    public static volatile SingularAttribute<QueryView, List<String>> availablePersonList;
    public static volatile SingularAttribute<QueryView, List<String>> availableUnitList;
    public static volatile SingularAttribute<QueryView, List<String>> availableIdentityList;

    public QueryViewStatic(){

    }
}
