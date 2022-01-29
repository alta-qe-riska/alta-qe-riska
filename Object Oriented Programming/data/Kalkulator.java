package Tugas_OOP.data;

public class Kalkulator {
    public double hasil;



    public void pemjumlahan (double var1, double var2){
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);
    }
    public void pengurangan (double var1, double var2){
        hasil = var1 - var2;
        System.out.println(var1 + " - " + var2 + " = " + hasil);
    }
    public void pembagian (double var1, double var2){
        hasil = var1 / var2;
        System.out.println(var1 + " / " + var2 + " = " + hasil);
    }
    public void perkalian (double var1, double var2){
        hasil = var1 * var2;
        System.out.println(var1 + " * " + var2 + " = " + hasil);
    }
}
