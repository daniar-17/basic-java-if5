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
public class TaskArray {
    public static void main(String[] args) {
        System.out.println("Task Array");
        int n = 21;
        int input[] = new int[n];
        //Insert Data to array
        for (int i = 0; i < n; i++) {
            input[i] = i + 1;
        }
        
        //Result from array
        System.out.println();
        System.out.print("Input : ");
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + ",");
        }
        System.out.println();
        System.out.print("Output : ");
        for (int i = 0; i < n; i++) {
            if(input[i] % 3 == 0){
                System.out.print(input[i] + ",");
            }
        }
        System.out.println();
    }
}
