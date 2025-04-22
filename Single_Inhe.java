class appa{
    void asset(){
        System.out.println("car");
        System.out.println("bike");

    }
}
class payyan extends appa{
    void cy(){
        System.out.println("cycle");

    }
}
public class Single_Inhe {
    public static void main(String[] args) {
        payyan me = new payyan();
        me.cy();
        me.asset();
    }
}
