package Tugas_OOP.data;

import Tugas_OOP.app.BangunDatar;

public class Persegi extends BangunDatar {

    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }


    public double luas() {
        return this.sisi * this.sisi;
    }

    public float keliling() {

        return this.sisi * 4;
    }

}
