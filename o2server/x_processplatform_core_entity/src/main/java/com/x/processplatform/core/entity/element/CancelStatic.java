package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Cancel.class)
public class CancelStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Cancel, String> afterArriveScript;
    public static volatile SingularAttribute<Cancel, String> afterArriveScriptText;
    public static volatile SingularAttribute<Cancel, String> afterExecuteScript;
    public static volatile SingularAttribute<Cancel, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Cancel, String> afterInquireScript;
    public static volatile SingularAttribute<Cancel, String> afterInquireScriptText;
    public static volatile SingularAttribute<Cancel, String> alias;
    public static volatile SingularAttribute<Cancel, Boolean> allowReroute;
    public static volatile SingularAttribute<Cancel, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Cancel, String> beforeArriveScript;
    public static volatile SingularAttribute<Cancel, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Cancel, String> beforeExecuteScript;
    public static volatile SingularAttribute<Cancel, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Cancel, String> beforeInquireScript;
    public static volatile SingularAttribute<Cancel, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Cancel, String> description;
    public static volatile SingularAttribute<Cancel, String> displayLogScript;
    public static volatile SingularAttribute<Cancel, String> displayLogScriptText;
    public static volatile SingularAttribute<Cancel, String> edition;
    public static volatile SingularAttribute<Cancel, String> extension;
    public static volatile SingularAttribute<Cancel, String> form;
    public static volatile SingularAttribute<Cancel, String> group;
    public static volatile SingularAttribute<Cancel, String> id;
    public static volatile SingularAttribute<Cancel, String> name;
    public static volatile SingularAttribute<Cancel, String> opinionGroup;
    public static volatile SingularAttribute<Cancel, String> position;
    public static volatile SingularAttribute<Cancel, String> process;
    public static volatile SingularAttribute<Cancel, CancelProperties> properties;
    public static volatile ListAttribute<Cancel, String> readDataPathList;
    public static volatile SingularAttribute<Cancel, String> readDuty;
    public static volatile ListAttribute<Cancel, String> readGroupList;
    public static volatile ListAttribute<Cancel, String> readIdentityList;
    public static volatile SingularAttribute<Cancel, String> readScript;
    public static volatile SingularAttribute<Cancel, String> readScriptText;
    public static volatile ListAttribute<Cancel, String> readUnitList;
    public static volatile ListAttribute<Cancel, String> reviewDataPathList;
    public static volatile SingularAttribute<Cancel, String> reviewDuty;
    public static volatile ListAttribute<Cancel, String> reviewGroupList;
    public static volatile ListAttribute<Cancel, String> reviewIdentityList;
    public static volatile SingularAttribute<Cancel, String> reviewScript;
    public static volatile SingularAttribute<Cancel, String> reviewScriptText;
    public static volatile ListAttribute<Cancel, String> reviewUnitList;

    public CancelStatic() {
    }
}
