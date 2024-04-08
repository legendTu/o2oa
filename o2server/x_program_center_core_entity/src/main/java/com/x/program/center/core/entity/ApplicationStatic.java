package com.x.program.center.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Application.class)
public class ApplicationStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Application, String> abort;
    public static volatile SingularAttribute<Application, String> category;
    public static volatile SingularAttribute<Application, Integer> commentCount;
    public static volatile SingularAttribute<Application, String> describe;
    public static volatile SingularAttribute<Application, Integer> downloadCount;
    public static volatile SingularAttribute<Application, Double> grade;
    public static volatile SingularAttribute<Application, String> icon;
    public static volatile SingularAttribute<Application, String> id;
    public static volatile SingularAttribute<Application, String> installSteps;
    public static volatile SingularAttribute<Application, Date> lastUpdateTime;
    public static volatile SingularAttribute<Application, String> name;
    public static volatile SingularAttribute<Application, Integer> orderNumber;
    public static volatile SingularAttribute<Application, Double> price;
    public static volatile SingularAttribute<Application, Date> publishTime;
    public static volatile SingularAttribute<Application, String> publisher;
    public static volatile SingularAttribute<Application, Integer> recommend;
    public static volatile SingularAttribute<Application, String> subCategory;
    public static volatile SingularAttribute<Application, String> version;

    public ApplicationStatic() {
    }
}
