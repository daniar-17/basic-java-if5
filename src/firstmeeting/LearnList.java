/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dania
 */
public class LearnList {
    public static void main(String[] args) {
        System.out.println("Learning List");
        System.out.println("-------------");
        List<String> list1 = new ArrayList<>();
        list1.add("JavaScript");
        list1.add("Java");
        list1.add("Go Language");
        list1.add("Ruby");
        
        // First Way
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println();
        
        // Second Way
        for (String name : list1) {
            System.out.println(name);
        }
    }
}
