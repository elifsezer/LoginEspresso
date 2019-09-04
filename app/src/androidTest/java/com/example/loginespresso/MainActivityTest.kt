package com.example.loginespresso

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.action.ViewActions.clearText
import android.support.test.espresso.action.ViewActions.click
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import  android.support.test.espresso.matcher.ViewMatchers.withId;
import com.shashank.sony.fancytoastlib.FancyToast


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    private var username = "admin"
    private var password = "1234"

    private var fakeusername = "safdf"
    private var fakepassword = "sdfsdf"

    @Rule
    @JvmField
    var activityRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun clickLoginButton_Successful() {
        onView(withId(R.id.edtUserName)).perform(ViewActions.typeText(username))
        onView(withId(R.id.edtPassword)).perform(ViewActions.typeText(password))
        onView(withId(R.id.btn_submit)).perform(ViewActions.pressBack(), click())
    }
    @Test
    fun clickLoginButton_Unsuccesful() {
        onView(withId(R.id.edtUserName)).perform(ViewActions.typeText(fakeusername))
        onView(withId(R.id.edtPassword)).perform(ViewActions.typeText(fakepassword))
        onView(withId(R.id.btn_submit)).perform(ViewActions.pressBack(), click())
    }

    @Test
    fun clickLoginButton_Empty() {
        onView(withId(R.id.btn_submit)).perform(click())
    }


}

