package com.sesac.SeSAC.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class DangerInfo {

    @Id @GeneratedValue
    @Column(name = "danger_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double latitude;

    private Double longitude;

    private String picture; // 수정 필요

    @Enumerated(EnumType.STRING)
    private DangerType dangerType;

    //==연관관계 메서드==//
    public void setUser(User user) {
        this.user = user;
        user.getDangerInfoList().add(this);
    }

    //==생성 메서드==//
    public static DangerInfo createDanger(User user, Double latitude, Double longitude, String picturePath, DangerType dangerType) {
        DangerInfo dangerInfo = new DangerInfo();
        dangerInfo.setUser(user);

        dangerInfo.setLatitude(latitude);
        dangerInfo.setLongitude(longitude);
        dangerInfo.setDangerType(dangerType);
        dangerInfo.setPicture(picturePath);
        return dangerInfo;
    }

}
