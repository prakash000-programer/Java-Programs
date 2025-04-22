class A{
   int a = 3; 
}
class B extends A{
    int b = 1;
    
}
class C extends B{
    int c =2;
    super.b = c;
    void show(){
        System.out.println(super.b);
    }
}
public class Multi_Level {
    public static void main(String[] args) {
        C s = new C();
        s.show();
    }
}
