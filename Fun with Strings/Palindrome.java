import java.util.Scanner;

public class Palindrome {
    String str;

    boolean isPalindrome = false;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter a new String");
        str = sc.nextLine();
    }

    void checkPalindrome() {
        // removing spaces
        String newStr = str.replaceAll("\\s", "");
        // converting to LowerCase
        newStr = newStr.toLowerCase();
        String tempStr = "";
        char ch;
        // reversing
        for (int i = 0; i < newStr.length(); i++) {
            ch = newStr.charAt(i);
            tempStr = ch + tempStr;
        }

        if (tempStr.equals(newStr)) {
            isPalindrome = true;
        }
    }

    void output() {
        System.out.println("Entered String : " + str);
        if (isPalindrome) {
            System.out.println("Entered String is Palindrome");
        } else {
            System.out.println("Entered String is not Palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.input();
        obj.checkPalindrome();
        obj.output();
    }
}
