package com.x.message.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Org.class)
public class OrgStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Org, String> consumed;
    public static volatile SingularAttribute<Org, String> receiveSystem;
    public static volatile SingularAttribute<Org, String> consumedModule;
    public static volatile SingularAttribute<Org, String> operType;
    public static volatile SingularAttribute<Org, String> orgType;


    public OrgStatic(){

    }
}
