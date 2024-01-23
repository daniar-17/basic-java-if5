package firstmeeting;

public class bilPrima {
    public static void main(String[] args){
        var countPrima = 0;
        System.out.println("Range Bil Prima :");
        for (int i = 1; i <= 20; i++) {
            var a = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    a++;
                }
            }
            if (a == 2){
                System.out.print(i + " ");
                countPrima++;
            }
        }
        System.out.println();
        System.out.println("Jumlah Bilangan Prima : " + countPrima);
    }
}
