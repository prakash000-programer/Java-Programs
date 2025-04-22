import java.util.Scanner;
public class Capitalize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scan.nextLine();
        scan.close();
        String[] parts = word.split(" ");
        String a;

        for(int i=0; i<parts.length;i++){
            String b = parts[i];
            String result = b.substring(0, 1).toUpperCase() + b.substring(1);
            System.out.print(result+" ");
        }
        
    }
}
