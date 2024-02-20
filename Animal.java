public class Animal {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang m = new Mustang();
        
        
    }
    
}
abstract class Animals{
    String color;
    Animals(){
        System.out.println("Animals Constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();

}
class Horse extends Animals{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void walk(){
        System.out.println("Walks on four legs");
    }

}

class Chicken extends Animals {
    void walk(){
        System.out.println("Walks on two legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }

}