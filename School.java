public class School {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "DPS International School";

        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        System.out.println(s3.schoolName);
        
    }
    
}
class Student{

    String name;
    int rollno;
    static String schoolName;

    String getName(){
        return this.schoolName;
    }
    void setschoolName(String schoolName){
        this.schoolName = schoolName;
    }
}