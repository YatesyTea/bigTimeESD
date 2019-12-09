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
public class DBRegisterBeanTest {
    
    public DBRegisterBeanTest() {
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
     * Test of createAccount method, of class DBRegisterBean.
     */
    @Test
    public void testCreateAccountWithValid() throws Exception {
        System.out.println("createAccount");
        DBRegisterBean instance = new DBRegisterBean();
        
        String name = "Chicken McNugget";
        String password1 = "Password123";
        String password2 = "Password123";
        String address = "Florida";
        String dob = "2019-01-01";
 
        String expResult = "A";
        String result = instance.createAccount(name, password1, password2, address, dob);
        
        assertEquals(expResult, result);
        instance = null;
    }
    
    /**
     * Test of createAccount method, of class DBRegisterBean.
     */
    @Test
    public void testCreateAccountWithInvalid() throws Exception {
        System.out.println("createAccount");
        DBRegisterBean instance2 = new DBRegisterBean();
        
        String name = "Santa Klaus 2";
        String password1 = "Password123";
        String password2 = "Passwo";
        String address = "Florida";
        String dob = "2019-01-01";
 
        String expResult = "F";
        String result = instance2.createAccount(name, password1, password2, address, dob);
        
        assertEquals(expResult, result);
        instance2 = null;
    }
    
}
