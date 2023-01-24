public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Bob", "Bobbington", "01/01/2023", "135791");

        // Test deposit method
        bankAccount.deposit(1000);
        double expectedBalance = 1000;
        double actualBalance = bankAccount.getBalance();
        if (expectedBalance == actualBalance) {
            System.out.println("Test Case : deposit() : Passed");
        } else {
            System.out.println("Test Case : deposit() : Failed");
        }

        // Test withdrawal method
        bankAccount.withdrawal(500);
        expectedBalance = 500;
        actualBalance = bankAccount.getBalance();
        if (expectedBalance == actualBalance) {
            System.out.println("Test Case : withdrawal() : Passed");
        } else {
            System.out.println("Test Case : withdrawal() : Failed");
        }

        // Test payInterest method
        bankAccount.payInterest(0.03);
        expectedBalance = 515;
        actualBalance = bankAccount.getBalance();
        if (expectedBalance == actualBalance) {
            System.out.println("Test Case : payInterest() : Passed");
        } else {
            System.out.println("Test Case : payInterest");

        }

    }
    
}
