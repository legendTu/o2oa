package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Split.class)
public class SplitStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Split, String> afterArriveScript;
    public static volatile SingularAttribute<Split, String> afterArriveScriptText;
    public static volatile SingularAttribute<Split, String> afterExecuteScript;
    public static volatile SingularAttribute<Split, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Split, String> afterInquireScript;
    public static volatile SingularAttribute<Split, String> afterInquireScriptText;
    public static volatile SingularAttribute<Split, String> alias;
    public static volatile SingularAttribute<Split, Boolean> allowReroute;
    public static volatile SingularAttribute<Split, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Split, String> beforeArriveScript;
    public static volatile SingularAttribute<Split, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Split, String> beforeExecuteScript;
    public static volatile SingularAttribute<Split, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Split, String> beforeInquireScript;
    public static volatile SingularAttribute<Split, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Split, String> description;
    public static volatile SingularAttribute<Split, String> displayLogScript;
    public static volatile SingularAttribute<Split, String> displayLogScriptText;
    public static volatile SingularAttribute<Split, String> edition;
    public static volatile SingularAttribute<Split, String> extension;
    public static volatile SingularAttribute<Split, String> form;
    public static volatile SingularAttribute<Split, String> group;
    public static volatile SingularAttribute<Split, String> id;
    public static volatile SingularAttribute<Split, String> name;
    public static volatile SingularAttribute<Split, String> opinionGroup;
    public static volatile SingularAttribute<Split, String> position;
    public static volatile SingularAttribute<Split, String> process;
    public static volatile SingularAttribute<Split, SplitProperties> properties;
    public static volatile ListAttribute<Split, String> readDataPathList;
    public static volatile SingularAttribute<Split, String> readDuty;
    public static volatile ListAttribute<Split, String> readGroupList;
    public static volatile ListAttribute<Split, String> readIdentityList;
    public static volatile SingularAttribute<Split, String> readScript;
    public static volatile SingularAttribute<Split, String> readScriptText;
    public static volatile ListAttribute<Split, String> readUnitList;
    public static volatile ListAttribute<Split, String> reviewDataPathList;
    public static volatile SingularAttribute<Split, String> reviewDuty;
    public static volatile ListAttribute<Split, String> reviewGroupList;
    public static volatile ListAttribute<Split, String> reviewIdentityList;
    public static volatile SingularAttribute<Split, String> reviewScript;
    public static volatile SingularAttribute<Split, String> reviewScriptText;
    public static volatile ListAttribute<Split, String> reviewUnitList;
    public static volatile SingularAttribute<Split, String> route;
    public static volatile SingularAttribute<Split, String> script;
    public static volatile SingularAttribute<Split, String> scriptText;

    public SplitStatic() {
    }
}
