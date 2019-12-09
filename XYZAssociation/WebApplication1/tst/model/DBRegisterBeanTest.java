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
    public void testCreateAccount() throws Exception {
        System.out.println("createAccount");
        String name = "";
        String password1 = "";
        String password2 = "";
        String address = "";
        String dob = "";
        DBRegisterBean instance = new DBRegisterBean();
        String expResult = "";
        String result = instance.createAccount(name, password1, password2, address, dob);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
