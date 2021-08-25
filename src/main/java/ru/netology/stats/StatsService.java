package ru.netology.stats;

public class StatsService {
    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumSalesMonth(int[] sales) {
        int sum = sumOfAllSales(sales);
        int averageAmount = 0;
        averageAmount = sum / sales.length;

        return averageAmount;
    }

    public int monthOfMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthOfMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSalesMonths(int[] sales) {
        int averageAmount = averageSumSalesMonth(sales);
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale < averageAmount) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int aboveAverageSalesMonths(int[] sales) {
        int averageAmount = averageSumSalesMonth(sales);
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale > averageAmount) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}

