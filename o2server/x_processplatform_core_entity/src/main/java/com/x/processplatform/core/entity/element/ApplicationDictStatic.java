package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ApplicationDict.class)
public class ApplicationDictStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ApplicationDict, String> alias;
    public static volatile SingularAttribute<ApplicationDict, String> application;
    public static volatile SingularAttribute<ApplicationDict, String> description;
    public static volatile SingularAttribute<ApplicationDict, String> id;
    public static volatile SingularAttribute<ApplicationDict, String> name;

    public ApplicationDictStatic() {
    }
}
