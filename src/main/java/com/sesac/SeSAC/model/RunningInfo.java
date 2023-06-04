package com.sesac.SeSAC.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class RunningInfo {

    @Id @GeneratedValue
    @Column(name = "running_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime runningDate;

    private String picture; // 수정 필요


    //==연관관계 메서드==//
    public void setUser(User user) {
        this.user = user;
        user.getRunningInfoList().add(this);
    }

    //==생성 메서드==//
    public static RunningInfo createRunning(User user, String picturePath) {
        RunningInfo runningInfo = new RunningInfo();
        runningInfo.setUser(user);

        runningInfo.setPicture(picturePath);
        runningInfo.setRunningDate(LocalDateTime.now());

        return runningInfo;
    }

}
