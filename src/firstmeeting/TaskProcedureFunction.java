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
        int panjang = 5;
        int lebar = 3;
        int tinggi = 4;
        int sisi = 7;
        double phi = 3.14;
        int jari = 4;
        
        //Volume Kubus
        double ResultVolKubus = VolumeKubus(sisi);
        resultAll("Result Volume Kubus : ", ResultVolKubus);
        
        //Volume Kubus
        double ResultVolBalok = VolumeBalok(panjang, lebar, tinggi);
        resultAll("Result Volume Balok : ", ResultVolBalok);
        
        //Volume Kubus
        double ResultVolBola = VolumeBola(phi, jari);
        resultAll("Result Volume Bola : ", ResultVolBola);
        
        //Volume Pyramid
        double ResultVolPyramid = VolumePyramid(panjang, lebar, tinggi);
        resultAll("Result Volume Pyramid : ", ResultVolPyramid);
    }
    
    private static void resultAll(String text, double volume) {
        System.out.println(text + volume);
    }
    
    public static double VolumeKubus(int sisi){
        double Volume = Math.pow(sisi, 3);
        return Volume;
    }
    
    public static double VolumeBalok(int p, int l, int t){
        double Volume = p * l * t;
        return Volume;
    }
    
    public static double VolumeBola(double phi, int r){
        double Volume = (4/3) * phi * (Math.pow(r, 3));
        return Volume;
    }
    
    public static double VolumePyramid(int p, int l, int t){
        double Volume = (p * l * t) / 3;
        return Volume;
    }
}
