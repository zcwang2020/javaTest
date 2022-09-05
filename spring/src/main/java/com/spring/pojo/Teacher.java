/**
 * @(#)Teacher.java, 2022/9/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.spring.pojo;

/**
 * @Author zcwang
 * @Date 2022/9/5
 */
public class Teacher {

    private Integer tid;

    private String tname;

    public Teacher() {
    }

    public Integer getTid() {
        return tid;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}