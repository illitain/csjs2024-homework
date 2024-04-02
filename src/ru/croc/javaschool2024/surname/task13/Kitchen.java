package ru.croc.javaschool2024.surname.task13;

import ru.croc.javaschool2024.surname.task13.dish.Dish;
import ru.croc.javaschool2024.surname.task13.kitchener.Kitchener;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class Kitchen {
    private final Map<Kitchener, Set<Dish>> kitchenerDishesMap;

    public Kitchen(Map<Kitchener, Set<Dish>> kitchenerDishesMap) {
        this.kitchenerDishesMap = kitchenerDishesMap;
    }

    //TODO остальная логика класса


    /**
     * Метод генерации меню.
     *
     * @param workingKitcheners      Список сотрудников, работающих в нужный день
     * @param unavailableIngredients Недоступные (по причине отсутствия их на кухне) ингредиенты
     * @param maxLength              Максимально допустимая длина генерируемого меню
     * @return Перечень блюд, которые возможно приготовить, отсортированный по оценкам, не длиннее maxLength
     */
    public Collection<Dish> generateMenu(
        Collection<Kitchener> workingKitcheners,
        Collection<String> unavailableIngredients,
        int maxLength
    ) {
        //TODO генерация меню
        return Collections.emptyList();
    }

    /**
     * Метод генерации меню с учётом дополнительный требований.
     *
     * @param workingKitcheners      Список сотрудников, работающих в нужный день
     * @param unavailableIngredients Недоступные (по причине отсутствия их на кухне) ингредиенты
     * @param additionalConditions   Дополнительные требования
     * @param maxLength              Максимально допустимая длина генерируемого меню
     * @return Перечень блюд, которые возможно приготовить, отсортированный по оценкам, не длиннее maxLength
     */
    public Collection<Dish> generateMenu(
        Collection<Kitchener> workingKitcheners,
        Collection<String> unavailableIngredients,
        Predicate<Dish> additionalConditions,
        int maxLength
    ) {
        //TODO генерация меню
        return Collections.emptyList();
    }
}
