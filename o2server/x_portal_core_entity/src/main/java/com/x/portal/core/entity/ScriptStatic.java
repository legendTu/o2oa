package com.x.portal.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Script.class)
public class ScriptStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Script, String> alias;
    public static volatile SingularAttribute<Script, String> creatorPerson;
    public static volatile ListAttribute<Script, String> dependScriptList;
    public static volatile SingularAttribute<Script, String> description;
    public static volatile SingularAttribute<Script, String> id;
    public static volatile SingularAttribute<Script, String> lastUpdatePerson;
    public static volatile SingularAttribute<Script, Date> lastUpdateTime;
    public static volatile SingularAttribute<Script, String> name;
    public static volatile SingularAttribute<Script, String> portal;
    public static volatile SingularAttribute<Script, String> text;
    public static volatile SingularAttribute<Script, Boolean> validated;

    public ScriptStatic() {
    }
}
