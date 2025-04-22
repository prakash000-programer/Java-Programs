import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String originalString = scan.nextLine();
        scan.close();
        String reverseString;
        for(int i = originalString.length()-1;i = 0;i--){
            reverseString = reverseString + charAt(i);
        }
        if(originalString.equals(reverseString)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}

