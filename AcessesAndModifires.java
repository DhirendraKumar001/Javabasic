public class AcessesAndModifires {
    public static void main(String[] args) {
        Bank user = new Bank();
        
        user.setusername("Ankit");
        System.out.println(user.username);

        user.setpassword(12345);
        System.out.println(user.getpassword());
        
    }
}
class Bank{
    public String username;
    private int password;

    int getpassword(){
        return this.password;
    }
    void setpassword(int newPassword){
        password = newPassword;
    }
    void setusername(String newUsername){
        username = newUsername;
    }

}
