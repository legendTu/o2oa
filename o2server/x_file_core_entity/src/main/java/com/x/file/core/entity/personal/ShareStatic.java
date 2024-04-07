package com.x.file.core.entity.personal;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Share.class)
public class ShareStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Share, String> extension;
    public static volatile SingularAttribute<Share, String> fileId;
    public static volatile SingularAttribute<Share, String> fileType;
    public static volatile SingularAttribute<Share, String> id;
    public static volatile SingularAttribute<Share, Date> lastUpdateTime;
    public static volatile SingularAttribute<Share, Long> length;
    public static volatile SingularAttribute<Share, String> name;
    public static volatile SingularAttribute<Share, String> password;
    public static volatile SingularAttribute<Share, String> person;
    public static volatile ListAttribute<Share, String> shareGroupList;
    public static volatile ListAttribute<Share, String> shareOrgList;
    public static volatile SingularAttribute<Share, String> shareType;
    public static volatile ListAttribute<Share, String> shareUserList;
    public static volatile ListAttribute<Share, String> shieldUserList;
    public static volatile SingularAttribute<Share, Date> validTime;

    public ShareStatic() {
    }
}
