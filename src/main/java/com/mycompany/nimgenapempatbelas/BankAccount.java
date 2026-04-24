/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nimgenapempatbelas;

/**
 *
 * @author RIYANA
 */
public class BankAccount {

    private int saldo;

    public void deposit(int jumlah) {
        saldo += jumlah;
    }

    public void withdraw(int jumlah) {
        if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak cukup");
        }
        saldo -= jumlah;
    }

    public int getSaldo() {
        return saldo;
    }
}
