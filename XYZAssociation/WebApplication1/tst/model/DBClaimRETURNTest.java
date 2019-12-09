/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
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
public class DBClaimRETURNTest {
    DBClaimRETURN dbCR;
    
    public DBClaimRETURNTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dbCR = new DBClaimRETURN();
    }
    
    @After
    public void tearDown() {
        dbCR = null;
    }

    /**
     * Test of getClaims method, of class DBClaimRETURN.
     */
    @Test
    public void testValidGetClaims() {
        System.out.println("get Valid Claims");
        DBClaimRETURN instance = dbCR;   
        
        String name = "me-aydin";
        String  expResult = "change mirror";
        String result = instance.getClaims(name).get(0).getRationale();
        
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getClaims method, of class DBClaimRETURN.
     */
    @Test
    public void testInvalidGetClaims() {
        System.out.println("get Invalid Claims");
        DBClaimRETURN instance = dbCR;   
        
        String name = "totallyrealname.com";
        ArrayList<Claim> expResult = null;
        ArrayList<Claim> result = instance.getClaims(name);
        
        assertEquals(expResult, result);
    }
    
}
