package ru.netology;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void RemainTest (){
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void RemainWithCashbackTest (){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}
