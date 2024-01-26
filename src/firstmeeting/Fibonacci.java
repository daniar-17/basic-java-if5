package firstmeeting;

public class Fibonacci {
    public static void main (String[] args){
        System.out.println("Fibonacci :");
        int angkaSebelumnya = 0;
        int angkaSelanjutnya = 1;
        int hasil = 0;
        System.out.print(angkaSebelumnya + " " + angkaSelanjutnya + " ");
        for (int i = 0; i < 10; i++) {
            hasil = angkaSebelumnya + angkaSelanjutnya;
            System.out.print(hasil + " ");

            angkaSebelumnya = angkaSelanjutnya;
            angkaSelanjutnya = hasil;
        }
    }
}
