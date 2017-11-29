package com.dzr.dds.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author dingzr
 * @Description
 * @ClassName Demo
 * @since 2017/11/29 17:15
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Override
    public String toString() {
        return "Demo[id=" + id +", name=" + name +"]";
    }
}
