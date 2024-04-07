package com.x.calendar.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Calendar_SettingLobValue.class)
public class Calendar_SettingLobValueStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Calendar_SettingLobValue, String> id;
    public static volatile SingularAttribute<Calendar_SettingLobValue, String> lobValue;

    public Calendar_SettingLobValueStatic() {
    }
}
