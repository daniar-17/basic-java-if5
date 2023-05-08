/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

/**
 *
 * @author dania
 */
public class Volume {
    public static void main(String[] args) {
        int panjang = 5;
        int lebar = 2;
        int tinggi = 4;
        int hasilVolPP;
        
        System.out.println("~Volume Persegi Panjang~");
        hasilVolPP = panjang * lebar * tinggi;
        System.out.println("Volume Persegi Panjang : " + hasilVolPP + "\n");
        
        double alas = 2;
        double tinggi2 = 5;
        double tinggiPrisma = 23;
        double hasilVolS;
        System.out.println("~Volume Prisma Segitiga~");
        hasilVolS = ((alas * tinggi2)/2) * tinggiPrisma;
        System.out.println("Volume Prisma Segitiga : " + hasilVolS);
    }
}
