public class DeepCopy { 
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Lion";
        a1.color = "yellow";
        a1.weight[0] = 80;
        a1.weight[1] = 90;
        a1.weight[2] = 100;

        System.out.println(a1.name);
        Animal a2 = new Animal(a1); // Pass a1 to the constructor
        a1.weight[2] = 95;
        System.out.println(a2.weight);
    }
}

class Animal {
    String name;
    String color;
    int weight[];

    Animal(){//default constructor

    }
    Animal(Animal a1) { // Deep Copy Constructor
        weight = new int[3];
        this.name = a1.name;
        this.color = a1.color;
        for(int i=0;i<weight.length;i++){
            this.weight[i] = a1.weight[i];
        }
    }
}