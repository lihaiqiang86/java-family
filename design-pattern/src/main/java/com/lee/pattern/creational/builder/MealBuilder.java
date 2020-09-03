package com.lee.pattern.creational.builder;

import com.lee.pattern.creational.builder.burger.ChickenBurger;
import com.lee.pattern.creational.builder.burger.VegBurger;
import com.lee.pattern.creational.builder.drink.Coke;
import com.lee.pattern.creational.builder.drink.Pepsi;

/**
 * @author lihaiqiang
 * @since 2020/9/2
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
