package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FreelancerTest {

    @Test
    public void testCalculate1() {
        Freelancer freelancer = new Freelancer();
        int actual = freelancer.calculate(10_000, 3_000, 20_000);
        int expected = 3;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculate2() {
        Freelancer freelancer = new Freelancer();
        int actual = freelancer.calculate(100_000, 60_000, 150_000);
        int expected = 2;


        Assertions.assertEquals(expected, actual);
    }
}