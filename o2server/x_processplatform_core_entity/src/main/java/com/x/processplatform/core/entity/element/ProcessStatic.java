package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Process.class)
public class ProcessStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Process, String> afterArriveScript;
    public static volatile SingularAttribute<Process, String> afterArriveScriptText;
    public static volatile SingularAttribute<Process, String> afterBeginScript;
    public static volatile SingularAttribute<Process, String> afterBeginScriptText;
    public static volatile SingularAttribute<Process, String> afterEndScript;
    public static volatile SingularAttribute<Process, String> afterEndScriptText;
    public static volatile SingularAttribute<Process, String> afterExecuteScript;
    public static volatile SingularAttribute<Process, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Process, String> afterInquireScript;
    public static volatile SingularAttribute<Process, String> afterInquireScriptText;
    public static volatile SingularAttribute<Process, String> alias;
    public static volatile SingularAttribute<Process, String> application;
    public static volatile SingularAttribute<Process, String> beforeArriveScript;
    public static volatile SingularAttribute<Process, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Process, String> beforeExecuteScript;
    public static volatile SingularAttribute<Process, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Process, String> beforeInquireScript;
    public static volatile SingularAttribute<Process, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Process, String> category;
    public static volatile SingularAttribute<Process, Boolean> checkDraft;
    public static volatile ListAttribute<Process, String> controllerList;
    public static volatile SingularAttribute<Process, String> creatorPerson;
    public static volatile SingularAttribute<Process, String> defaultStartMode;
    public static volatile SingularAttribute<Process, String> description;
    public static volatile SingularAttribute<Process, String> edition;
    public static volatile SingularAttribute<Process, String> editionDes;
    public static volatile SingularAttribute<Process, Boolean> editionEnable;
    public static volatile SingularAttribute<Process, String> editionName;
    public static volatile SingularAttribute<Process, Double> editionNumber;
    public static volatile SingularAttribute<Process, Integer> expireDay;
    public static volatile SingularAttribute<Process, Integer> expireHour;
    public static volatile SingularAttribute<Process, ExpireType> expireType;
    public static volatile SingularAttribute<Process, Boolean> expireWorkTime;
    public static volatile SingularAttribute<Process, String> icon;
    public static volatile SingularAttribute<Process, String> id;
    public static volatile SingularAttribute<Process, String> lastUpdatePerson;
    public static volatile SingularAttribute<Process, Date> lastUpdateTime;
    public static volatile SingularAttribute<Process, String> name;
    public static volatile SingularAttribute<Process, String> projection;
    public static volatile SingularAttribute<Process, Boolean> projectionFully;
    public static volatile SingularAttribute<Process, ProcessProperties> properties;
    public static volatile SingularAttribute<Process, Boolean> routeNameAsOpinion;
    public static volatile SingularAttribute<Process, String> serialActivity;
    public static volatile SingularAttribute<Process, String> serialPhase;
    public static volatile SingularAttribute<Process, String> serialTexture;
    public static volatile ListAttribute<Process, String> startableGroupList;
    public static volatile ListAttribute<Process, String> startableIdentityList;
    public static volatile SingularAttribute<Process, String> startableTerminal;
    public static volatile ListAttribute<Process, String> startableUnitList;

    public ProcessStatic() {
    }
}
