package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(FormField.class)
public class FormFieldStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<FormField, String> appId;
    public static volatile SingularAttribute<FormField, String> dataType;
    public static volatile SingularAttribute<FormField, String> form;
    public static volatile SingularAttribute<FormField, String> id;
    public static volatile SingularAttribute<FormField, String> name;

    public FormFieldStatic() {
    }
}
