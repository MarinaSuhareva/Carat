package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        int actual = service.remain(870);
        int expected = 130;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        int actual = service.remain(1999);
        int expected = 1;
        assertEquals(actual, expected);
    }


}