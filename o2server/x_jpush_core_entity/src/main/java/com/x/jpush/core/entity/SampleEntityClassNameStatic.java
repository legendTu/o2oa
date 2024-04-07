package com.x.jpush.core.entity;

import com.x.base.core.entity.StorageObjectStatic;

import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SampleEntityClassName.class)
public class SampleEntityClassNameStatic extends StorageObjectStatic {

    public static volatile ListAttribute<SampleEntityClassName, String> id;
    public SampleEntityClassNameStatic(){

    }
}
