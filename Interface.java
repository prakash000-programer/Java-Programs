interface A {
   void demo();
    
}
class B implements A{
    void show(){
        System.out.println("Hello");
    }
   public void demo(){
        System.out.println("hi");
    }
    
}
public class Interface {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.demo();
    }
    
}
