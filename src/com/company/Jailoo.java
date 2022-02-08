package com.company;

public class Jailoo{

    private String name;
    private String address;
    private String chabanAty;


    public Jailoo(String name, String address, String chabanAty) {
        this.name = name;
        this.address = address;
        this.chabanAty = chabanAty;
    }
    public Jailoo(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getChabanAty() {
        return chabanAty;
    }

    public void setChabanAty(String chabanAty) {
        this.chabanAty = chabanAty;
    }


}
