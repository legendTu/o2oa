package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Form.class)
public class FormStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Form, String> alias;
    public static volatile SingularAttribute<Form, String> application;
    public static volatile SingularAttribute<Form, String> category;
    public static volatile SingularAttribute<Form, String> data;
    public static volatile SingularAttribute<Form, String> description;
    public static volatile SingularAttribute<Form, Boolean> hasMobile;
    public static volatile SingularAttribute<Form, String> icon;
    public static volatile SingularAttribute<Form, String> id;
    public static volatile SingularAttribute<Form, String> lastUpdatePerson;
    public static volatile SingularAttribute<Form, Date> lastUpdateTime;
    public static volatile SingularAttribute<Form, String> mobileData;
    public static volatile SingularAttribute<Form, String> name;
    public static volatile SingularAttribute<Form, FormProperties> properties;

    public FormStatic() {
    }
}
