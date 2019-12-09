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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Yates
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({model.UserTest.class, model.DBAuthenticatorBeanTest.class, model.PaymentTest.class, model.ClaimTest.class, model.DBClaimRETURNTest.class, model.DBRegisterBeanTest.class, model.RegisterBeanTest.class, model.MemberTest.class, model.DBConnectorBeanTest.class, model.DBMemberRETURNTest.class, model.DBClaimINSERTTest.class})
public class ModelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
