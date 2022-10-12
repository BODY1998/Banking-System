/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.structural_facade;

/**
 *
 * @author ayman
 */
public interface Account {

    public void deposit(int amount);

    public void withdraw(int amount);

    public void transfer(Account account, int amount);

    public int getAccountNumber();
    
    public int getAccountAmount();

}
