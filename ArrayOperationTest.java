/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author haileywilson
 */
public class ArrayOperationTest {
    
    ArrayOperation arrayOperationInstance;
    
    @Before
    public void setUp() {
        System.out.println("*ArrayOperationTest: Before method setUp()");
        arrayOperationInstance = new ArrayOperation();
    }
    
    @After
    public void tearDown() {
        System.out.println("*ArrayOperationTest: After method tearDown()");
        arrayOperationInstance = null;
    }

    /**
     * Test of numZero method, of class ArrayOperation.
     */
    @Test
    public void testNumZero() {
        System.out.println("numZero");
        int[] x = null;
        int expResult = 0;
        int result = ArrayOperation.numZero(x);
        assertEquals(expResult, result);
        assertNull("The array should be nul", x);
    }

    /**
     * Test of findLast method, of class ArrayOperation.
     */
    @Test
    public void testFindLast() {
        System.out.println("findLast");
        int[] x = {2, 3, 5, 5};
        int y = 1;
        int expResult = -1;
        int result = ArrayOperation.findLast(x, y);
        assertEquals(expResult, result);
        assertSame(x[2], x[3]);
    }

    /**
     * Test of countPositive method, of class ArrayOperation.
     */
    @Test
    public void testCountPositive() {
        System.out.println("countPositive");
        int[] x = {-4, 2, 0, 2};
        int expResult = 2;
        int result = ArrayOperation.countPositive(x);
        assertEquals(expResult, result);
        assertTrue(x[1]>x[2]);
    }

    /**
     * Test of lastZero method, of class ArrayOperation.
     */
    @Test
    public void testLastZero() {
        System.out.println("lastZero");
        int[] x = {0, 1, 0};
        int expResult = 2;
        int result = ArrayOperation.lastZero(x);
        assertEquals(expResult, result);
        assertNotNull(x);
    }

    /**
     * Test of oddOrPos method, of class ArrayOperation.
     */
    @Test
    public void testOddOrPos() {
        System.out.println("oddOrPos");
        int[] x = {-3, -2, 0, 1, 4};
        int expResult = 3;
        int result = ArrayOperation.oddOrPos(x);
        assertEquals(expResult, result);
        assertNotNull(x);
    }
    
}
