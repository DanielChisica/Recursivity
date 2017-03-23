/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivity;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EAN
 */
public class RecursivityTest {
    
    public RecursivityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Recursivity.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Recursivity.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumWithFingers method, of class Recursivity.
     */
    @Test
    public void testSumWithFingers() {
        System.out.println("sumWithFingers");
        int a = 0;
        int b = 0;
        Recursivity instance = new Recursivity();
        int expResult = 0;
        int result = instance.sumWithFingers(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restWithFingers method, of class Recursivity.
     */
    @Test
    public void testRestWithFingers() {
        System.out.println("restWithFingers");
        int a = 0;
        int b = 0;
        Recursivity instance = new Recursivity();
        int expResult = 0;
        int result = instance.restWithFingers(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplyWithFingers method, of class Recursivity.
     */
    @Test
    public void testMultiplyWithFingers() {
        System.out.println("multiplyWithFingers");
        int a = 0;
        int b = 0;
        Recursivity instance = new Recursivity();
        int expResult = 0;
        int result = instance.multiplyWithFingers(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class Recursivity.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int a = 0;
        Recursivity instance = new Recursivity();
        int expResult = 0;
        int result = instance.factorial(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Fibonacci method, of class Recursivity.
     */
    @Test
    public void testFibonacci() {
        System.out.println("Fibonacci");
        long position = 0L;
        long expResult = 0L;
        long result = Recursivity.Fibonacci(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class Recursivity.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int[] array ={6,7,8,9,10};
        int num = 7;
        Recursivity instance = new Recursivity();
        int expResult = 1;
        int result = instance.search(array, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findTheGreat method, of class Recursivity.
     */
    @Test
    public void testFindTheGreat() {
        System.out.println("findTheGreat");
        int[] array = {3,4,5,6,7};
        int min = 0;
        int max = 4;
        Recursivity instance = new Recursivity();
        int expResult = 7;
        int result = instance.findTheGreat(array, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of arraySummary method, of class Recursivity.
     */
    @Test
    public void testArraySummary() {
        System.out.println("arraySummary");
        int position = 3;
        int[] array = {4,4,4,4,5};
        Recursivity instance = new Recursivity();
        int expResult = 16;
        int result = instance.arraySummary(position, array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of arrayinverted method, of class Recursivity.
     */
    @Test
    public void testArrayinverted() {
        System.out.println("arrayinverted");
        String[] array = null;
        int min = 0;
        int max = 0;
        Recursivity instance = new Recursivity();
        instance.arrayinverted(array, min, max);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of espalindromo method, of class Recursivity.
     */
    @Test
    public void testEspalindromo() {
        System.out.println("espalindromo");
        String[] palindromo1 = null;
        int min = 0;
        int max = 0;
        Recursivity instance = new Recursivity();
        boolean expResult = false;
        boolean result = instance.espalindromo(palindromo1, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileSize method, of class Recursivity.
     */
    @Test
    public void testFileSize() {
        System.out.println("fileSize");
        File f = null;
        Recursivity instance = new Recursivity();
        long expResult = 0L;
        long result = instance.fileSize(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
