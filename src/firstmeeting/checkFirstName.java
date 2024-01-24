package firstmeeting;

public class checkFirstName {
    public static void main(String[] args){
        System.out.println("Mencari Huruf Pertama");
        String[] arrName = {"Daniar","Fitra","Diky","Epul","Ubaed"};
        for (int i = 0; i < arrName.length; i++) {
            if (arrName[i].charAt(0) == 'd' || arrName[i].charAt(0) == 'D') {
                System.out.println(arrName[i]);
            }
        }
    }
}
