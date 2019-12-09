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
public class MemberTest {
    private Member member;
    
    public MemberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("== Set Up");
        member = new Member("myId", "myName", "01 London Road, Littlemoore, Oxford",
                "1999-01-01", "2019-11-25", "APPROVED", 120.00);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Member.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Member instance = member;
        
        String expResult = "myId";
        String result = instance.getId();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Member.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Member instance = member;
        
        String id = "new Id";
        instance.setId(id);
        
        String expResult = id;
        String result = instance.getId();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getName method, of class Member.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Member instance = member;
        
        String expResult = "myName";
        String result = instance.getName();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Member.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Member instance = member;
        
        String name = "new Name";
        instance.setName(name);
        
        String expResult = "new Name";
        String result = instance.getName();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getAddress method, of class Member.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Member instance = member;
        
        String expResult = "01 London Road, Littlemoore, Oxford";
        String result = instance.getAddress();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Member.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        Member instance = member;
        
        String address = "10 New Road, Hackney, London";
        instance.setAddress(address);
        
        String expResult = address;
        String result = instance.getAddress();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getDob method, of class Member.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Member instance = member;
        
        String expResult = "1999-01-01";
        String result = instance.getDob();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setDob method, of class Member.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        Member instance = member;
        
        String dob = "2000-01-01";  
        instance.setDob(dob);
        
        String expResult = dob;
        String result = instance.getDob();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getDor method, of class Member.
     */
    @Test
    public void testGetDor() {
        System.out.println("getDor");
        Member instance = member;
        
        String expResult = "2019-11-25";
        String result = instance.getDor();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setDor method, of class Member.
     */
    @Test
    public void testSetDor() {
        System.out.println("setDor");
        Member instance = member;
        
        String dor = "2019-11-01";
        instance.setDor(dor);
        
        String expResult = dor;
        String result = instance.getDor();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getStatus method, of class Member.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Member instance = member;
        
        String expResult = "APPROVED";
        String result = instance.getStatus();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Member.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        Member instance = member;
        
        String status = "APPLIED";
        instance.setStatus(status);
        
        String expResult = status;
        String result = instance.getStatus();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getBalance method, of class Member.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Member instance = member;
        
        double expResult = 120.00;
        double result = instance.getBalance();
        
        assertEquals(expResult, result, 120.00);
    }

    /**
     * Test of setBalance method, of class Member.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        Member instance = member;
        
        double balance = 100.00;
        instance.setBalance(balance);
        
        double expResult = balance;
        double result = instance.getBalance();
        
        assertEquals(expResult,result, 100.00);
    }

    /**
     * Test of display method, of class Member.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        Member instance = member;
        
        String result = instance.display();
        String expResult = "id: myId name: myName address: "
                + "01 London Road, Littlemoore, Oxford dob: 1999-01-01 dor: "
                + "2019-11-25 status: APPROVED balance: 120.0";                
        
        assertEquals(expResult, result);
    }
    
}
