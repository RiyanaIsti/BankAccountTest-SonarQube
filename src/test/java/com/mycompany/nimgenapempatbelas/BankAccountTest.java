/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.nimgenapempatbelas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RIYANA
 */
public class BankAccountTest {
    
    @Test
    void testDepositBerhasil() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        assertEquals(100, acc.getSaldo());
    }

    @Test
    void testWithdrawBerhasil() {
        BankAccount acc = new BankAccount();
        acc.deposit(100);
        acc.withdraw(50);
        assertEquals(50, acc.getSaldo());
    }

    @Test
    void testWithdrawGagal() {
        BankAccount acc = new BankAccount();

        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(50);
        });
    }
}
