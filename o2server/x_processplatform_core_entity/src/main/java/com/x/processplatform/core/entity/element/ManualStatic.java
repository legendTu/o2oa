package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Manual.class)
public class ManualStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Manual, String> afterArriveScript;
    public static volatile SingularAttribute<Manual, String> afterArriveScriptText;
    public static volatile SingularAttribute<Manual, String> afterExecuteScript;
    public static volatile SingularAttribute<Manual, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Manual, String> afterInquireScript;
    public static volatile SingularAttribute<Manual, String> afterInquireScriptText;
    public static volatile SingularAttribute<Manual, String> alias;
    public static volatile SingularAttribute<Manual, Boolean> allowAddSplit;
    public static volatile SingularAttribute<Manual, Boolean> allowDeleteWork;
    public static volatile SingularAttribute<Manual, Boolean> allowPause;
    public static volatile SingularAttribute<Manual, Boolean> allowPress;
    public static volatile SingularAttribute<Manual, Boolean> allowRapid;
    public static volatile SingularAttribute<Manual, Boolean> allowReroute;
    public static volatile SingularAttribute<Manual, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Manual, Boolean> allowReset;
    public static volatile SingularAttribute<Manual, Boolean> allowRetract;
    public static volatile SingularAttribute<Manual, Boolean> allowRollback;
    public static volatile SingularAttribute<Manual, String> beforeArriveScript;
    public static volatile SingularAttribute<Manual, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Manual, String> beforeExecuteScript;
    public static volatile SingularAttribute<Manual, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Manual, String> beforeInquireScript;
    public static volatile SingularAttribute<Manual, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Manual, String> description;
    public static volatile SingularAttribute<Manual, String> displayLogScript;
    public static volatile SingularAttribute<Manual, String> displayLogScriptText;
    public static volatile SingularAttribute<Manual, String> edition;
    public static volatile SingularAttribute<Manual, String> extension;
    public static volatile SingularAttribute<Manual, String> form;
    public static volatile SingularAttribute<Manual, String> group;
    public static volatile SingularAttribute<Manual, String> id;
    public static volatile SingularAttribute<Manual, String> manualAfterTaskScript;
    public static volatile SingularAttribute<Manual, String> manualAfterTaskScriptText;
    public static volatile SingularAttribute<Manual, String> manualBeforeTaskScript;
    public static volatile SingularAttribute<Manual, String> manualBeforeTaskScriptText;
    public static volatile SingularAttribute<Manual, Boolean> manualMergeSameJobActivity;
    public static volatile SingularAttribute<Manual, ManualMode> manualMode;
    public static volatile SingularAttribute<Manual, String> manualStayScript;
    public static volatile SingularAttribute<Manual, String> manualStayScriptText;
    public static volatile SingularAttribute<Manual, Boolean> manualUncompletedTaskToRead;
    public static volatile SingularAttribute<Manual, String> name;
    public static volatile SingularAttribute<Manual, String> opinionGroup;
    public static volatile SingularAttribute<Manual, String> position;
    public static volatile SingularAttribute<Manual, String> process;
    public static volatile SingularAttribute<Manual, ManualProperties> properties;
    public static volatile ListAttribute<Manual, String> readDataPathList;
    public static volatile SingularAttribute<Manual, String> readDuty;
    public static volatile ListAttribute<Manual, String> readGroupList;
    public static volatile ListAttribute<Manual, String> readIdentityList;
    public static volatile SingularAttribute<Manual, String> readScript;
    public static volatile SingularAttribute<Manual, String> readScriptText;
    public static volatile ListAttribute<Manual, String> readUnitList;
    public static volatile SingularAttribute<Manual, Integer> resetCount;
    public static volatile SingularAttribute<Manual, String> resetRange;
    public static volatile SingularAttribute<Manual, String> resetRangeScriptText;
    public static volatile ListAttribute<Manual, String> reviewDataPathList;
    public static volatile SingularAttribute<Manual, String> reviewDuty;
    public static volatile ListAttribute<Manual, String> reviewGroupList;
    public static volatile ListAttribute<Manual, String> reviewIdentityList;
    public static volatile SingularAttribute<Manual, String> reviewScript;
    public static volatile SingularAttribute<Manual, String> reviewScriptText;
    public static volatile ListAttribute<Manual, String> reviewUnitList;
    public static volatile ListAttribute<Manual, String> routeList;
    public static volatile ListAttribute<Manual, String> taskDataPathList;
    public static volatile SingularAttribute<Manual, String> taskDuty;
    public static volatile SingularAttribute<Manual, Integer> taskExpireDay;
    public static volatile SingularAttribute<Manual, Integer> taskExpireHour;
    public static volatile SingularAttribute<Manual, String> taskExpireScript;
    public static volatile SingularAttribute<Manual, String> taskExpireScriptText;
    public static volatile SingularAttribute<Manual, ExpireType> taskExpireType;
    public static volatile SingularAttribute<Manual, Boolean> taskExpireWorkTime;
    public static volatile ListAttribute<Manual, String> taskGroupList;
    public static volatile ListAttribute<Manual, String> taskIdentityList;
    public static volatile SingularAttribute<Manual, String> taskScript;
    public static volatile SingularAttribute<Manual, String> taskScriptText;
    public static volatile ListAttribute<Manual, String> taskUnitList;

    public ManualStatic() {
    }
}
