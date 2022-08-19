import java.io.BufferedReader;
import java.io.InputStreamReader;

public class numberInput {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A number");
        int num = Integer.parseInt(br.readLine()); // Integer.parseInt converts string[br.radeline()] into int
        System.out.println("You Entered : " + num);
    }
}
