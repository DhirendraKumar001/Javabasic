public class Overloading {
    
    
}
class Sum{
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
       
        System.out.println(sum(30,40));
        System.out.println(sum(40.3f, 59.7f));
        System.out.println(sum(4, 5, 7 ));
    }
}
