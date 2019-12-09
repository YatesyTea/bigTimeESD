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
public class DBAllMemberRETURNTest {
    
    public DBAllMemberRETURNTest() {
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
     * Test of getMember method, of class DBAllMemberRETURN.
     */
    @Test
    public void testGetMember() {
        System.out.println("get All Members");
        DBAllMemberRETURN instance = new DBAllMemberRETURN();
        
        int expResultSize = 10;
        ArrayList<Member> temp = instance.getMember();
        int resultSize = temp.size();
        
        assertEquals(expResultSize, resultSize);
    }
    
}
