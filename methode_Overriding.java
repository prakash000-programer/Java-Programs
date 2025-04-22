//Different classes with the same methode name.
class animal{
    void sound(){
        System.out.println("animal makes sound");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("mew mew...!");
    }
}
class dog extends cat{
    void sound(){
        System.out.println("bow bow...!");
    }
}

public class methode_Overriding{
    public static void main(String[] args) {
        dog obj = new dog();
        obj.sound();
    }
}