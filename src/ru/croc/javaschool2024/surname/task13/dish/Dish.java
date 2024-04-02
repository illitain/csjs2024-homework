package ru.croc.javaschool2024.surname.task13.dish;

import java.util.Collection;
import java.util.Collections;

public class Dish {

    public Dish(
        String name,
        String recipe,
        Collection<String> ingredients,
        DishCategory category,
        byte kingAssessment,
        byte courtiersAssessment
    ) {
        //TODO логика конструктора
    }

    public DishCategory getCategory() {
        //объявление геттера, т.к. он нужен в тестах
        //TODO
        return null;
    }

    public Collection<String> getIngredients() {
        //объявление геттера, т.к. он нужен в тестах
        //TODO
        return Collections.emptyList();
    }

    public String getName() {
        //объявление геттера, т.к. он нужен в тестах
        //TODO
        return null;
    }
    //TODO остальная логика класса при необходимости
}
