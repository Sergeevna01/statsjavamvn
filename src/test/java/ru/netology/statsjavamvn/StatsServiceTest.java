package ru.netology.statsjavamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
   public void monthMinimumSales(){
     StatsService service = new StatsService();

     long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
     int expected = 9;
     int actual = service.minSales(sales);

     Assertions.assertEquals(expected, actual);
 }
 @Test
    public void monthMaximumSales(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }
 @Test
    public  void amountSalas(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.amountSales(sales);

        Assertions.assertEquals(expected,actual);

 }
 @Test
    public void averageAmountSales(){
     StatsService service = new StatsService();

     long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
     int expected = 15;
     long actual = service.averageAmountSales(sales);

     Assertions.assertEquals(expected,actual);
 }
 @Test
    public void salesBelowAverage(){
     StatsService service = new StatsService();

     long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
     int expected = 5;
     long actual = service.salesBelowAverage(sales);

     Assertions.assertEquals(expected,actual);
 }
    @Test
    public void salesHigherAverage(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.salesHigherAverage(sales);

        Assertions.assertEquals(expected,actual);
    }
}

