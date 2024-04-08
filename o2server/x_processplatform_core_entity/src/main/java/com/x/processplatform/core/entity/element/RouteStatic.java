package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Route.class)
public class RouteStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Route, String> activity;
    public static volatile SingularAttribute<Route, ActivityType> activityType;
    public static volatile SingularAttribute<Route, String> alias;
    public static volatile SingularAttribute<Route, String> appendTaskIdentityScript;
    public static volatile SingularAttribute<Route, String> appendTaskIdentityScriptText;
    public static volatile SingularAttribute<Route, String> appendTaskIdentityType;
    public static volatile SingularAttribute<Route, String> decisionOpinion;
    public static volatile SingularAttribute<Route, String> description;
    public static volatile SingularAttribute<Route, String> displayNameScript;
    public static volatile SingularAttribute<Route, String> displayNameScriptText;
    public static volatile SingularAttribute<Route, String> edition;
    public static volatile SingularAttribute<Route, String> hiddenScript;
    public static volatile SingularAttribute<Route, String> hiddenScriptText;
    public static volatile SingularAttribute<Route, String> id;
    public static volatile SingularAttribute<Route, String> name;
    public static volatile SingularAttribute<Route, String> opinion;
    public static volatile SingularAttribute<Route, Boolean> opinionRequired;
    public static volatile SingularAttribute<Route, Integer> orderNumber;
    public static volatile SingularAttribute<Route, Boolean> passExpired;
    public static volatile SingularAttribute<Route, Boolean> passSameTarget;
    public static volatile SingularAttribute<Route, String> position;
    public static volatile SingularAttribute<Route, String> process;
    public static volatile SingularAttribute<Route, RouteProperties> properties;
    public static volatile SingularAttribute<Route, String> script;
    public static volatile SingularAttribute<Route, String> scriptText;
    public static volatile SingularAttribute<Route, String> selectConfig;
    public static volatile SingularAttribute<Route, Boolean> sole;
    public static volatile SingularAttribute<Route, String> track;
    public static volatile SingularAttribute<Route, String> type;
    public static volatile SingularAttribute<Route, String> validationScript;
    public static volatile SingularAttribute<Route, String> validationScriptText;

    public RouteStatic() {
    }
}
