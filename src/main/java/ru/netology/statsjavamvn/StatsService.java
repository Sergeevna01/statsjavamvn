package ru.netology.statsjavamvn;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public long amountSales(long[] sales){
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount;
    }
    public long averageAmountSales(long[] sales){
        long amount = amountSales(sales);
        long quantity = sales.length;
        return amount / quantity;
    }

    public long salesBelowAverage (long[] sales){
        long average = averageAmountSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < average){
                month = month +1;
            }
        }
        return month;
    }
    public long salesHigherAverage (long[] sales){
        long average = averageAmountSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > average){
                month = month +1;
            }
        }
        return month;
    }
}
