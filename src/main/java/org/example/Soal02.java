package org.example;

public class Soal02 {
    public static void main(String[] args) {
        int akhir = 9;
        int Awal = 1;
        while (akhir > 0) {
            for (int i = Awal;i <= akhir; i++) {
                if(i%2==0){
                    System.out.print("_");
                }else{
                    System.out.print(i);
                }
            }
            System.out.println();
            Awal+=1;
            akhir -= 1;
        }
    }
}
