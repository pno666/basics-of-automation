package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void WhenLess() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void WhenMore() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1200);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void WhenExactly() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }
}
