package com.kodewithharish.testingexample;

import org.junit.Test;

import static org.junit.Assert.*;

import com.kodewithharish.testingexample.ui.Constants;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {


        assertEquals(3, 1+ 2);

    }

    @Test
    public void email_validatortet()
    {

        assertTrue(Constants.email_Validator("hello@gmail.com"));
    }

    @Test
    public void password_Validation()
    {
        assertTrue(Constants.isValidPassword("helloll"));
    }

    @Test
    public void additiontest()
    {

        assertEquals(5,Constants.add(2,3));
    }
}