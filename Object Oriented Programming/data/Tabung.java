package Tugas_OOP.data;

import Tugas_OOP.app.BangunRuang;

public class Tabung extends BangunRuang {
    int r;
    int tinggiTabung;

    public Tabung (int r, int tinggiTabung){
        this.r = r;
        this.tinggiTabung = tinggiTabung;
    }
    public float volume(){
        return (float) (Math.PI * r * r) * this.tinggiTabung;
    }
}
