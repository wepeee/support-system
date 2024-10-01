
import java.util.Scanner;

public class inputreader {

    public String input;
    Scanner sc = new Scanner(System.in);

    public inputreader() {
        input = "";
    }

    public void getInput() {
        System.out.print(">");
        input = sc.nextLine();
    }

    public boolean getBye() {
        return "bye".equals(input);
    }

}
