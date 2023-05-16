/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dania
 */
public class LearnSet {
    public static void main(String[] args) {
        System.out.println("Learning Set");
        System.out.println("-------------");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Yellow");
        hashSet.add("Blue");
        hashSet.add("Green");
        hashSet.add("Black");
        for(String name : hashSet){
            System.out.println("Name Set : " + name);
        }
    }
}
