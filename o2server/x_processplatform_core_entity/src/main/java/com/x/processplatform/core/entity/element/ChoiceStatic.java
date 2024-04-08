package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Choice.class)
public class ChoiceStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Choice, String> afterArriveScript;
    public static volatile SingularAttribute<Choice, String> afterArriveScriptText;
    public static volatile SingularAttribute<Choice, String> afterExecuteScript;
    public static volatile SingularAttribute<Choice, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Choice, String> afterInquireScript;
    public static volatile SingularAttribute<Choice, String> afterInquireScriptText;
    public static volatile SingularAttribute<Choice, String> alias;
    public static volatile SingularAttribute<Choice, Boolean> allowReroute;
    public static volatile SingularAttribute<Choice, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Choice, String> beforeArriveScript;
    public static volatile SingularAttribute<Choice, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Choice, String> beforeExecuteScript;
    public static volatile SingularAttribute<Choice, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Choice, String> beforeInquireScript;
    public static volatile SingularAttribute<Choice, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Choice, String> description;
    public static volatile SingularAttribute<Choice, String> displayLogScript;
    public static volatile SingularAttribute<Choice, String> displayLogScriptText;
    public static volatile SingularAttribute<Choice, String> edition;
    public static volatile SingularAttribute<Choice, String> extension;
    public static volatile SingularAttribute<Choice, String> form;
    public static volatile SingularAttribute<Choice, String> group;
    public static volatile SingularAttribute<Choice, String> id;
    public static volatile SingularAttribute<Choice, String> name;
    public static volatile SingularAttribute<Choice, String> opinionGroup;
    public static volatile SingularAttribute<Choice, String> position;
    public static volatile SingularAttribute<Choice, String> process;
    public static volatile SingularAttribute<Choice, ChoiceProperties> properties;
    public static volatile ListAttribute<Choice, String> readDataPathList;
    public static volatile SingularAttribute<Choice, String> readDuty;
    public static volatile ListAttribute<Choice, String> readGroupList;
    public static volatile ListAttribute<Choice, String> readIdentityList;
    public static volatile SingularAttribute<Choice, String> readScript;
    public static volatile SingularAttribute<Choice, String> readScriptText;
    public static volatile ListAttribute<Choice, String> readUnitList;
    public static volatile ListAttribute<Choice, String> reviewDataPathList;
    public static volatile SingularAttribute<Choice, String> reviewDuty;
    public static volatile ListAttribute<Choice, String> reviewGroupList;
    public static volatile ListAttribute<Choice, String> reviewIdentityList;
    public static volatile SingularAttribute<Choice, String> reviewScript;
    public static volatile SingularAttribute<Choice, String> reviewScriptText;
    public static volatile ListAttribute<Choice, String> reviewUnitList;
    public static volatile ListAttribute<Choice, String> routeList;

    public ChoiceStatic() {
    }
}
