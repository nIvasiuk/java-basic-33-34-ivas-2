package com.berlin.telran.practice.set_get_veriables;

public class Supermarket {
    private int ids;
    private int idOwner;
    private String company;

    public Supermarket (int id){
        this.ids = id;
    }

    public int getIdS() {
        return ids;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
