package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Agent.class)
public class AgentStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Agent, String> alias;
    public static volatile SingularAttribute<Agent, String> cron;
    public static volatile SingularAttribute<Agent, String> description;
    public static volatile SingularAttribute<Agent, Boolean> enable;
    public static volatile SingularAttribute<Agent, String> id;
    public static volatile SingularAttribute<Agent, Date> lastEndTime;
    public static volatile SingularAttribute<Agent, Date> lastStartTime;
    public static volatile SingularAttribute<Agent, String> name;
    public static volatile SingularAttribute<Agent, String> text;
    public static volatile SingularAttribute<Agent, Boolean> validated;

    public AgentStatic() {
    }
}
