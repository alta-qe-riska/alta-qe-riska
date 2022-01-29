package Tugas_Java;

public class BilanganPrima{
    public static void main(String[] args) {
        boolean isPrima = true;
        int i=2;
        while (i<=10){
            int j = 2;
            while (j<i){
                if(i%j==0){
                    isPrima = false;
                    break;
                }
                j++;
            }
            if(isPrima==true){
                System.out.print(i+" ");
            }
            i++;
            isPrima = true;
    }

    }

}
