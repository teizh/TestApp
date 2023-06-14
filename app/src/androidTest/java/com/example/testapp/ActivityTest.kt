package com.example.testapp

import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.typeText("24"))
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.typeText("6"))
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_calculate)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.result_tv))
            .check(ViewAssertions.matches(ViewMatchers.withText("30")))
    }

    @Test
    fun divide() {
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.typeText("20"))
        Espresso.onView(withId(R.id.firstNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.secondNumber)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.btn_divide)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.result_tv))
            .check(ViewAssertions.matches(ViewMatchers.withText("4")))
    }
}