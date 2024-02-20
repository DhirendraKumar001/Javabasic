public class Super {
    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println(l.color);    
    }
    
}
class Animal{
    String color;
    Animal(){
        System.err.println("Animal constructor called");
    }
}
class Lion extends Animal {
    Lion(){
        super.color = "Yellow";
        System.out.println("Lion constructor called");
    }
}
