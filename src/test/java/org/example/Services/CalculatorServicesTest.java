//package org.example.Services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServicesTest {
//
//    int counter = 0;
//
//    @BeforeClass  //Before All Test Cases
//    public static void initialize(){
//        System.out.println("Ran Before all the Test Cases");
//        System.out.println("Test Started at - " + new Date());
//    }
//
//    @Before
//    public void First(){
//        counter=counter+1;
//        System.out.println("This is before Test Case ");
//    }
//
//    @After
//    public void Last(){
//        System.out.println("This is after Test Case ");
//    }
//
//    @Test
//    public void addTest(){
//        System.out.println("Counter = " + counter);
//        System.out.println("This is Add Test Case");
//        int res = CalculatorService.add(12,45);
//        int exp = 57;
//        Assert.assertEquals(exp,res);
//    }
//
//    @Test
//    public void subTest(){
//        System.out.println("Counter = " + counter);
//        System.out.println("This is Subtract Test Case");
//        int res = CalculatorService.sub(12,45);
//        int exp = -33;
//        Assert.assertEquals(exp,res);
//    }
//
//    @Test
//    public void mulTest(){
//        System.out.println("Counter = " + counter);
//        System.out.println("This is Multiply Test Case");
//        int res = CalculatorService.mul(12,45);
//        int exp = 12*45;
//        Assert.assertEquals(exp,res);
//    }
//
//    @Test
//    public void divTest(){
//        System.out.println("Counter = " + counter);
//        System.out.println("This is Divide Test Case");
//        int res = CalculatorService.div(12,45);
//        int exp = 12/45;
//        Assert.assertEquals(exp,res);
//    }
//
//    @Test
//    public void sumTest(){
//        int  res = CalculatorService.sum(30,40,20,10);
//        int exp = 100;
//        Assert.assertEquals(exp,res);
//    }
//
//    @AfterClass //After all test cases
//    public static void destroy(){
//        System.out.println("After All Test Cases");
//        System.out.println("Test cases Finished at - " + new Date());
//    }
//}
