import java.util.Scanner;
class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Methode_Overloading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scan.close();
        MathOperations math = new MathOperations();
        System.out.println(math.add(5, 10));          // Output: 15
        System.out.println(math.add(5, 10, 15));      // Output: 30
        System.out.println(math.add(5.5, 10.5));      // Output: 16.0
    }
}
