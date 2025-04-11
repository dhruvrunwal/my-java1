class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammal breathes air");
    }
}

class Dog extends Mammal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   
        d.breathe(); 
    }
}
