package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ProcessVersion.class)
public class ProcessVersionStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ProcessVersion, String> data;
    public static volatile SingularAttribute<ProcessVersion, String> id;
    public static volatile SingularAttribute<ProcessVersion, String> person;
    public static volatile SingularAttribute<ProcessVersion, String> process;

    public ProcessVersionStatic() {
    }
}
