package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(FormVersion.class)
public class FormVersionStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<FormVersion, String> data;
    public static volatile SingularAttribute<FormVersion, String> form;
    public static volatile SingularAttribute<FormVersion, String> id;
    public static volatile SingularAttribute<FormVersion, String> person;

    public FormVersionStatic() {
    }
}
