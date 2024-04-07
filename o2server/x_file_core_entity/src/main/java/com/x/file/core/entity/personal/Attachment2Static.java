package com.x.file.core.entity.personal;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Attachment2.class)
public class Attachment2Static extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Attachment2, String> description;
    public static volatile SingularAttribute<Attachment2, String> extension;
    public static volatile SingularAttribute<Attachment2, Integer> fileVersion;
    public static volatile SingularAttribute<Attachment2, String> folder;
    public static volatile SingularAttribute<Attachment2, String> id;
    public static volatile SingularAttribute<Attachment2, String> lastUpdatePerson;
    public static volatile SingularAttribute<Attachment2, Date> lastUpdateTime;
    public static volatile SingularAttribute<Attachment2, Long> length;
    public static volatile SingularAttribute<Attachment2, String> name;
    public static volatile SingularAttribute<Attachment2, String> originFile;
    public static volatile SingularAttribute<Attachment2, String> person;
    public static volatile SingularAttribute<Attachment2, String> status;
    public static volatile SingularAttribute<Attachment2, String> type;

    public Attachment2Static() {
    }
}
