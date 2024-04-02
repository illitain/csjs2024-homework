package ru.croc.javaschool2024.surname.task13.tests;

import static org.testng.AssertJUnit.assertEquals;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.beef;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.bertrand;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.bruschetta;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.charlene;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.chickenSousVide;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.cinnabon;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.claude;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.coffee;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.eugene;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.frenchToast;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.grilledSalmon;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.grilledVeggies;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.juice;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.karine;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.kitchenerDishesMap;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.lucien;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.lucienDuplicate;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.mylene;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.nicolas;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.orangeBeetroot;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.pierre;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.potatoSoup;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.remy;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.remyDuplicate;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.salmonCarpaccio;
import static ru.croc.javaschool2024.surname.task13.tests.Task13TestUtil.salmonSoup;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task13.Kitchen;
import ru.croc.javaschool2024.surname.task13.dish.Dish;
import ru.croc.javaschool2024.surname.task13.dish.DishCategory;
import ru.croc.javaschool2024.surname.task13.kitchener.Kitchener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Task13Test {

    @Test
    private void testDataValidation() {
        //тест для проверки, что входные данные валидируются в соответствии с условием

        Assert.assertThrows(() -> new Dish(
            "Булочка с корицей",
            "Приготовить тесто, испечь булочки.",
            List.of("мука", "сахар", "молоко", "яйцо", "корица"),
            DishCategory.DESSERT,
            (byte) 121,
            (byte) 85
        ));
        Assert.assertThrows(() -> new Dish(
            "Пирог с голубями",
            "Голубей выпотрошить и запечь в тесте.",
            List.of("мука", "соль", "вода", "яйцо", "голуби"),
            DishCategory.MAIN_DISH,
            (byte) -5,
            (byte) -85
        ));
    }

    @Test
    private void testKeyUniquenessInHashMap() {
        //тест для проверки, что ваша реализация Kitchener может быть корректно использована в качестве ключей Map
        Assert.assertEquals(
            kitchenerDishesMap.keySet().size(),
            10
        );
    }

    @Test
    private void testMenu() {
        Kitchen kitchen = new Kitchen(kitchenerDishesMap);

        testCase(
            kitchen,
            List.of(remy, lucien, pierre),
            List.of("апельсин", "курица", "лосось", "морковь"),
            4,
            List.of(coffee, grilledVeggies, beef, cinnabon)
        );
        testCase(
            kitchen,
            List.of(claude, karine, charlene, mylene),
            List.of("картофель", "перец", "морковь"),
            3,
            List.of(bruschetta, juice, salmonCarpaccio)
        );
        testCase(
            kitchen,
            List.of(eugene, nicolas, bertrand, remyDuplicate, lucienDuplicate),
            List.of("сливки", "морковь", "мука", "сыр", "перец"),
            6,
            List.of(bruschetta, orangeBeetroot, coffee, chickenSousVide, juice, beef)
        );
        testCase(
            kitchen,
            List.of(karine, claude),
            new ArrayList<>(),
            10,
            List.of(bruschetta, juice, grilledVeggies, salmonSoup, frenchToast, grilledSalmon)
        );
    }

    @Test
    private void testMenuWithAdditionalConditions() {
        Kitchen kitchen = new Kitchen(kitchenerDishesMap);

        testCase(
            kitchen,
            List.of(remy, lucien, pierre),
            List.of("апельсин", "курица", "лосось", "морковь"),
            (d) -> d.getCategory() != DishCategory.DESSERT,
            10,
            List.of(coffee, grilledVeggies, beef, potatoSoup)
        );
        testCase(
            kitchen,
            List.of(claude, karine, charlene, mylene),
            List.of("картофель", "перец", "морковь"),
            (d) -> d.getIngredients().contains("хлеб") || d.getIngredients().contains("лосось"),
            15,
            List.of(bruschetta, salmonCarpaccio, frenchToast, grilledSalmon)
        );
        testCase(
            kitchen,
            List.of(eugene, nicolas, bertrand, remyDuplicate, lucienDuplicate),
            List.of("сливки", "морковь", "мука", "сыр", "перец"),
            (d) -> d.getName().startsWith("К") || d.getName().startsWith("С"),
            6,
            List.of(orangeBeetroot, coffee, chickenSousVide, frenchToast)
        );
        testCase(
            kitchen,
            List.of(karine, claude),
            new ArrayList<>(),
            (d) -> d.getCategory() == DishCategory.APPETIZER || d.getCategory() == DishCategory.BEVERAGE,
            10,
            List.of(bruschetta, juice, frenchToast)
        );
    }

    private void testCase(
        Kitchen kitchen,
        Collection<Kitchener> workingKitcheners,
        List<String> unavailableIngredients,
        int maxSize,
        Collection<Dish> expectedMenu
    ) {
        ArrayList<Dish> menu = new ArrayList<>(
            kitchen.generateMenu(workingKitcheners, unavailableIngredients, maxSize)
        );
        assertEquals(
            expectedMenu,
            menu
        );
    }

    private void testCase(
        Kitchen kitchen,
        Collection<Kitchener> workingKitcheners,
        List<String> unavailableIngredients,
        Predicate<Dish> additionalConditions,
        int maxSize,
        Collection<Dish> expectedMenu
    ) {
        ArrayList<Dish> menu = new ArrayList<>(
            kitchen.generateMenu(workingKitcheners, unavailableIngredients, additionalConditions, maxSize)
        );
        assertEquals(
            expectedMenu,
            menu
        );
    }
}
