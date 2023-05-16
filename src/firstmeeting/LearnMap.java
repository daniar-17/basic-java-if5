/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmeeting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        System.out.println("------------");
        Map<Integer, List<Integer>> mahasiswa = new HashMap<>();
        List<Integer> nilai = new ArrayList<>();
        
        mahasiswa.put(10115152, nilai);
        nilai.add(86);
        nilai.add(92);
        nilai.add(82);
        for (Map.Entry<Integer, List<Integer>> mhs : mahasiswa.entrySet()) {
            System.out.println("Nim Mahasiswa : " + mhs.getKey());
            System.out.print("Nilai : ");
            for (Integer valNilai : mhs.getValue()) {
                System.out.print(valNilai + ", ");
            }
        }
        System.out.println();
    }
}
