//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.x.cms.core.entity.element;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(File.class)
public class FileStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<File, String> alias;
    public static volatile SingularAttribute<File, String> appId;
    public static volatile SingularAttribute<File, String> data;
    public static volatile SingularAttribute<File, String> description;
    public static volatile SingularAttribute<File, String> fileName;
    public static volatile SingularAttribute<File, String> id;
    public static volatile SingularAttribute<File, String> lastUpdatePerson;
    public static volatile SingularAttribute<File, Date> lastUpdateTime;
    public static volatile SingularAttribute<File, Long> length;
    public static volatile SingularAttribute<File, String> name;

    public FileStatic() {
    }
}
