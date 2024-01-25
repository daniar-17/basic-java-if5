package firstmeeting;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Palindrome");
        isPalindrome("radar");
    }

    static void isPalindrome(String myString) {
        int l = 0;
        int r = myString.length() - 1;
        int flag = 0;

        while (r > l) {
            System.out.println(myString.charAt(l) + " " + l + " nilai l");
            System.out.println(myString.charAt(r) + " " + r + " nilai r");

            if (myString.charAt(l) != myString.charAt(r)) {
                flag = 1;
                break;
            }
            l++;
            r--;
        }

        if (flag == 0) {
            System.out.println(myString + " is a Palindrome.");
        } else {
            System.out.println(myString + " is not a Palindrome.");
        }
    }
}
