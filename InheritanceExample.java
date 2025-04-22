// SINGLE INHERITANCE (A -> B)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}



// HIERARCHICAL INHERITANCE (B -> D, B -> E)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
// MULTILEVEL INHERITANCE (A -> B -> C)

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal can walk.");
    }
}

class Cat extends Mammal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// MULTIPLE INHERITANCE (Using Interface)
interface Aquatic {
    void swim();
}

// Dolphin inherits from Mammal and implements Aquatic interface
class Dolphin extends Mammal implements Aquatic {
    public void swim() {
        System.out.println("The dolphin swims in water.");
    }
}

// MAIN CLASS
public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("** Single & Multilevel Inheritance **");
        Mammal mammal = new Mammal();
        mammal.eat(); // From Animal
        mammal.walk(); // From Mammal

        System.out.println("\n** Hierarchical Inheritance **");
        Dog dog = new Dog();
        dog.eat(); // From Animal
        dog.walk(); // From Mammal
        dog.bark(); // From Dog

        Cat cat = new Cat();
        cat.eat(); // From Animal
        cat.walk(); // From Mammal
        cat.meow(); // From Cat

        System.out.println("\n** Multiple Inheritance using Interface **");
        Dolphin dolphin = new Dolphin();
        dolphin.eat(); // From Animal
        dolphin.walk(); // From Mammal
        dolphin.swim(); // From Aquatic
    }
}
