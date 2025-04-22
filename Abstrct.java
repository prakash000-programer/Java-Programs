abstract class Bank {
    abstract void withdraw(); // abstract method
    abstract void deposite();
    void display() { // concrete method
        System.out.println("This is a bank");
    }
}
abstract class Demo{
    abstract void menu();
}

class SBI extends Bank {
    void withdraw() {
        System.out.println("hi");
    }
    void deposite(){
        System.out.println("hello");

    }

    /*void display() {
        System.out.println("bye");
    }*/
}


public class Abstrct {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.withdraw();
        obj.display();
    }
}