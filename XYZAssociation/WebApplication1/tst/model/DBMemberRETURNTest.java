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
public class DBMemberRETURNTest {
    
    public DBMemberRETURNTest() {
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
     * Test of getMember method, of class DBMemberRETURN.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        DBMemberRETURN instance = new DBMemberRETURN();
        
        String id = "e-simons";
        String expResult = "Edward Simons";
        String result = instance.getMember(id).get(0).getName();
        
        assertEquals(expResult, result);
    }
    
}
