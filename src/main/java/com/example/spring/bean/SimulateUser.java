package com.example.spring.bean;



public class SimulateUser {
    private  Integer id;
    private String username;
    private  String password;
    private  Integer cellPhone;

    public SimulateUser() {
    }

    public SimulateUser(Integer id, String username, String password, Integer cellPhone) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.cellPhone = cellPhone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Integer cellPhone) {
        this.cellPhone = cellPhone;
    }


}
