/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;
import java.util.Random;

/**
 *
 * @author dania
 */
public class FirstMeeting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Learning Aritmatika
        
        var var1 = 11;
        int var2 = 5;
        int hasil;
        float hasilF;
        
        //Penjumlahan
        System.out.println("Learning Aritmatika");
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);
        
        //Pengurangan
        hasil = var1 - var2;
        System.out.printf("%d - %d = %d \n",var1,var2,hasil);
        
        //Perkalian
        hasil = var1 * var2;
        System.out.printf("%d x %d = %d \n",var1,var2,hasil);
        
        //Pembagian
        hasilF = var1 / var2;
        System.out.printf("%d / %d = ",var1,var2);
        System.out.println(hasilF);
        
        float a = 6;
        float b = 5;
        float hasilFloat = a / b;
        System.out.println(a + " / " + b +" = " + hasilFloat);
        System.out.printf("%f / %f = %f \n",a,b,hasilFloat);
        
        //Modulus (Sisa Bagi)
        hasil = var1 % var2;
        System.out.printf("%d %% %d = %d \n",var1,var2,hasil);
        
        //%d = decimal atau untuk Integer
        //%f = float untuk Float
        //$s = string
        System.out.println("Random Value : "  + new Random().nextInt(20));

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Daniar Ganteng");
            }else if(i % 3 == 0){
                System.out.println("Daniar");
            }else if(i % 5 == 0){
                System.out.println("Ganteng");
            }else{
                System.out.println(i);
            }
        }
    }
    
}
