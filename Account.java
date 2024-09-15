// QAP 1 - Problem # 1
// Author: Angela Flynn-Smith

public class Account {

    // Attribute(s)
    private String id;
    private String name;
    private int balance = 0;

    // Constructor(s)
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Method(s)
    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance = (this.balance + amount);
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            // Subtract amount from balance if amount is less than or equal to balance
            this.balance = this.balance - amount;
        } else {
            // Print message if amount exceeds balance
            System.out.println("Amount exceeded balance");
        }
        // Return the updated or unchanged balance
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            // Subtract amount from current account balance
            this.balance = this.balance - amount;
            // Add amount to the other account's balance via credit method
            another.credit(amount);
        } else {
            // Print message if amount exceeds balance
            System.out.println("Amount exceeded balance");
        }
        // Return the balance
        return this.balance;
    }

    public String toString() {
        return ("Account: " + this.id + "," + this.name + "," + this.balance);
    }
}
