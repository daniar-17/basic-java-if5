package firstmeeting;

import java.util.Arrays;

public class kalimatToKata {
    public static void main(String[] args){
        System.out.println("Kalimat to Kata");
        String kalimat = "aku dan ibu pergi ke pasar ibu membeli sapu dan pel aku membeli buku dan pulpen";
        String[] kata = kalimat.split(" ");
        String[] uniq = Arrays.stream(kata).distinct().toArray(String[]::new);
        int temp = 0;
        for (int i = 0; i < uniq.length; i++) {
            for (int j = 0; j < kata.length; j++) {
                if (uniq[i].equals(kata[j])){
                    temp += 1;
                }
            }
            System.out.println(uniq[i] + " : " + temp);
            temp = 0;
        }
    }
}
