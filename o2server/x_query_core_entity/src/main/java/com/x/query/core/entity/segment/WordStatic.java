package com.x.query.core.entity.segment;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Word.class)
public class WordStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Word, String> entry;
    public static volatile SingularAttribute<Word, String> value;
    public WordStatic() {
    }
}
