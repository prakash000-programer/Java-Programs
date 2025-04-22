import java.util.Scanner;

class User_Input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Reading a full line for the name
        System.out.print("Enter your name: ");
        String name = inp.nextLine();

        // Reading two integers
        System.out.print("Enter first number: ");
        int a = inp.nextInt();

        System.out.print("Enter second number: ");
        int b = inp.nextInt();

        inp.nextLine(); // Consume the leftover newline character after nextInt()

        // Calculating the sum
        int c = a + b;
        System.out.println("The Sum is: " + c);
        System.out.println("Name: " + name);

        inp.close(); // Close the scanner
    }
}

