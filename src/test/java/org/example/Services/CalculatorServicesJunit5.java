package org.example.Services;

import org.junit.jupiter.api.*;

public class CalculatorServicesJunit5 {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll");
    }

    @Test
    public void addTest(){
        int res = CalculatorService.add(12,12);
        int exp = 24;
        Assertions.assertEquals(exp,res);
    }

    @Test
    public void subTest(){
        int res = CalculatorService.sub(12,12);
        int exp = 0;
        Assertions.assertEquals(exp,res);
    }
}
