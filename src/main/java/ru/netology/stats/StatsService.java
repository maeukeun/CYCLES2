package ru.netology.stats;

public class StatsService {

    //1. Сумма всех продаж
    public int sumSales(int[] sales) {
        int count = 0;
        for (int curCount : sales) {
            count = count + curCount;
        }

        return count;
    }

    //2. Средняя сумма продаж в месяц
    public int averSales(int[] sales) {
        int sumCount = 0;
        int countMounth = 0;

        for (int curCount : sales) {
            sumCount = sumCount + curCount;
        }
        for (int i = 0; i < sales.length; i++) {
            countMounth++;
        }
        int averCount = sumCount / countMounth;
        return averCount;
    }

    //3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

    public int numMounthMaxSales(int[] sales) {
        int mounthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[mounthMaxSales]) {
                mounthMaxSales = i;
            }
        }
        return mounthMaxSales;
    }

    //4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму.

    public int numMounthMinSales(int[] sales) {
        int mounthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mounthMinSales]) {
                mounthMinSales = i;
            }
        }
        return mounthMinSales;
    }

    //5.Количество месяцев, в которых продажи были ниже среднего

    public int countMounthLessAver(int[] sales) {
        int sumCount = 0;
        int countMounth = 0;
        int countMounthLessAver = 0;

        for (int curCount : sales) {
            sumCount = sumCount + curCount;
        }
        for (int i = 0; i < sales.length; i++) {
            countMounth++;
        }
        int averCount = sumCount / countMounth;
        for (int curCount : sales) {
            if (curCount < averCount) {
                countMounthLessAver++;
            }
        }
        return countMounthLessAver;
    }

    //6. Количество месяцев, в которых продажи были выше среднего

    public int countMounthMoarAver(int[] sales) {
        int sumCount = 0;
        int countMounth = 0;
        int countMounthMoarAver = 0;

        for (int curCount : sales) {
            sumCount = sumCount + curCount;
        }
        for (int i = 0; i < sales.length; i++) {
            countMounth++;
        }
        int averCount = sumCount / countMounth;
        for (int curCount : sales) {
            if (curCount > averCount) {
                countMounthMoarAver++;
            }
        }
        return countMounthMoarAver;
    }
}

