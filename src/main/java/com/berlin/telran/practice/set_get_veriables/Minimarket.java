package com.berlin.telran.practice.set_get_veriables;

public class Minimarket {
    private int idM;
    private int idOwner;
    private String company;

    public Minimarket (int id){
        this.idM = id;
    }

    public int getIdM() {
        return idM;
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
