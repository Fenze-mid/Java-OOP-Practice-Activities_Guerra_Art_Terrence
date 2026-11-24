/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campuswallettransfer;

/**
 *
 * @author GUERRA_CPE113
 */
public class CampusWalletTransferMain {
  public static void main(String[] args) {
        
        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");
        showBalances(aly, ben);

        
        System.out.println("Aly transfers 35 credits to Ben: " + aly.transferTo(ben, 35));
        showBalances(aly, ben);

       
        System.out.println("Aly tries to transfer 70 credits to Ben: " + aly.transferTo(ben, 70));
        showBalances(aly, ben);

     
        System.out.println("Aly tries to transfer 10 credits to her own wallet: " + aly.transferTo(aly, 10));
        showBalances(aly, ben);

       
        System.out.println("Ben deposits 15 credits: " + ben.deposit(15));
        showBalances(aly, ben);

       
        System.out.println("Aly transfers all 65 remaining credits to Ben: " + aly.transferTo(ben, 65));
        showBalances(aly, ben);
    }

    private static void showBalances(CampusWallet first, CampusWallet second) {
        System.out.println(first.getOwner() + ": " + first.getBalance()
                + ", " + second.getOwner() + ": " + second.getBalance());
    }
}
