package Tugas_OOP.data;

import Tugas_OOP.app.BangunDatar;

public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double luas(){
        return this.alas * this.tinggi * 0.5;
    }
    public float keliling(){
        return this.alas * this.tinggi;
    }
}
