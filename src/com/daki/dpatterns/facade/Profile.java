package com.stefancipe.dpatterns.facade;

public class Profile {
    protected String email;
    protected String password;
    protected String address;

    public Profile(String email, String password, String address) {
        this.email = email;
        this.password = password;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
