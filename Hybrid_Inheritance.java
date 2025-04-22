class vehicle{
    void run(){
        System.out.println("The Vehicle Is Running.");
    }
}
class bike extends vehicle{
    void wheeling(){
        System.out.println("The bike is now wheeling.");
    }
}
class car extends vehicle{
    @Override
    void run() {
        // TODO Auto-generated method stub
        super.run();
    }   
    void speed(){
        System.out.println("The car is now running in 100Km Speed.");
    }
}
class electric_Car extends car{
void charg(){
    System.out.println("The car is now charging");
}    
}
public class Hybrid_Inheritance {
    public static void main(String[] args) {
        electric_Car tesla = new electric_Car();
        bike yamahaBike = new bike();
         tesla.run();
         tesla.speed();
         tesla.charg();
         
         System.out.println("________________________________________________\n");

         yamahaBike.run();
         yamahaBike.wheeling();
    }
}
