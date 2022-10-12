/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.structural_facade;

/**
 *
 * @author ayman
 */
public class Saving implements Account {

    private int accountNumber;
    private int savingAmount;

    public Saving(int savingAmount, int accountNumber) {
        this.savingAmount = savingAmount;
        this.accountNumber = accountNumber;
    }

    public int getAccountAmount() {
        return this.savingAmount;
    }

    public void deposit(int amount) {
        System.out.println("The amount : " + amount + " has been deposited successfully");
        this.savingAmount = amount + savingAmount;

    }

    public void withdraw(int amount) {
        System.out.println("The amount : " + amount + " has been deposited successfully");

    }

    public void transfer(Account account, int amount) {
        System.out.println("The amount : " + amount + " has been deposited successfully");
        account.deposit(amount);

    }

    public int getAccountNumber() {
        return accountNumber;

    }

}
