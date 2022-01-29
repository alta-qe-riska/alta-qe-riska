package Tugas_OOP.app;

import Tugas_OOP.data.Balok;
import Tugas_OOP.data.Kubus;
import Tugas_OOP.data.Tabung;

public class Main2 {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang();
        Kubus kubus = new Kubus(10);
        Balok balok = new Balok(3,6,10);
        Tabung tabung = new Tabung(7,10);

        bangunRuang.volume();

        System.out.println("Volume Kubus " + kubus.volume());
        System.out.println("Volume Balok " + balok.volume());
        System.out.println("Volume Tabung " + tabung.volume());
    }
}
