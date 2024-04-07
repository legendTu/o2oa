package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ViewFieldConfig.class)
public class ViewFieldConfigStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ViewFieldConfig, String> description;
    public static volatile SingularAttribute<ViewFieldConfig, String> editor;
    public static volatile SingularAttribute<ViewFieldConfig, String> fieldName;
    public static volatile SingularAttribute<ViewFieldConfig, String> fieldTitle;
    public static volatile SingularAttribute<ViewFieldConfig, String> id;
    public static volatile SingularAttribute<ViewFieldConfig, Integer> showSequence;
    public static volatile SingularAttribute<ViewFieldConfig, String> viewId;

    public ViewFieldConfigStatic() {
    }
}
