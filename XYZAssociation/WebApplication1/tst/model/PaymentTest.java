/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yates
 */
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of getId method, of class Payment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Payment instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Payment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Payment instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMem_id method, of class Payment.
     */
    @Test
    public void testGetMem_id() {
        System.out.println("getMem_id");
        Payment instance = null;
        String expResult = "";
        String result = instance.getMem_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMem_id method, of class Payment.
     */
    @Test
    public void testSetMem_id() {
        System.out.println("setMem_id");
        String mem_id = "";
        Payment instance = null;
        instance.setMem_id(mem_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType_of_payment method, of class Payment.
     */
    @Test
    public void testGetType_of_payment() {
        System.out.println("getType_of_payment");
        Payment instance = null;
        String expResult = "";
        String result = instance.getType_of_payment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType_of_payment method, of class Payment.
     */
    @Test
    public void testSetType_of_payment() {
        System.out.println("setType_of_payment");
        String type_of_payment = "";
        Payment instance = null;
        instance.setType_of_payment(type_of_payment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Payment.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Payment instance = null;
        int expResult = 0;
        int result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Payment.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        int amount = 0;
        Payment instance = null;
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Payment.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Payment instance = null;
        String expResult = "";
        String result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Payment.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        String date = "";
        Payment instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
