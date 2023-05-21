/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopMain;
import oopModel.Orang;

/**
 *
 * @author dania
 */
public class oopMain {
    public static void main(String[] args) {
        System.out.println("First Time Lerning OOP in Java");
        
        Orang orang = new Orang("Vernand", 27, "Bandung", 'L');
        orang.setNama("Vernand");
        orang.sayHello();
        
        orang.setTinggiBadan(170);
        
        System.out.println("umur = "+orang.getUmur());
        System.out.println("Alamat = "+orang.getAlamat());
        System.out.println("jenis Kelamin = "+orang.getJenisKelamin());
        System.out.println("tinggi badan = "+orang.getTinggiBadan());
    }
}
