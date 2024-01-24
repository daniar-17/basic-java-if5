package firstmeeting;

public class Outline {
    public static void main(String[] args){
        System.out.println("Detailkan Rupiah");
        String nilai = "14.754.234";
        nilai = nilai.replace(".","");
        for (int i = 0; i < nilai.length(); i++) {
            for (int j = 0; j < nilai.length(); j++) {
                if (i == j){
                    System.out.print(nilai.charAt(j));
                }else if (j > i){
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
