public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String password) {
        this.password = password;
        System.out.println("Doi mat khau thanh cong");
    }

    public void displayInfo() {
        System.out.println("Username: "+this.username);
        System.out.println("Password: "+this.password);
        System.out.println("Email: "+this.email);
        System.out.println();
    }

    public static void main(String[] args) {
        Account acc=new Account("tuanto1806", "tuan123", "tat@gmail.com");
        // thog tin ban dau
        acc.displayInfo();
        // doi matkhau
        acc.changePassword("tuan1806");

        acc.displayInfo();
    }
}
