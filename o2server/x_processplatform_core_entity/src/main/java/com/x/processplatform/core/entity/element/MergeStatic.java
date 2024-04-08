package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Merge.class)
public class MergeStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Merge, String> afterArriveScript;
    public static volatile SingularAttribute<Merge, String> afterArriveScriptText;
    public static volatile SingularAttribute<Merge, String> afterExecuteScript;
    public static volatile SingularAttribute<Merge, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Merge, String> afterInquireScript;
    public static volatile SingularAttribute<Merge, String> afterInquireScriptText;
    public static volatile SingularAttribute<Merge, String> alias;
    public static volatile SingularAttribute<Merge, Boolean> allowReroute;
    public static volatile SingularAttribute<Merge, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Merge, String> beforeArriveScript;
    public static volatile SingularAttribute<Merge, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Merge, String> beforeExecuteScript;
    public static volatile SingularAttribute<Merge, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Merge, String> beforeInquireScript;
    public static volatile SingularAttribute<Merge, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Merge, String> description;
    public static volatile SingularAttribute<Merge, String> displayLogScript;
    public static volatile SingularAttribute<Merge, String> displayLogScriptText;
    public static volatile SingularAttribute<Merge, String> edition;
    public static volatile SingularAttribute<Merge, String> extension;
    public static volatile SingularAttribute<Merge, String> form;
    public static volatile SingularAttribute<Merge, String> group;
    public static volatile SingularAttribute<Merge, String> id;
    public static volatile SingularAttribute<Merge, String> name;
    public static volatile SingularAttribute<Merge, String> opinionGroup;
    public static volatile SingularAttribute<Merge, String> position;
    public static volatile SingularAttribute<Merge, String> process;
    public static volatile SingularAttribute<Merge, MergeProperties> properties;
    public static volatile ListAttribute<Merge, String> readDataPathList;
    public static volatile SingularAttribute<Merge, String> readDuty;
    public static volatile ListAttribute<Merge, String> readGroupList;
    public static volatile ListAttribute<Merge, String> readIdentityList;
    public static volatile SingularAttribute<Merge, String> readScript;
    public static volatile SingularAttribute<Merge, String> readScriptText;
    public static volatile ListAttribute<Merge, String> readUnitList;
    public static volatile ListAttribute<Merge, String> reviewDataPathList;
    public static volatile SingularAttribute<Merge, String> reviewDuty;
    public static volatile ListAttribute<Merge, String> reviewGroupList;
    public static volatile ListAttribute<Merge, String> reviewIdentityList;
    public static volatile SingularAttribute<Merge, String> reviewScript;
    public static volatile SingularAttribute<Merge, String> reviewScriptText;
    public static volatile ListAttribute<Merge, String> reviewUnitList;
    public static volatile SingularAttribute<Merge, String> route;

    public MergeStatic() {
    }
}
