package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(QueryView.class)
public class QueryViewStatic extends SliceJpaObjectStatic {

    public static volatile SingularAttribute<QueryView, String> application;
    public static volatile SingularAttribute<QueryView, String> id;

    public QueryViewStatic(){
    }
}
