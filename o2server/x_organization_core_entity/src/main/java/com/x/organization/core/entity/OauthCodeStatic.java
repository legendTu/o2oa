package com.x.organization.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(OauthCode.class)
public class OauthCodeStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<OauthCode, String> accessToken;
    public static volatile SingularAttribute<OauthCode, String> clientId;
    public static volatile SingularAttribute<OauthCode, String> code;
    public static volatile SingularAttribute<OauthCode, Boolean> codeUsed;
    public static volatile SingularAttribute<OauthCode, String> id;
    public static volatile SingularAttribute<OauthCode, String> person;
    public static volatile SingularAttribute<OauthCode, String> scope;

    public OauthCodeStatic() {
    }
}
