package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Before
    public void before(){
        System.out.println("Początek testu");
    }
    @After
    public void after(){
        System.out.println("Koniec testu");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Start");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Stop");
    }
    @Test
    public void testCaseUserName(){

        SimpleUser simpleUser = new SimpleUser("ForumUser", "John Smith");

        String result = simpleUser.getUserName();

        Assert.assertEquals("ForumUser",result);
    }

    @Test
    public void testCaseRealName() {
        SimpleUser simpleUser = new SimpleUser("ForumUser", "John Smith");

        String result = simpleUser.getRealName();

        Assert.assertEquals("John Smith", result);
    }

}
