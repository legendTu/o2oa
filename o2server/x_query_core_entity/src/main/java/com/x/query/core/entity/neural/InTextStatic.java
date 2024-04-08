package com.x.query.core.entity.neural;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(InText.class)
public class InTextStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<InText, Integer> count;
    public static volatile SingularAttribute<InText, String> id;
    public static volatile SingularAttribute<InText, String> model;
    public static volatile SingularAttribute<InText, Integer> serial;
    public static volatile SingularAttribute<InText, String> text;

    public InTextStatic() {
    }
}
