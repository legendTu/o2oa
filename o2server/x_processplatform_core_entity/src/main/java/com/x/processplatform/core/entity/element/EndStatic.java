
package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(End.class)
public class EndStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<End, String> afterArriveScript;
    public static volatile SingularAttribute<End, String> afterArriveScriptText;
    public static volatile SingularAttribute<End, String> afterExecuteScript;
    public static volatile SingularAttribute<End, String> afterExecuteScriptText;
    public static volatile SingularAttribute<End, String> afterInquireScript;
    public static volatile SingularAttribute<End, String> afterInquireScriptText;
    public static volatile SingularAttribute<End, String> alias;
    public static volatile SingularAttribute<End, Boolean> allowReroute;
    public static volatile SingularAttribute<End, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<End, Boolean> allowRollback;
    public static volatile SingularAttribute<End, String> beforeArriveScript;
    public static volatile SingularAttribute<End, String> beforeArriveScriptText;
    public static volatile SingularAttribute<End, String> beforeExecuteScript;
    public static volatile SingularAttribute<End, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<End, String> beforeInquireScript;
    public static volatile SingularAttribute<End, String> beforeInquireScriptText;
    public static volatile SingularAttribute<End, String> description;
    public static volatile SingularAttribute<End, String> displayLogScript;
    public static volatile SingularAttribute<End, String> displayLogScriptText;
    public static volatile SingularAttribute<End, String> edition;
    public static volatile SingularAttribute<End, String> extension;
    public static volatile SingularAttribute<End, String> form;
    public static volatile SingularAttribute<End, String> group;
    public static volatile SingularAttribute<End, String> id;
    public static volatile SingularAttribute<End, String> name;
    public static volatile SingularAttribute<End, String> opinionGroup;
    public static volatile SingularAttribute<End, String> position;
    public static volatile SingularAttribute<End, String> process;
    public static volatile SingularAttribute<End, EndProperties> properties;
    public static volatile ListAttribute<End, String> readDataPathList;
    public static volatile SingularAttribute<End, String> readDuty;
    public static volatile ListAttribute<End, String> readGroupList;
    public static volatile ListAttribute<End, String> readIdentityList;
    public static volatile SingularAttribute<End, String> readScript;
    public static volatile SingularAttribute<End, String> readScriptText;
    public static volatile ListAttribute<End, String> readUnitList;
    public static volatile ListAttribute<End, String> reviewDataPathList;
    public static volatile SingularAttribute<End, String> reviewDuty;
    public static volatile ListAttribute<End, String> reviewGroupList;
    public static volatile ListAttribute<End, String> reviewIdentityList;
    public static volatile SingularAttribute<End, String> reviewScript;
    public static volatile SingularAttribute<End, String> reviewScriptText;
    public static volatile ListAttribute<End, String> reviewUnitList;

    public EndStatic() {
    }
}
