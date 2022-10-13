/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.structural_facade;

/**
 *
 * @author ayman
 */
public class Structural_Facade {

    public static void main(String[] args) {
        BankService myBankService = new BankService();
        Account Account1 = myBankService.createNewAccount("Chequing", 1000000, 0);
        System.out.println(Account1.getAccountAmount());
        Account Account2 = myBankService.createNewAccount("Saving", 30000, 1);
        System.out.println(Account2.getAccountAmount());
        Account1.transfer(Account2, 50000);
        System.out.println(Account2.getAccountAmount());
        System.out.println(Account1.getAccountAmount());
        System.out.println(myBankService.getBankAccountNumbers());

    }

}
