package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test

    public void remainOne() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void remain999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1_001);
        int expected = 999;
        assertEquals(actual, expected);

    }

    @org.junit.Test
    public void remainZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(10_000);
        int expected = 0;
        assertEquals(actual, expected);

    }
}