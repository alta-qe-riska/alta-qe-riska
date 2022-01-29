package Tugas_OOP.data;

import Tugas_OOP.app.BangunRuang;

public class Kubus extends BangunRuang {
    int Sisi;

    public Kubus(int Sisi){

        this.Sisi = Sisi;
    }
    public float volume(){

        return this.Sisi * this.Sisi * this.Sisi;
    }
}
