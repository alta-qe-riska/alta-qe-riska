package Tugas_Java;
import java.util.Scanner;

public class FaktorBilangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;

        System.out.println("Input nilai: ");
        nilai = input.nextInt();

        for (int j=nilai; j>0; j--){
            if(nilai %j ==0){
                System.out.println(""+j);
            }
        }
    }
}