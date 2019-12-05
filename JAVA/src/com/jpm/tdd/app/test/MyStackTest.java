package com.jpm.tdd.app.test;

import com.jpm.tdd.app.MyStack;
import com.jpm.tdd.app.exception.EmptyMyStackException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyStackTest {
    private MyStack<String> stack;

    @Before
    public void setUp(){
        stack= new MyStack<>();
    }

    @Test
    public void testPushOperationThatChangesTheSizeOfStackByOne(){
        stack.push("One");
        assertEquals(1,stack.size());

    }

    @Test
    public void testPopOperationThatChangesSizeOfStackByOneAndRemovesTopMostElement() throws EmptyMyStackException {
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        String topMostElement=stack.pop();
        assertEquals("Three",topMostElement);
        assertEquals(2,stack.size());
    }

    @Test(expected = EmptyMyStackException.class)
    public void testPopOperationOnEmptyStackThrowsException() throws EmptyMyStackException {
        stack.pop();
    }

    @Test
    public void testPeekOperationThatReturnsTopMostElementWithoutRemovingIt() throws EmptyMyStackException {
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        assertEquals("Three",stack.peek());
        assertEquals(3,stack.size());
    }

    @Test(expected = EmptyMyStackException.class)
    public void testPeekOperationOnEmptyStackThrowsException() throws EmptyMyStackException {
        stack.peek();
    }


    @After
    public void tearDown(){
        stack=null;
    }

}
