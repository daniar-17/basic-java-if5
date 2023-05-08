/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

import java.util.Scanner;

/**
 *
 * @author dania
 */
public class CariNilai {
    public static void main(String[] args) {
        //Cari Nilai Mahasiswa
        System.out.println("Mencari Nilai Index Nilai");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Input Nilai : ");
        int nilaiInput = myObj.nextInt();
        
        //int nilai = 86;
        if(nilaiInput > 85){
            System.out.println("Index Nilai A");
        }else if(nilaiInput > 70 && nilaiInput <= 85){
            System.out.println("Index Nilai B");
        }else if(nilaiInput > 60 && nilaiInput <= 70){
            System.out.println("Index Nilai C");
        }else if(nilaiInput > 50 && nilaiInput <= 60){
            System.out.println("Index Nilai D");
        }else if(nilaiInput <= 50){
            System.out.println("Index Nilai E");
        }
    }
}
