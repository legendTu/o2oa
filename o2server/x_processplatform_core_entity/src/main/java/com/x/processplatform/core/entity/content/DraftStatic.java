package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Draft.class)
public class DraftStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Draft, String> application;
    public static volatile SingularAttribute<Draft, String> applicationAlias;
    public static volatile SingularAttribute<Draft, String> applicationName;
    public static volatile SingularAttribute<Draft, String> id;
    public static volatile SingularAttribute<Draft, String> identity;
    public static volatile SingularAttribute<Draft, String> person;
    public static volatile SingularAttribute<Draft, String> process;
    public static volatile SingularAttribute<Draft, String> processAlias;
    public static volatile SingularAttribute<Draft, String> processName;
    public static volatile SingularAttribute<Draft, DraftProperties> properties;
    public static volatile SingularAttribute<Draft, String> title;
    public static volatile SingularAttribute<Draft, String> unit;

    public DraftStatic() {
    }
}
