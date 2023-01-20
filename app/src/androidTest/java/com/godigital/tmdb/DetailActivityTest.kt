package com.godigital.tmdb

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.godigital.tmdb.ui.main.MainActivity
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain


@HiltAndroidTest
class DetailActivityTest {

    private val hiltRule = HiltAndroidRule(this)
    private val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @get:Rule
    val rule: RuleChain = RuleChain
        .outerRule(hiltRule)
        .around(activityTestRule)

    @Test
    fun isAppBarLayout() {
        onView(withId(R.id.appBarLayout)).check(matches(isDisplayed()))
    }

    @Test
    fun isIvBackdropPath() {
        onView(withId(R.id.ivBackdropPath)).check(matches(isDisplayed()))
    }

    @Test
    fun isFloatingActionButton() {
        onView(withId(R.id.floatingActionButton)).check(matches(isDisplayed()))
    }

    @Test
    fun isTvOverview() {
        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
    }


}
