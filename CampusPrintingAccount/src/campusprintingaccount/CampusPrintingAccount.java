/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campusprintingaccount;

/**
 *
 * @author GUERRA_CPE113
 */
public class CampusPrintingAccount {
    private final String studentName;
    private int credits;
    public CampusPrintingAccount(String studentName, int initialCredits) {
        this.studentName = studentName;
        if (initialCredits > 0) {
            this.credits = initialCredits;
        } else {
            this.credits = 0; 
        }
        
    }public boolean printPages(int pages) {
        if (pages > 0 && pages <= this.credits) {
            this.credits -= pages;
            return true;
            
        }return false;
        
    }public boolean addCredits(int amount) {
        if (amount > 0) {
            this.credits += amount;
            return true;
            
        }return false;
        
    }public String getStudentName() {
        return studentName;
    }public int getCredits() {
        return credits;
     
   }
}