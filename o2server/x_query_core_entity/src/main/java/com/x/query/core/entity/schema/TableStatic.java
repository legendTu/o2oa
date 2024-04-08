package com.x.query.core.entity.schema;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Table.class)
public class TableStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Table, String> alias;
    public static volatile SingularAttribute<Table, Boolean> buildSuccess;
    public static volatile SingularAttribute<Table, String> creatorPerson;
    public static volatile SingularAttribute<Table, String> data;
    public static volatile SingularAttribute<Table, String> description;
    public static volatile SingularAttribute<Table, Boolean> display;
    public static volatile SingularAttribute<Table, String> draftData;
    public static volatile ListAttribute<Table, String> editGroupList;
    public static volatile ListAttribute<Table, String> editPersonList;
    public static volatile ListAttribute<Table, String> editUnitList;
    public static volatile SingularAttribute<Table, String> id;
    public static volatile SingularAttribute<Table, String> lastUpdatePerson;
    public static volatile SingularAttribute<Table, Date> lastUpdateTime;
    public static volatile SingularAttribute<Table, String> name;
    public static volatile SingularAttribute<Table, Integer> orderNumber;
    public static volatile SingularAttribute<Table, String> query;
    public static volatile ListAttribute<Table, String> readGroupList;
    public static volatile ListAttribute<Table, String> readPersonList;
    public static volatile ListAttribute<Table, String> readUnitList;
    public static volatile SingularAttribute<Table, String> status;

    public TableStatic() {
    }
}
