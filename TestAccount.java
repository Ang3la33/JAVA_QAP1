// QAP 1 - Problem # 1 Demo
// Author: Angela Flynn-Smith

public class TestAccount {
    
    public static void main(String[] args) {

        // Create two accounts
        Account Acc1 = new Account("c0123","Checking", 5000);
        Account Acc2 = new Account("s0202", "Savings", 4000);

        // Display balance of accounts
        System.out.println("Checking Account Balance = " + Acc1.getBalance());
        System.out.println("Savings Account Balance  = " + Acc2.getBalance());

        // Transfer 1000 from Acc1 to Acc2
        Acc1.transferTo(Acc2, 1000);

        // Display updated balances
        System.out.println(" ");
        System.out.println("Checking Account Balance = " + Acc1.getBalance());
        System.out.println("Savings Account Balance  = " + Acc2.getBalance());

    }
}
