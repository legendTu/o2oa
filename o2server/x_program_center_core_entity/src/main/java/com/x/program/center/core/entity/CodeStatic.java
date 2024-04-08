package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Code.class)
public class CodeStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Code, String> answer;
    public static volatile SingularAttribute<Code, String> id;
    public static volatile SingularAttribute<Code, String> meta;
    public static volatile SingularAttribute<Code, String> mobile;
    public static volatile SingularAttribute<Code, Integer> verifyNumber;

    public CodeStatic() {
    }
}
