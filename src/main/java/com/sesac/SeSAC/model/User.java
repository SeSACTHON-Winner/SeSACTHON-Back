package com.sesac.SeSAC.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String name;

    private String nickname;
    private boolean sex;
    private int age;

    @OneToMany(mappedBy = "user")
    private List<RunningInfo> runningInfoList;

    @OneToMany(mappedBy = "user")
    private List<DangerInfo> dangerInfoList;

}
