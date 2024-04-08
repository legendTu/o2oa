package com.x.processplatform.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Application.class)
public class ApplicationStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Application, String> alias;
    public static volatile SingularAttribute<Application, String> applicationCategory;
    public static volatile ListAttribute<Application, String> availableGroupList;
    public static volatile ListAttribute<Application, String> availableIdentityList;
    public static volatile ListAttribute<Application, String> availableUnitList;
    public static volatile ListAttribute<Application, String> controllerList;
    public static volatile SingularAttribute<Application, String> creatorPerson;
    public static volatile SingularAttribute<Application, String> description;
    public static volatile SingularAttribute<Application, String> icon;
    public static volatile SingularAttribute<Application, String> iconHue;
    public static volatile SingularAttribute<Application, String> id;
    public static volatile SingularAttribute<Application, String> lastUpdatePerson;
    public static volatile SingularAttribute<Application, Date> lastUpdateTime;
    public static volatile SingularAttribute<Application, String> name;
    public static volatile SingularAttribute<Application, ApplicationProperties> properties;

    public ApplicationStatic() {
    }
}
