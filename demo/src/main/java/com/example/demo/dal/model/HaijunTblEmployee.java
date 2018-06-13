package com.example.demo.dal.model;

import javax.persistence.*;

@Table(name = "haijun_tbl_employee")
public class HaijunTblEmployee {
    @Id
    @Column(name = "id")
    private Integer MySql;

    private String username;

    private String password;

    /**
     * @return id
     */
    public Integer getMySql() {
        return MySql;
    }

    /**
     * @param MySql
     */
    public void setMySql(Integer MySql) {
        this.MySql = MySql;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}