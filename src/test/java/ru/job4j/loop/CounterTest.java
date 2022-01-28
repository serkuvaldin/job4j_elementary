package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOThirteenToNineteenThenFortyEight() {
        int start = 13;
        int finish = 19;
        int result = Counter.sumByEven(start, finish);
        int expected = 48;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToOneThenZero() {
        int start = 0;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}