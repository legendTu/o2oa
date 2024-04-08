package com.x.query.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(ImportModel.class)
public class ImportModelStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<ImportModel, String> alias;
    public static volatile ListAttribute<ImportModel, String> availableGroupList;
    public static volatile ListAttribute<ImportModel, String> availableIdentityList;
    public static volatile ListAttribute<ImportModel, String> availableUnitList;
    public static volatile SingularAttribute<ImportModel, String> code;
    public static volatile SingularAttribute<ImportModel, Integer> count;
    public static volatile SingularAttribute<ImportModel, String> data;
    public static volatile SingularAttribute<ImportModel, String> description;
    public static volatile SingularAttribute<ImportModel, Boolean> display;
    public static volatile SingularAttribute<ImportModel, Boolean> enableValid;
    public static volatile SingularAttribute<ImportModel, String> id;
    public static volatile SingularAttribute<ImportModel, String> layout;
    public static volatile SingularAttribute<ImportModel, String> name;
    public static volatile SingularAttribute<ImportModel, Integer> orderNumber;
    public static volatile SingularAttribute<ImportModel, String> processStatus;
    public static volatile SingularAttribute<ImportModel, String> query;
    public static volatile SingularAttribute<ImportModel, String> type;

    public ImportModelStatic() {
    }
}
