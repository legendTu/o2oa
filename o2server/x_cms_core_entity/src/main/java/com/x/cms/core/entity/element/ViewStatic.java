//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(View.class)
public class ViewStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<View, String> alias;
    public static volatile SingularAttribute<View, String> appId;
    public static volatile SingularAttribute<View, String> content;
    public static volatile SingularAttribute<View, String> description;
    public static volatile SingularAttribute<View, String> editor;
    public static volatile ListAttribute<View, String> fieldConfigList;
    public static volatile SingularAttribute<View, String> formId;
    public static volatile SingularAttribute<View, String> id;
    public static volatile SingularAttribute<View, String> name;
    public static volatile SingularAttribute<View, String> orderField;
    public static volatile SingularAttribute<View, String> orderFieldType;
    public static volatile SingularAttribute<View, String> orderType;
    public static volatile SingularAttribute<View, Integer> pageSize;

    public ViewStatic() {
    }
}
