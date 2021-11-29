/**
 * @(#)Wei.java, 2021/11/5.
 * <p/>
 * Copyright 2021 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package work;

import java.util.Objects;

/**
 * @Author Tmind
 * @Date 2021/11/5
 */
public class Wei extends Person{
    private String name;
    private Integer age;
    private Integer account;

    public Wei() {
    }

    public Wei(String name, Integer age, Integer account) {
        super();
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wei wei = (Wei) o;
        return Objects.equals(name, wei.name) && Objects.equals(age, wei.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}