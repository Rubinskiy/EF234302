package quiz1;

import quiz1.Q13ComputerAccount;

public class Q13ComputerAccountTest {
	public static void main(String[] args) {
        // Creating a computer account using the class Q13ComputerAccount
        Q13ComputerAccount computerAccount = new Q13ComputerAccount("Bob", "bobbybills", "qwerty123");

        // Print real name, user name, and password
        computerAccount.printRealName();
        computerAccount.printUserName();
        computerAccount.printPassword();

        // Change the password
        computerAccount.changePassword("newpassword123");

        // Print the updated password
        computerAccount.printPassword();
    }
}
