package com.x.base.core.entity;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(JpaObject.class)
public class JpaObjectStatic {
    public static volatile SingularAttribute<JpaObject, Date> createTime;
    public static volatile SingularAttribute<JpaObject, String> sequence;
    public static volatile SingularAttribute<JpaObject, Date> updateTime;

    public JpaObjectStatic() {
    }
}
