/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

import java.util.Arrays;

/**
 *
 * @author dania
 */
public class Array2D {
    public static void main(String[] args) {
        System.out.println("Learning Array 2 Dimension");
        int arr2d [][] = new int[2][2];
        
        arr2d[0][0] = 10;
        arr2d[0][1] = 20;
        
        arr2d[1][0] = 30;
        arr2d[1][1] = 40;
        
        System.out.println(Arrays.toString(arr2d[0]));
        System.out.println(Arrays.toString(arr2d[1]));
    }
}
