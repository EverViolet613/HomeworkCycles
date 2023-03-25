package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class FreelancerTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/freelance.csv")

    public void testTheCounter(int expected, int income, int expenses, int threshold) {
        Freelancer service = new Freelancer();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
