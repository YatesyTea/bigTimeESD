/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
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
public class DBConnectorBeanTest {
    
    public DBConnectorBeanTest() {
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
     * Test of openConnection method, of class DBConnectorBean.
     */
    @Test
    public void testOpenConnection() throws Exception {
        System.out.println("openConnection");
        DBConnectorBean instance = new DBConnectorBean();
        Connection expResult = null;
        Connection result = instance.openConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class DBConnectorBean.
     */
    @Test
    public void testCloseConnection() throws Exception {
        System.out.println("closeConnection");
        Connection con = null;
        DBConnectorBean instance = new DBConnectorBean();
        instance.closeConnection(con);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
