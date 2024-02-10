public class ShallowCopy {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Lion";
        a1.color = "yellow";
        a1.weight = 80;
        System.out.println(a1.name);

        Animal a2 = new Animal(a1); // Pass a1 to the constructor
        System.out.println(a2.weight);
    }
}

class Animal {
    String name;
    String color;
    int weight;

    Animal(){//default constructor

    }
    Animal(Animal a1) { // Shallow Copy Constructor
        this.name = a1.name;
        this.color = a1.color;
        this.weight = a1.weight;
    }
}