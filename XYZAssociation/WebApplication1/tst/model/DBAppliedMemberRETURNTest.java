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
public class DBAppliedMemberRETURNTest {
    
    public DBAppliedMemberRETURNTest() {
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
     * Test of getMember method, of class DBAppliedMemberRETURN.
     */
    @Test
    public void testGetAllAppliedMember() {
        System.out.println("getMember");
        DBAppliedMemberRETURN instance = new DBAppliedMemberRETURN();
        
        int expResult = 1;
        ArrayList<Member> temp_list = instance.getMember();
        int result = temp_list.size();
        
        assertEquals(expResult, result);
    }
    
}
