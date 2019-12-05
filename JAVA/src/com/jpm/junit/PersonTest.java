package com.jpm.junit;

import org.junit.*;

import static junit.framework.TestCase.assertTrue;

public class PersonTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before running all tests");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After running all tests");
    }

    @Before
    public void setup(){
        System.out.println("Before Running test");
    }

    @After
    public void teardown(){
        System.out.println("After Running test");
    }

    @Test
    public void testFullName(){
        Person p1= new Person("Swapnil","Sawant");
        System.out.println("In test full name");
        Assert.assertEquals("Full name not ok","Swapnil Sawant",p1.getFullName());
        assertTrue(p1 instanceof Person);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullIsName(){
        //Assert.assertEquals();
        Person p1= new Person(null,null);
        System.out.println("In test is null name");
        Assert.assertNotNull(p1.getFirstName());
    }

    @Test
    public void testGetLastName(){
        Person p1= new Person("swa",null);
        System.out.println("In test last name");
        Assert.assertNotNull(p1.getLastName());
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero(){
        int c =20/0;
    }

}
