package quiz1;

public class Q13ComputerAccount {
    private String realName;
    private String userName;
    private String password;

    // Constructor to create a computer account
    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }

    // Method to print real name
    public void printRealName() {
        System.out.println("Real Name: " + realName);
    }

    // Method to print user name
    public void printUserName() {
        System.out.println("User Name: " + userName);
    }

    // Method to print password
    public void printPassword() {
        System.out.println("Password: " + password);
    }

    // Method to change the password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
}
