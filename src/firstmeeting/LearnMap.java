/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dania
 */
public class LearnMap {
    public static void main(String[] args) {
        System.out.println("Learning Map");
        System.out.println("------------");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10115152, "Daniar");
        hashMap.put(10115153, "Ranovan");
        hashMap.put(10115154, "Vernand");
        hashMap.put(10115155, "Fajar");
        hashMap.put(10115156, "Opik");
        for (Map.Entry<Integer, String> me : hashMap.entrySet()) {
            System.out.println(me.getKey() +" : "+ me.getValue());
        }
    }
}
