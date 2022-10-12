/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.structural_facade;

import java.util.*;

/**
 *
 * @author ayman
 */
public class BankService {

    private Hashtable< Integer, Account> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<>();
    }

    public Account createNewAccount(String type, int initAmount, int AccountNum) {
        Account newAccount = null;
        switch (type) {
            case "Chequing":
                newAccount = new Chequing(initAmount, AccountNum);
                break;
            case "Saving":
                newAccount = new Saving(initAmount, AccountNum);
                break;
            default:
                System.out.println("Invalid Account Number");
                break;
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount;
        }
        return null;
    }

    public void transferMoney(int to, int from, int amount) {
        Account toAccount = this.bankAccounts.get(to);
        Account fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }
}
