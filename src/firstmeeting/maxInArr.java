package firstmeeting;

public class maxInArr {
    public static void main(String[] args){
        System.out.println("Mencari Nilai Max dari Array");
        int[] arr = {2, 5, 6, 86, 35, 32};
        int max = 0;
        for (int data : arr){
            if (data > max){
                max = data;
            }
        }
        System.out.println("Nilai Terbeser : " + max);
    }
}
