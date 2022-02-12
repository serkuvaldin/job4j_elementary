package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when72To1minus1Then6dot7() {
        Point a = new Point(7, 2);
        Point b = new Point(1, -1);
        double expected = 6.70;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2minus5ToMinus43Then10() {
        Point a = new Point(2, -5);
        Point b = new Point(-4, 3);
        double expected = 10;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To022Then2dot83() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 2);
        double expected = 2.83;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when200To240Then4() {
        Point a = new Point(2, 0, 0);
        Point b = new Point(2, 4, 0);
        double expected = 4;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}