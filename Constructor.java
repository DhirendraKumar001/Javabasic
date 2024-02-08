public class Constructor {// Constructors Function.
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Mango");
        System.out.println(f1.name);

        
    }
}
class Fruit{
    String name;
    String color;
    int quantity;

    Fruit(Fruit f1){
        this.name = f1.name;
        this.color = f1.color;

    }
    Fruit (String name){// parameterized constructor.
          this.name = name;
        
    }

    Fruit() {   // Non-parameterized constructor.
        System.out.println("Yellow");

    }
}