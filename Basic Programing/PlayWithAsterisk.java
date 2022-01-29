package Tugas_Java;

public class PlayWithAsterisk {
    public static void main(String[] args) {
        int a=5;
        System.out.print("Input nilai: " + a);
        System.out.println();
        System.out.println("output: ");


        for (int x = 1; x <= a; x++) {
            for (int y = a - 1; y >= x; y--) {
                System.out.print(" ");
            }
            for (int y = 1; y<=x; y++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
   }
}


