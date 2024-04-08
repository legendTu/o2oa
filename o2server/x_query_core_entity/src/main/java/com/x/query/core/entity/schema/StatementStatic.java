package com.x.query.core.entity.schema;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Statement.class)
public class StatementStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Statement, String> alias;
    public static volatile SingularAttribute<Statement, Boolean> anonymousAccessible;
    public static volatile SingularAttribute<Statement, String> countData;
    public static volatile SingularAttribute<Statement, String> countMethod;
    public static volatile SingularAttribute<Statement, String> countScriptText;
    public static volatile SingularAttribute<Statement, String> creatorPerson;
    public static volatile SingularAttribute<Statement, String> data;
    public static volatile SingularAttribute<Statement, String> description;
    public static volatile SingularAttribute<Statement, Boolean> display;
    public static volatile SingularAttribute<Statement, String> entityCategory;
    public static volatile SingularAttribute<Statement, String> entityClassName;
    public static volatile ListAttribute<Statement, String> executeGroupList;
    public static volatile ListAttribute<Statement, String> executePersonList;
    public static volatile ListAttribute<Statement, String> executeUnitList;
    public static volatile SingularAttribute<Statement, String> format;
    public static volatile SingularAttribute<Statement, Float> fv;
    public static volatile SingularAttribute<Statement, String> id;
    public static volatile SingularAttribute<Statement, String> lastUpdatePerson;
    public static volatile SingularAttribute<Statement, Date> lastUpdateTime;
    public static volatile SingularAttribute<Statement, String> name;
    public static volatile SingularAttribute<Statement, Integer> orderNumber;
    public static volatile SingularAttribute<Statement, String> query;
    public static volatile SingularAttribute<Statement, String> scriptText;
    public static volatile SingularAttribute<Statement, String> sql;
    public static volatile SingularAttribute<Statement, String> sqlCount;
    public static volatile SingularAttribute<Statement, String> sqlCountScriptText;
    public static volatile SingularAttribute<Statement, String> sqlScriptText;
    public static volatile SingularAttribute<Statement, String> table;
    public static volatile SingularAttribute<Statement, String> testParameters;
    public static volatile SingularAttribute<Statement, String> view;
    public static volatile SingularAttribute<Statement, Boolean> viewEnable;

    public StatementStatic() {
    }
}
