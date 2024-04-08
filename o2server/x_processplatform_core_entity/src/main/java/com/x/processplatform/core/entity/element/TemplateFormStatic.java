package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TemplateForm.class)
public class TemplateFormStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<TemplateForm, String> alias;
    public static volatile SingularAttribute<TemplateForm, String> category;
    public static volatile SingularAttribute<TemplateForm, String> data;
    public static volatile SingularAttribute<TemplateForm, String> description;
    public static volatile SingularAttribute<TemplateForm, String> icon;
    public static volatile SingularAttribute<TemplateForm, String> id;
    public static volatile SingularAttribute<TemplateForm, String> mobileData;
    public static volatile SingularAttribute<TemplateForm, String> name;
    public static volatile SingularAttribute<TemplateForm, String> outline;

    public TemplateFormStatic() {
    }
}
