package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void getFindSumm() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumm = 180;
        int actualSumm = service.sumSales(sales);

        Assertions.assertEquals(expectedSumm, actualSumm);
    }

    @Test
    public void getAverSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverSales = 15;
        int actualAverSales = service.averSales(sales);

        Assertions.assertEquals(expectedAverSales, actualAverSales);
    }

    @Test
    public void getMounthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMounthMaxSales = 7;
        int actualMounthMaxSales = service.numMounthMaxSales(sales);

        Assertions.assertEquals(expectedMounthMaxSales, actualMounthMaxSales);
    }

    @Test
    public void getMounthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMounthMinSales = 8;
        int actualMounthMinSales = service.numMounthMinSales(sales);

        Assertions.assertEquals(expectedMounthMinSales, actualMounthMinSales);
    }

    @Test
    public void getCountMounthLessAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMounthLessAver = 5;
        int actualCountMounthLessAver = service.countMounthLessAver(sales);

        Assertions.assertEquals(expectedCountMounthLessAver, actualCountMounthLessAver);
    }

    @Test
    public void getCountMounthMoarAver() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 16, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCountMounthMoarAver = 6;
        int actualCountMounthMoarAver = service.countMounthMoarAver(sales);

        Assertions.assertEquals(expectedCountMounthMoarAver, actualCountMounthMoarAver);
    }
}
