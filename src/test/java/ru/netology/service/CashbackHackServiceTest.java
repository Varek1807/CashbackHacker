package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 2990;

        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}


