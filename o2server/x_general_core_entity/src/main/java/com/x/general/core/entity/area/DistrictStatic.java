package com.x.general.core.entity.area;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(District.class)
public class DistrictStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<District, String> center;
    public static volatile SingularAttribute<District, String> city;
    public static volatile SingularAttribute<District, String> cityCode;
    public static volatile SingularAttribute<District, String> district;
    public static volatile SingularAttribute<District, String> id;
    public static volatile SingularAttribute<District, String> level;
    public static volatile SingularAttribute<District, String> name;
    public static volatile SingularAttribute<District, String> province;
    public static volatile SingularAttribute<District, String> sha;
    public static volatile SingularAttribute<District, String> zipCode;

    public DistrictStatic() {
    }
}
