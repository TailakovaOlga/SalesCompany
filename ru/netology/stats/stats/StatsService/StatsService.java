package ru.netology.stats.stats.StatsService;

public class StatsService {
    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

       public int getMinSales(int[] sales){
       int minMonth = getMinMonth(sales);
       return sales[minMonth];
       }
    }


