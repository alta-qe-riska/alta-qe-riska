package Tugas_Java;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas, tinggi;
        double luas;

        System.out.print("Input alas: ");
        alas = input.nextInt();

        System.out.print("Input Tinggi: ");
        tinggi = input.nextInt();

        luas = alas*tinggi*0.5;
        System.out.println("Luas segitiga: "+luas);
    }
}
