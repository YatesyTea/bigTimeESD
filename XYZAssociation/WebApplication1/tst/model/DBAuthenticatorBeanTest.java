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
public class DBAuthenticatorBeanTest {
    private DBAuthenticatorBean dbab;
    
    public DBAuthenticatorBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dbab = new DBAuthenticatorBean();
    }
    
    @After
    public void tearDown() {
        dbab = null;
    }

    /**
     * Test of login method, of class DBAuthenticatorBean.
     */
    @Test
    public void testAdminLogin() {
        System.out.println("admin login");
        DBAuthenticatorBean instance = dbab;
        
        String name = "admin";
        String pass = "admin";
        
        String expResult = "ADMIN" ;
        String result = instance.login(name, pass).getStatus();
        
        assertEquals(expResult, result);
    }
    
      /**
     * Test of login method, of class DBAuthenticatorBean.
     */
    @Test
    public void testUserLogin() {
        System.out.println("user login");
        DBAuthenticatorBean instance = dbab;
        
        String name = "e-simons";
        String pass = "221165";
        
        String expResult = "APPROVED" ;
        String result = instance.login(name, pass).getStatus();
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test of login method, of class DBAuthenticatorBean.
     */
    @Test
    public void testFakeUserLogin(){
        System.out.println("Fake login");
        DBAuthenticatorBean instance = dbab;
        
        String name = "xDDD";
        String pass = "I'm not real";
        
        String expResult = "FAILED";
        String result = instance.login(name,pass).getStatus();
        
        assertEquals(expResult,result);
    }
    
    /**
     * Test of login method, of class DBAuthenticatorBean.
     */
    @Test
    public void testAdminLoginBadPassword() {
        System.out.println("wrong password Login");
        DBAuthenticatorBean instance = dbab;
        
        String name = "admin";
        String pass = "monkaW"; 
        
        String expResult = "FAILED";
        String result = instance.login(name, pass).getStatus();
        
        assertEquals(expResult, result);
    }
    
}
