package com.x.meeting.core.entity;

import com.x.base.core.entity.SliceJpaObjectStatic;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Room.class)
public class RoomStatic extends SliceJpaObjectStatic {
    public static volatile SingularAttribute<Room, String> auditor;
    public static volatile SingularAttribute<Room, Boolean> available;
    public static volatile SingularAttribute<Room, String> building;
    public static volatile SingularAttribute<Room, Integer> capacity;
    public static volatile SingularAttribute<Room, String> device;
    public static volatile SingularAttribute<Room, Integer> floor;
    public static volatile SingularAttribute<Room, String> id;
    public static volatile SingularAttribute<Room, String> name;
    public static volatile SingularAttribute<Room, String> phoneNumber;
    public static volatile SingularAttribute<Room, String> photo;
    public static volatile SingularAttribute<Room, String> pinyin;
    public static volatile SingularAttribute<Room, String> pinyinInitial;
    public static volatile SingularAttribute<Room, String> roomNumber;

    public RoomStatic() {
    }
}
