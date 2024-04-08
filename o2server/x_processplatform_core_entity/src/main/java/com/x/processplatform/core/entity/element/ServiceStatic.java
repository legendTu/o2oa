package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Service.class)
public class ServiceStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Service, String> afterArriveScript;
    public static volatile SingularAttribute<Service, String> afterArriveScriptText;
    public static volatile SingularAttribute<Service, String> afterExecuteScript;
    public static volatile SingularAttribute<Service, String> afterExecuteScriptText;
    public static volatile SingularAttribute<Service, String> afterInquireScript;
    public static volatile SingularAttribute<Service, String> afterInquireScriptText;
    public static volatile SingularAttribute<Service, String> alias;
    public static volatile SingularAttribute<Service, Boolean> allowReroute;
    public static volatile SingularAttribute<Service, Boolean> allowRerouteTo;
    public static volatile SingularAttribute<Service, String> beforeArriveScript;
    public static volatile SingularAttribute<Service, String> beforeArriveScriptText;
    public static volatile SingularAttribute<Service, String> beforeExecuteScript;
    public static volatile SingularAttribute<Service, String> beforeExecuteScriptText;
    public static volatile SingularAttribute<Service, String> beforeInquireScript;
    public static volatile SingularAttribute<Service, String> beforeInquireScriptText;
    public static volatile SingularAttribute<Service, String> description;
    public static volatile SingularAttribute<Service, String> displayLogScript;
    public static volatile SingularAttribute<Service, String> displayLogScriptText;
    public static volatile SingularAttribute<Service, String> edition;
    public static volatile SingularAttribute<Service, String> extension;
    public static volatile SingularAttribute<Service, String> form;
    public static volatile SingularAttribute<Service, String> group;
    public static volatile SingularAttribute<Service, String> id;
    public static volatile SingularAttribute<Service, String> name;
    public static volatile SingularAttribute<Service, String> opinionGroup;
    public static volatile SingularAttribute<Service, String> position;
    public static volatile SingularAttribute<Service, String> process;
    public static volatile SingularAttribute<Service, ServiceProperties> properties;
    public static volatile ListAttribute<Service, String> readDataPathList;
    public static volatile SingularAttribute<Service, String> readDuty;
    public static volatile ListAttribute<Service, String> readGroupList;
    public static volatile ListAttribute<Service, String> readIdentityList;
    public static volatile SingularAttribute<Service, String> readScript;
    public static volatile SingularAttribute<Service, String> readScriptText;
    public static volatile ListAttribute<Service, String> readUnitList;
    public static volatile ListAttribute<Service, String> reviewDataPathList;
    public static volatile SingularAttribute<Service, String> reviewDuty;
    public static volatile ListAttribute<Service, String> reviewGroupList;
    public static volatile ListAttribute<Service, String> reviewIdentityList;
    public static volatile SingularAttribute<Service, String> reviewScript;
    public static volatile SingularAttribute<Service, String> reviewScriptText;
    public static volatile ListAttribute<Service, String> reviewUnitList;
    public static volatile SingularAttribute<Service, String> route;
    public static volatile SingularAttribute<Service, String> script;
    public static volatile SingularAttribute<Service, String> scriptText;
    public static volatile ListAttribute<Service, String> trustAddressList;

    public ServiceStatic() {
    }
}
