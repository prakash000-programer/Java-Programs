import java.util.Scanner;
class Customer{
    String name;
    int Id;
    int units;
    Customer(String n ,int i ,int u){
        this.name = n;
        this.Id = i;
        this.units = u;
    }
    double calculateBill(){
        double bill = 0;
        if(units <= 100 || units >= 100){
           bill += (units < 100) ? (units * 0.50) : (100 * 0.50) ;
           if(units > 100){
              bill += (units <= 300) ? ((units - 100) * 0.75) : (200 * 0.75);
              if(units > 300){
                   bill += (units - 300) * 1.00;
              }
           } 
        }
        return bill;
    }
}
public class Electricity_bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
        Customer c = new Customer("Prakash", 1070, 500);
        System.out.printf("$%.2f" , c.calculateBill());
    }
}

