/**
 * @(#)Dept.java, 2022/9/2.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.test.pojo;

import java.util.List;

import lombok.Data;

/**
 * @Author zcwang
 * @Date 2022/9/2
 */
@Data
public class Dept {
    private Integer deptId;

    private String deptName;

    private List<Emp> empList;
}