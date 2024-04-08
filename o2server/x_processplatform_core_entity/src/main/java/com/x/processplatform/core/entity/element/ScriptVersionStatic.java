package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ScriptVersion.class)
public class ScriptVersionStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ScriptVersion, String> data;
    public static volatile SingularAttribute<ScriptVersion, String> id;
    public static volatile SingularAttribute<ScriptVersion, String> script;

    public ScriptVersionStatic() {
    }
}
