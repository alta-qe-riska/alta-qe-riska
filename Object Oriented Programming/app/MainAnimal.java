package Tugas_OOP.app;

import Tugas_OOP.data.Herbivora;
import Tugas_OOP.data.Karnivora;
import Tugas_OOP.data.Omnivora;

public class MainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Herbivora herbivora = new Herbivora();
        herbivora.namaBinatang = "Kambing";
        herbivora.jenisMakanan = "tumbuhan";
        herbivora.jenisGigi = "tumpul";

        Karnivora karnivora = new Karnivora();
        karnivora.namaBinatang = "Harimau";
        karnivora.jenisMakanan = "daging";
        karnivora.jenisGigi = "tajam";

        Omnivora omnivora = new Omnivora();
        omnivora.namaBinatang = "Ayam";
        omnivora.jenisMakanan = "semua";
        omnivora.jenisGigi = "tumpul dan tajam";

        animal.identity_myself();
        herbivora.identity_myself();
        karnivora.identity_myself();
        omnivora.identity_myself();
    }

}
