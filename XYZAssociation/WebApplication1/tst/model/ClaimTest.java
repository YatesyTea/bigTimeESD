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
public class ClaimTest {
    private Claim claim;
    
    public ClaimTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("=== Set Up Class");
    }
    
    @Before
    public void setUp() {
        System.out.println("=== Set Up");
        claim = new Claim(12, "me_aydin", "2016-04-16", "change wheels", "PENDING", 200.00);
    }
    
    @After
    public void tearDown() {
        System.out.println("== Tear Down");
        claim = null;
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Tear Down Class");
    }

    /**
     * Test of getId method, of class Claim.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        int expResult = 12;
        Claim instance = claim;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Claim.
     */
    @Test
    public void testSetId() {
        // Print test name, then initialise instance.
        System.out.println("setId");
        Claim instance = claim;
        int id = 999;
        // Set instance Id to value of id.
        instance.setId(id);
        int expResult = id;
        // Check that value has actually changed.
        int result = instance.getId();
        
        // Final Assert statement
        assertEquals(expResult,result); 
    }

    /**
     * Test of getMem_id method, of class Claim.
     */
    @Test
    public void testGetMem_id() {
        System.out.println("getMem_id");
        Claim instance = claim;

        String expResult = "me_aydin";
        String result = instance.getMem_id();

        assertEquals(expResult, result);
    }

    /**
     * Test of setMem_id method, of class Claim.
     */
    @Test
    public void testSetMem_id() {
        System.out.println("setMem_id");
        Claim instance = claim;
        
        String mem_id = "foo";
        instance.setMem_id(mem_id);
        
        String expResult = "foo";
        String result = instance.getMem_id();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getDate method, of class Claim.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Claim instance = claim;
        
        String expResult = "2016-04-16";
        String result = instance.getDate();
        
        assertEquals(expResult, result);
    }
    

    /**
     * Test of setDate method, of class Claim.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Claim instance = claim;
        
        String date = "2018-09-23";
        instance.setDate(date);
        
        String expResult = date;
        String result = instance.getDate();
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setDate method, of class Claim.
     * Adds in an invalid date, shouldn't go through
     *  Should show the date when initialised not new one.
     */
    @Test
    public void testSetBadDate() {
        System.out.println("setDate");
        Claim instance = claim;
        
        String date = "GRILLED CHEESE";
        instance.setDate(date);
        
        String expResult = date;
        String result = instance.getDate();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getRationale method, of class Claim.
     */
    @Test
    public void testGetRationale() {
        
        System.out.println("getRationale");
        Claim instance = claim;
        
        String expResult = "change wheels";
        String result = instance.getRationale();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setRationale method, of class Claim.
     */
    @Test
    public void testSetRationale() {

        System.out.println("setRationale");
        Claim instance = claim;
        
        String rationale = "Dinked it";
        instance.setRationale(rationale);
        
        String expResult = rationale;
        String result = instance.getRationale();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Claim.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Claim instance = claim;
        
        String expResult = "PENDING";
        String result = instance.getStatus();
       
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Claim.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Claim instance = claim;
        
        String status = "APPROVED";
        instance.setStatus(status);
        
        String expResult = status;
        String result = instance.getStatus();
          
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Claim.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Claim instance = claim;
        
        double expResult = 200.00;
        double result = instance.getAmount();
        
        // Acts weird because we're comparing doubles.
        assertEquals(expResult, result, 200.00);
    }

    /**
     * Test of setAmount method, of class Claim.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        Claim instance = claim;
        
        double amount = 100.00;
        instance.setAmount(amount);
        
        double result = instance.getAmount();
        double expResult = amount;
        
        assertEquals(expResult,result, 100.00);

    }

    /**
     * Test of display method, of class Claim.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Claim instance = claim;
        
        String expResult = "id: 12rationale: change wheels";
        String result = instance.display();
        
        assertEquals(expResult, result);
    }
    
}
