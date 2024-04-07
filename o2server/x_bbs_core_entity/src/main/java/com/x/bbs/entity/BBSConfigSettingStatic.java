package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BBSConfigSetting.class)
public class BBSConfigSettingStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<BBSConfigSetting, String> configCode;
    public static volatile SingularAttribute<BBSConfigSetting, String> configName;
    public static volatile SingularAttribute<BBSConfigSetting, String> configValue;
    public static volatile SingularAttribute<BBSConfigSetting, String> description;
    public static volatile SingularAttribute<BBSConfigSetting, String> id;
    public static volatile SingularAttribute<BBSConfigSetting, Boolean> isMultiple;
    public static volatile SingularAttribute<BBSConfigSetting, Integer> orderNumber;
    public static volatile SingularAttribute<BBSConfigSetting, String> selectContent;
    public static volatile SingularAttribute<BBSConfigSetting, String> valueType;

    public BBSConfigSettingStatic() {
    }
}
