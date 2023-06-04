package com.sesac.SeSAC.model;

import lombok.Data;

@Data
public class DangerInfo {
    String hello = "hello";

    public DangerInfo(String hello) {
        this.hello = hello;
    }
}
