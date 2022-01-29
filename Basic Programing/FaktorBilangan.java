package Tugas_Java;
import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int nilai;

        System.out.println("Input nilai: ");
        nilai = input.nextInt();

    for (int i=1; i<=nilai; i++){
        if(nilai%i==0){
            System.out.println(i);
            }
        }
    }
}

