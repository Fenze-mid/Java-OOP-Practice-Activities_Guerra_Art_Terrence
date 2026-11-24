/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campuswallettransfer;

/**
 *
 * @author GUERRA_CPE113
 */
public class CampusWalletTransfer {

   private final String owner;
    private int balance;

    // Two-argument constructor: negative starting balance becomes 0
    public CampusWalletTransfer(String owner, int balance) {
        this.owner = owner;
        this.balance = (balance >= 0) ? balance : 0;
    }

    // One-argument constructor: chains to the two-argument constructor with balance 0
    public CampusWalletTransfer(String owner) {
        this(owner, 0);
    }

    // Adds credits only if amount is positive (> 0)
    public boolean deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    // Transfers credits if recipient is non-null, not self, amount > 0, and balance is sufficient
    public boolean transferTo(CampusWalletTransfer recipient, int amount) {
        if (recipient == null || recipient == this || amount <= 0 || amount > this.balance) {
            return false;
        }
        this.balance -= amount;
        recipient.balance += amount;
        return true;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}