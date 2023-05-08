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
public class Looping {
    public static void main(String[] args) {
        System.out.println("Learning Looping");   
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 9; j++) {
                if(i % 2 == 0){
                    if (j == i + 1 || j == i + 2) {
                        System.out.print("*");
                    } else{
                        System.out.print(j);
                    }
                }else{
                    if (j == i + 1 || j == i + 2) {
                        System.out.print("~");
                    } else{
                        System.out.print(j);
                    }
                }
                
            }
            System.out.println();
        }
        
        System.out.println();
        for (int i = 9; i >= 1; i--) {
            System.out.print(i);
        }
        System.out.println();
    }
}
