import com.example.user.calzone.Meal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 26/05/2017.
 */

public class MealTest {

    Meal meal;

    @Before
    public void before() {
        meal = new Meal("DeluxeBurger", 550, "Dinner");
    }

    @Test
    public void canGetMealNameTest() {
        assertEquals((String)"DeluxeBurger", meal.getMealName());
    }

    @Test
    public void canGetCaloricValueTest() {
        assertEquals((Integer)550, meal.getCaloricValue());
    }

    @Test
    public void canGetMealType() {
        assertEquals((String)"Dinner",meal.getMealType());
    }


}
