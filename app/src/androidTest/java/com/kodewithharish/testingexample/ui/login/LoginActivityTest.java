package com.kodewithharish.testingexample.ui.login;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static java.util.regex.Pattern.matches;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.kodewithharish.testingexample.R;
import com.kodewithharish.testingexample.ui.MainActivity;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest extends TestCase {

    public static final String STRING_TO_BE_TYPED = "Espresso";


    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Before
    public void intentsInit() {
        // initialize Espresso Intents capturing
       // Intent.
    }

    @After
    public void intentsTeardown() {
        // release Espresso Intents capturing
       // Intents.release();
    }

    @Test
    public void changeText_sameActivity() {
        // Type text and then press the button.
        onView(withId(R.id.username))
                .perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());

        onView(withId(R.id.login)).perform(click());

        // Check that the text was changed.
        //onView(withId(R.id.username_tv)).check(matches(withText(STRING_TO_BE_TYPED)));
    }
}