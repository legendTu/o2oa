package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Invoke.class)
public class InvokeStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Invoke, String> alias;
    public static volatile SingularAttribute<Invoke, String> data;
    public static volatile SingularAttribute<Invoke, String> description;
    public static volatile SingularAttribute<Invoke, Boolean> enable;
    public static volatile SingularAttribute<Invoke, Boolean> enableToken;
    public static volatile SingularAttribute<Invoke, String> id;
    public static volatile SingularAttribute<Invoke, Date> lastEndTime;
    public static volatile SingularAttribute<Invoke, Date> lastStartTime;
    public static volatile SingularAttribute<Invoke, String> name;
    public static volatile SingularAttribute<Invoke, String> remoteAddrRegex;
    public static volatile SingularAttribute<Invoke, String> text;
    public static volatile SingularAttribute<Invoke, Boolean> validated;

    public InvokeStatic() {
    }
}
