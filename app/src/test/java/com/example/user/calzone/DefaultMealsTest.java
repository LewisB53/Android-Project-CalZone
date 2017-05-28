package com.example.user.calzone;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/05/2017.
 */

public class DefaultMealsTest {

    @Test
        public void getListTest() {
        DefaultMeals defaultMeals = new DefaultMeals();
        assertEquals(3, defaultMeals.getList().size());
    }

    @Test
}


