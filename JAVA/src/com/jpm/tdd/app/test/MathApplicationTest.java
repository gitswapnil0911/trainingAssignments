package com.jpm.tdd.app.test;

import com.jpm.tdd.app.Calculator;
import com.jpm.tdd.app.MathApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
    @Mock
    private Calculator calculator;

    @InjectMocks
    private MathApplication app= new MathApplication(calculator);

    @Test
    public void testPerformAdditionOperationWithTwoPositiveNumbers(){
        when(calculator.addition(23,20)).thenReturn(43);
        assertEquals(43,app.performAddition(23,20));
        verify(calculator,times(1)).addition(23,20);
    }

    @Test(expected = ArithmeticException.class)
    public void testPerformDivisionOperationWithZeroDiviserThrowsException(){
        doThrow(new ArithmeticException("/ by Zero")).when(calculator).division(20,0);
        app.performDivision(20,0);
    }
}
