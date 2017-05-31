package com.example.user.calzone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by user on 27/05/2017.
 */

public class MealsAdapter extends ArrayAdapter<Meal> {
    public MealsAdapter(Context context, ArrayList<Meal> meals) {
        super(context, 0, meals);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.meal_items, parent, false);
        }

        Meal currentMeal = getItem(position);

        TextView mealname = (TextView) listItemView.findViewById(R.id.mealName);
        mealname.setText(currentMeal.getMealName());

        TextView caloricvalue = (TextView) listItemView.findViewById(R.id.caloricvalue);
        caloricvalue.setText(currentMeal.getCaloricValue().toString());

        TextView mealtype = (TextView) listItemView.findViewById(R.id.mealType);
        mealtype.setText(currentMeal.getMealType());

        TextView mealDate = (TextView) listItemView.findViewById(R.id.mealDate);
        mealDate.setText(currentMeal.getMealDate());


        listItemView.setTag(currentMeal);

        return listItemView;
    }



}
