package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Captcha.class)
public class CaptchaStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Captcha, String> answer;
    public static volatile SingularAttribute<Captcha, String> id;
    public static volatile SingularAttribute<Captcha, String> meta;

    public CaptchaStatic() {
    }
}
