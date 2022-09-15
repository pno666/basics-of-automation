package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    @Test
    public void WhenLess() {
        CashbackHackService service = new CashbackHackService();
        int expected = 250;
        int actual = service.remain(750);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void WhenMore() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1500);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void WhenExactly() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }
}
