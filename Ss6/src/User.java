public class User {
    private String userId;
    private String userName;
    private String email;
    private String password;

    public User(String userId, String userName, String email, String password) {
        this.userId = userId;
        this.userName = userName;
        setEmail(email);
        setPassword(password);

    }

    //getter
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    //setter
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    // Regex email đơn giản
    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
    public void setEmail(String email) {
        if (email == null || !isValidEmail(email)) {
            System.out.println("Email khong hop le. Thu lai");
            return;
        }
        this.email = email;
    }

    public void setPassword(String password) {
        if (password==null || password.trim().isEmpty()) {
            System.out.println("Password khong duoc rong. Thu lai");
            return;
        }
        this.password = password;
    }

    public void displayInfo() {
        System.out.println("ID: " + userId);
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println();
    }

    public static void main(String[] args) {
        //user hợp lệ
        User u1 = new User("U01", "tuan", "tuan@gmail.com", "123456");
        u1.displayInfo();

        //user sai email
        User u2 = new User("U02", "an", "an@@gmail..com", "abc123"); // sai
        u2.displayInfo();

        //set password rong
        u1.setPassword("   "); // sai
        u1.displayInfo();

    }
}
