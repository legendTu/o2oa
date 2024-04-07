package com.x.message.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.util.List;

@StaticMetamodel(Instant.class)
public class InstantStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Instant, String> body;
    public static volatile SingularAttribute<Instant, Boolean> consumed;
    public static volatile SingularAttribute<Instant, String> id;
    public static volatile SingularAttribute<Instant, String> person;
    public static volatile SingularAttribute<Instant, String> title;
    public static volatile SingularAttribute<Instant, String> type;
    public static volatile SingularAttribute<Instant, List<String>> consumerList;

    public InstantStatic() {
    }
}
