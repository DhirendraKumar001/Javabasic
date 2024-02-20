public class Overriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        
    }
    
}
class Animal{
    
    
    void eat(){
        System.out.println("Animal eats Everything");
    }
}
class Deer{

    void eat(){
        System.out.println("Eats Grass");
    }

}