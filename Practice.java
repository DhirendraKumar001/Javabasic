public class Practice {
    public static void main(String[] args) {
        Bank b1 = new Bank();

        b1.setuserName("Rahul");
        System.out.println(b1.getuserName());

        b1.setAccount(399338723);
        System.out.println(b1.getAccount());

    }
}

class Bank {
    String userName;
    int Account;

    String getuserName() {
        return this.userName;
    }

    void setuserName(String newuserName) {
        userName = newuserName;
    }

    int getAccount() {
        return this.Account;
    }

    void setAccount(int newAccount) {
        Account = newAccount;
    }
}
