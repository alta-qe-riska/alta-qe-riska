package Tugas_OOP.data;

import Tugas_OOP.app.BangunDatar;

public class PersegiPanjang extends BangunDatar {

    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double luas(){
        return this.panjang * this.lebar;
    }
    public float keliling(){
        return 2 * (this.panjang + this.lebar);
    }
}
