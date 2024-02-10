public class Constructor{// Constructors Function.
    public static void main(String[] args) {
        Fruit f1 = new Fruit();
        f1.name = "mango";
        f1.color = "red";
        f1.quantity = 30;
        System.out.println(f1.name);
        

        Fruit f2 = new Fruit(f1);
        System.out.println(f2.quantity);


    }
}

class Fruit{
    String name;
    String color;
    int quantity;

    Fruit(Fruit f1){//copy Constructor
        this.name = f1.name;
        this.color = f1.color;
        this.quantity = f1.quantity;
    }

    Fruit (String name){// parameterized constructor.
          this.name = name;
        
    }

    Fruit() {   // Non-parameterized constructor.
        System.out.println("Yellow");

    }
}


