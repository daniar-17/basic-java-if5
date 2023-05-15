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
public class TaskProcedureFunction {
    public static void main(String[] args) {
        System.out.println("Learning Procedure and Function");
        System.out.println("-------------------------------");
        int panjang = 3;
        int lebar = 3;
        int tinggi = 3;
        int sisi = 3;
        int phi = 3;
        int jari = 4;
        
        //Volume Kubus
        double ResultVolKubus = VolumeKubus(sisi);
        System.out.println("Result Volume Kubus : " + ResultVolKubus);
        
        //Volume Kubus
        double ResultVolBalok = VolumeBalok(panjang, lebar, tinggi);
        System.out.println("Result Volume Balok : " + ResultVolBalok);
    }
    
    public static double VolumeKubus(int sisi){
        double Luas = Math.pow(sisi, 3);
        return Luas;
    }
    
    public static double VolumeBalok(int p, int l, int t){
        double Luas = p * l * t;
        return Luas;
    }
}
