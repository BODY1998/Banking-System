/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.structural_facade;

/**
 *
 * @author ayman
 */
public class Chequing implements Account {

    private int accountNumber;
    private int chequingAmount;

    public Chequing(int chequingAmount, int accountNumber) {
        this.chequingAmount = chequingAmount;
        this.accountNumber = accountNumber;
    }

    public int getAccountAmount() {
        return this.chequingAmount;
    }

    public void deposit(int amount) {
        System.out.println("The amount : " + amount + " has been deposited successfully");
        this.chequingAmount = amount + chequingAmount;
    }

    public void withdraw(int amount) {
        System.out.println("The amount : " + amount + " has been withdrawn successfully");

    }

    public void transfer(Account account, int amount) {
        System.out.println("The amount : " + amount + " has been transfered successfully");
        account.deposit(amount);
        
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
