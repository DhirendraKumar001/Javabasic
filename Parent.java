public class Parent {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.color = "yellow";
        lion.weight = 80;
        
        System.out.println(lion.color);
        System.out.println(lion.weight);

        Tiger tiger = new Tiger();
        tiger.color = "Black & yellow";
        tiger.weight = 100; 

        System.out.println(tiger.color);
        System.out.println(tiger.weight);
        
        
    }
    
}
class Animal{
    String color;
    int weight;

    void setColor(String newColor){   
        color = newColor;
    }
    void setWeight(int newWeight){ 
       weight = newWeight;
    }
}
class Lion extends Animal{

}
class Tiger extends Animal {

    
}