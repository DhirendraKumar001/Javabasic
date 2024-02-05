  public class Oops{// here opps is class
    public static void main(String[] args) {
      Animal lion = new Animal();
      lion.setColor("Roar");
      System.out.println("Lion sounds:\n"+lion.color);//

      lion.setSound("Yellow");
      System.out.println("\nLion colour:\n" +lion.sound);

      Animal elephant = new Animal();
      elephant.setColor("Gray");
      System.out.println("\nElephant color:\n"+elephant.color);

      elephant.setSound("trumpet");
      System.out.println("\nElephant sounds\n"+elephant.sound);
    }
    
  }

  class Animal {// Here 'Animal' is a class.
    String color;
    String sound;

    void setColor(String newColor){
      color = newColor;
    }
    void setSound(String newSound){
      sound = newSound;

    }
}
  