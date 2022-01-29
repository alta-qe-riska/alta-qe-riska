package Tugas_OOP.data;

import Tugas_OOP.app.BangunRuang;

public class Balok extends BangunRuang {
    int Panjang;
    int Lebar;
    int Tinggi;

    public Balok(int Panjang, int Lebar, int Tinggi){
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Tinggi = Tinggi;
    }
    public float volume(){
        return this.Panjang * this.Lebar * this.Tinggi;
    }
}
