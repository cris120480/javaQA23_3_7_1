package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long current_max = incomes[0];
        for (long income : incomes)
            if (current_max <= income)
                current_max = income;
        return current_max;
    }

    public long findMin(long[] incomes) {
        long current_min = incomes[0];
        for (long income : incomes)
            if (current_min >= income)
                current_min = income;
        return current_min;
    }

    public long findSum(long[] incomes) {
        long current_sum_index = 0;
        for (long income : incomes)
            current_sum_index += income;
        return current_sum_index;
    }

    public long findAvg(long[] incomes) {
        return findSum(incomes) / incomes.length;
    }
}

