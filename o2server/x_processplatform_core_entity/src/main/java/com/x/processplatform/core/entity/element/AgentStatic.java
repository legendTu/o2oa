package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Agent.class)
public class AgentStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Agent, String> afterArriveScript;
    public static volatile SingularAttribute<Agent, String> afterArriveScriptText;
    public static volatile SingularAttribute<Agent, String> afterExecuteScript;
    public static volatile SingularAttribute<Agent, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Agent, String> afterInquireScript;
    public static volatile SingularAttribute<Agent, String> afterInquireScriptText;
    public static volatile SingularAttribute<Agent, String> agentInterruptScript;
    public static volatile SingularAttribute<Agent, String> agentInterruptScriptText;
    public static volatile SingularAttribute<Agent, String> alias;
    public static volatile SingularAttribute<Agent, Boolean> allowReroute;
    public static volatile SingularAttribute<Agent, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Agent, String> beforeArriveScript;
    public static volatile SingularAttribute<Agent, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Agent, String> beforeExecuteScript;
    public static volatile SingularAttribute<Agent, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Agent, String> beforeInquireScript;
    public static volatile SingularAttribute<Agent, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Agent, String> description;
    public static volatile SingularAttribute<Agent, String> displayLogScript;
    public static volatile SingularAttribute<Agent, String> displayLogScriptText;
    public static volatile SingularAttribute<Agent, String> edition;
    public static volatile SingularAttribute<Agent, String> extension;
    public static volatile SingularAttribute<Agent, String> form;
    public static volatile SingularAttribute<Agent, String> group;
    public static volatile SingularAttribute<Agent, String> id;
    public static volatile SingularAttribute<Agent, String> name;
    public static volatile SingularAttribute<Agent, String> opinionGroup;
    public static volatile SingularAttribute<Agent, String> position;
    public static volatile SingularAttribute<Agent, String> process;
    public static volatile SingularAttribute<Agent, AgentProperties> properties;
    public static volatile ListAttribute<Agent, String> readDataPathList;
    public static volatile SingularAttribute<Agent, String> readDuty;
    public static volatile ListAttribute<Agent, String> readGroupList;
    public static volatile ListAttribute<Agent, String> readIdentityList;
    public static volatile SingularAttribute<Agent, String> readScript;
    public static volatile SingularAttribute<Agent, String> readScriptText;
    public static volatile ListAttribute<Agent, String> readUnitList;
    public static volatile ListAttribute<Agent, String> reviewDataPathList;
    public static volatile SingularAttribute<Agent, String> reviewDuty;
    public static volatile ListAttribute<Agent, String> reviewGroupList;
    public static volatile ListAttribute<Agent, String> reviewIdentityList;
    public static volatile SingularAttribute<Agent, String> reviewScript;
    public static volatile SingularAttribute<Agent, String> reviewScriptText;
    public static volatile ListAttribute<Agent, String> reviewUnitList;
    public static volatile SingularAttribute<Agent, String> route;
    public static volatile SingularAttribute<Agent, String> script;
    public static volatile SingularAttribute<Agent, String> scriptText;

    public AgentStatic() {
    }
}
