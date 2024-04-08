package com.x.processplatform.core.entity.content;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SerialNumber.class)
public class SerialNumberStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<SerialNumber, String> application;
    public static volatile SingularAttribute<SerialNumber, String> id;
    public static volatile SingularAttribute<SerialNumber, String> name;
    public static volatile SingularAttribute<SerialNumber, String> process;
    public static volatile SingularAttribute<SerialNumber, Integer> serial;

    public SerialNumberStatic() {
    }
}
