package org.example;

public class Soal01 {
    public static void main(String[] args) {

        for(int jumlah = 1 ; jumlah <= 100 ; jumlah++){
            if(jumlah % 3 == 0 && jumlah % 5 == 0){
                System.out.println("BIZZBUZZ");
            } else if (jumlah % 3 == 0) {
                System.out.println("BIZZ");
            }else if (jumlah % 5 == 0){
                System.out.println("BUZZ");
            }else {
                System.out.println(jumlah);
            }
        }
    }
}