package ra.thuchanh2;

public class AccountExampleTest {
    public static AccountExample accountExample ;

    public static final String[] validAccount = new String[] {"123abc_", "_abc123", "_____", "123456"} ;
    public static final String[] invaliAccount = new String[] {".@", "12345", "1234", "abcdef"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isvalid);
        }

        for (String account : invaliAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid " + isvalid);
        }
    }
}
