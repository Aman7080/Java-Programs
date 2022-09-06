import java.util.Scanner;

public class Reverse {
    String str;
    String newstr = "";

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
            newstr = ch + newstr;
        }
    }

    // to display the result
    void display() {
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + newstr);
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.input();
        obj.rev();
        obj.display();
    }
}
