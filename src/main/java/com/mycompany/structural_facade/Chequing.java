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

    public void deposit(int amount) {
        this.chequingAmount = amount + chequingAmount;
        System.out.println("The amount : " + amount + " has been deposited successfully");

    }

    public void withdraw(int amount) {
        this.chequingAmount = chequingAmount - amount;
        System.out.println("The amount : " + amount + " has been withdrawn successfully");

    }

    public void transfer(Account account, int amount) {
        account.deposit(amount);
        this.chequingAmount = chequingAmount - amount;
        System.out.println("The amount : " + amount + " has been transfered successfully");

    }

    public int getAccountAmount() {
        return this.chequingAmount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}
