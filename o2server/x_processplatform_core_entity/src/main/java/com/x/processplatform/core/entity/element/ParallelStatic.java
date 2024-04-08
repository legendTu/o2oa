package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Parallel.class)
public class ParallelStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Parallel, String> afterArriveScript;
    public static volatile SingularAttribute<Parallel, String> afterArriveScriptText;
    public static volatile SingularAttribute<Parallel, String> afterExecuteScript;
    public static volatile SingularAttribute<Parallel, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Parallel, String> afterInquireScript;
    public static volatile SingularAttribute<Parallel, String> afterInquireScriptText;
    public static volatile SingularAttribute<Parallel, String> alias;
    public static volatile SingularAttribute<Parallel, Boolean> allowReroute;
    public static volatile SingularAttribute<Parallel, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Parallel, String> beforeArriveScript;
    public static volatile SingularAttribute<Parallel, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Parallel, String> beforeExecuteScript;
    public static volatile SingularAttribute<Parallel, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Parallel, String> beforeInquireScript;
    public static volatile SingularAttribute<Parallel, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Parallel, String> description;
    public static volatile SingularAttribute<Parallel, String> displayLogScript;
    public static volatile SingularAttribute<Parallel, String> displayLogScriptText;
    public static volatile SingularAttribute<Parallel, String> edition;
    public static volatile SingularAttribute<Parallel, String> extension;
    public static volatile SingularAttribute<Parallel, String> form;
    public static volatile SingularAttribute<Parallel, String> group;
    public static volatile SingularAttribute<Parallel, String> id;
    public static volatile SingularAttribute<Parallel, String> name;
    public static volatile SingularAttribute<Parallel, String> opinionGroup;
    public static volatile SingularAttribute<Parallel, String> position;
    public static volatile SingularAttribute<Parallel, String> process;
    public static volatile SingularAttribute<Parallel, ParallelProperties> properties;
    public static volatile ListAttribute<Parallel, String> readDataPathList;
    public static volatile SingularAttribute<Parallel, String> readDuty;
    public static volatile ListAttribute<Parallel, String> readGroupList;
    public static volatile ListAttribute<Parallel, String> readIdentityList;
    public static volatile SingularAttribute<Parallel, String> readScript;
    public static volatile SingularAttribute<Parallel, String> readScriptText;
    public static volatile ListAttribute<Parallel, String> readUnitList;
    public static volatile ListAttribute<Parallel, String> reviewDataPathList;
    public static volatile SingularAttribute<Parallel, String> reviewDuty;
    public static volatile ListAttribute<Parallel, String> reviewGroupList;
    public static volatile ListAttribute<Parallel, String> reviewIdentityList;
    public static volatile SingularAttribute<Parallel, String> reviewScript;
    public static volatile SingularAttribute<Parallel, String> reviewScriptText;
    public static volatile ListAttribute<Parallel, String> reviewUnitList;
    public static volatile ListAttribute<Parallel, String> routeList;

    public ParallelStatic() {
    }
}
