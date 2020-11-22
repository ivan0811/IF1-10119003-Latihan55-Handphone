package com.ivanfaathirza;

public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga){
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct(){
        System.out.println("Manufaktur : ".concat(manufacture));
        System.out.println("OS : ".concat(operatingSystem));
        System.out.println("model : ".concat(model));
        System.out.println("harga : "+ harga);
    }
}
