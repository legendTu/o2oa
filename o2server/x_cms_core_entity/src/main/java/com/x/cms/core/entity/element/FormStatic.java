package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Form.class)
public class FormStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Form, String> alias;
    public static volatile SingularAttribute<Form, String> appId;
    public static volatile SingularAttribute<Form, String> data;
    public static volatile SingularAttribute<Form, String> description;
    public static volatile SingularAttribute<Form, String> editor;
    public static volatile SingularAttribute<Form, Boolean> hasMobile;
    public static volatile SingularAttribute<Form, String> id;
    public static volatile SingularAttribute<Form, String> mobileData;
    public static volatile SingularAttribute<Form, String> name;
    public static volatile SingularAttribute<Form, FormProperties> properties;

    public FormStatic() {
    }
}
