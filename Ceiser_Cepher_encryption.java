import java.util.Scanner;

public class Ceiser_Cepher_encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        System.out.print("Enter shift key: ");
        int shift = scan.nextInt();
        scan.close();

        StringBuilder encrypted = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char c = (char) ((ch - 'A' + shift) % 26 + 'A');
                encrypted.append(c);
            } else if (Character.isLowerCase(ch)) {
                char c = (char) ((ch - 'a' + shift) % 26 + 'a');
                encrypted.append(c);
            } else {
                encrypted.append(ch); // keep spaces, symbols unchanged
            }
        }

        System.out.println(encrypted);
    }
}
