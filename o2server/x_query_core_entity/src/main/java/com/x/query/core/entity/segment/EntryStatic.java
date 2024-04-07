package com.x.query.core.entity.segment;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Entry.class)
public class EntryStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Entry, String> id;
    public static volatile SingularAttribute<Entry, String> type;
    public static volatile SingularAttribute<Entry, String> reference;

    public EntryStatic(){

    }
}
