package com.example.user.calzone;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/05/2017.
 */

public class mealListTest {

    @Test
    public void getListTest() {
        MealList mealList = new MealList();
        assertEquals(3, mealList.getList().size());
    }
}
