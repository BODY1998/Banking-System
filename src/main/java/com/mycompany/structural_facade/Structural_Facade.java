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
        Account myAccount = myBankService.createNewAccount("Chequing", 1000000, 0);
        System.out.println(myAccount.getAccountAmount());
        Account hisAccount = myBankService.createNewAccount("Saving", 30000, 1);
        System.out.println(hisAccount.getAccountNumber());
        myAccount.transfer(hisAccount, 20000);
        System.out.println(hisAccount.getAccountAmount());
        

    }

}
