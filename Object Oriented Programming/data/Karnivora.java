package Tugas_OOP.data;

import Tugas_OOP.app.Animal;

public class Karnivora extends Animal {
    public void identity_myself(){
        System.out.println("Hi I'm Karnivor, my name is " + this.namaBinatang + ", My food is " + this.jenisMakanan + ", I have " + this.jenisGigi + " teeth");
    }
}
