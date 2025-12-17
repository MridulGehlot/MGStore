package com.mg.store.beans;

public class CustomerBean {
    private Long code;
    private String name;
    private String email;
    private String password;
    private String passwordKey;
    private java.sql.Date dateOfRegistration;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordKey() {
        return passwordKey;
    }

    public void setPasswordKey(String passwordKey) {
        this.passwordKey = passwordKey;
    }

    public java.sql.Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(java.sql.Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }
}
