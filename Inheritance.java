public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat ();
        dog.breathe();
        dog.color ="Brown";
        dog.legs = 4;
        dog.breed = "Pitbull";
        System.out.println(dog.breed);

    }
}
class Animal{
    String color;
    
    
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}
class Mammals extends Animal{
    int legs;

}
class Dog extends Mammals{
    String breed;
}