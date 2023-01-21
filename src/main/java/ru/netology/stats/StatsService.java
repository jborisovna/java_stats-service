package ru.netology.stats;

public class StatsService {

    public long salesAmount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public long averageSalesAmount(long[] sales) {
        long average = salesAmount(sales) / sales.length;
        return average;
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

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthBelowAverageSalesAmount(long[] sales) {
        int monthBelowAverageSales = 0;
        for (long sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                monthBelowAverageSales++;
            }
        }
        return monthBelowAverageSales;
    }

    public int monthAboveAverageSalesAmount(long[] sales) {
        int monthAboveAverageSales = 0;
        for (long sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                monthAboveAverageSales++;
            }
        }
        return monthAboveAverageSales;
    }
}
