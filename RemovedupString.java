import java.util.Scanner;

public class RemovedupString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        scan.close();

        String result = "";  // To hold unique characters

        System.out.print("Unique Characters: ");
        for (char c : word.toCharArray()) {
            if (result.indexOf(c) == -1) {  // If character not yet in result
                result += c;
                System.out.print(c);
            }
        }
    }
}
