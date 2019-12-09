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
public class UserTest {
    private User user;
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("== Set Up Class");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("== Set Up");
        user = new User("username", "password", "ADMIN");
    }
    
    @After
    public void tearDown() {
        user = null;
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        User instance = user;
        
        String expResult = "username";
        String result = instance.getName();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        User instance = user;
        
        String name = "Jim-Smith";
        instance.setName(name);
        
        String expResult = name;
        String result = instance.getName();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getStatus method, of class User.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        User instance = user;
        
        String expResult = "ADMIN";
        String result = instance.getStatus();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of setStatus method, of class User.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        User instance = user;
        
        String status = "APPROVED";
        instance.setStatus(status);
        
        String expResult = status;
        String result = instance.getStatus();
        
        assertEquals(expResult,result);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = user;
        
        String expResult = "password";
        String result = instance.getPassword();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        User instance = user;
        
        String password = "newpass";      
        instance.setPassword(password);
        
        String expResult = password;
        String result = instance.getPassword();

        assertEquals(expResult,result);
    }
    
}
