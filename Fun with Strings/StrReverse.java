import java.util.Scanner;

public class StrReverse {
    String str;
    String nstr = "";

    // to take user input
    void input() {
        System.out.println("Enter Any String ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        sc.close();
    }

    // reversing String
    void rev() {
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
    }

    // to display the result
    void display() {
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + nstr);
    }

    public static void main(String[] args) {
        StrReverse obj = new StrReverse();
        obj.input();
        obj.rev();
        obj.display();
    }
}
