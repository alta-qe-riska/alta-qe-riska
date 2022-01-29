package Tugas_OOP.app;

import Tugas_OOP.data.Barang;
import Tugas_OOP.data.OngkosKirim;

public class MainOngkosKirim {
    public static void main(String[] args) {
        Barang barang = new Barang();
        OngkosKirim ongkosKirim = new OngkosKirim();

        barang.panjang = 5;
        barang.lebar = 2;
        barang.tinggi = 4;
        barang.berat = 1;

        ongkosKirim.syarat(barang.volume(), barang.berat());
    }
}
