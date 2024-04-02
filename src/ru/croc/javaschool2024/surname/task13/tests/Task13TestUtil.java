package ru.croc.javaschool2024.surname.task13.tests;

import ru.croc.javaschool2024.surname.task13.dish.Dish;
import ru.croc.javaschool2024.surname.task13.dish.DishCategory;
import ru.croc.javaschool2024.surname.task13.kitchener.Kitchener;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

//просто вынесу сюда данные для тестов, чтобы они не мешались
public class Task13TestUtil {
    private Task13TestUtil() {}

    static {
        remy = new Kitchener(1, "Реми");
        bertrand = new Kitchener(2, "Бертран");
        nicolas = new Kitchener(3, "Николя");
        lucien = new Kitchener(4, "Люсьен");
        charlene = new Kitchener(5, "Шарлен");
        eugene = new Kitchener(6, "Эжен");
        mylene = new Kitchener(7, "Милен");
        karine = new Kitchener(8, "Карин");
        claude = new Kitchener(9, "Клод");
        pierre = new Kitchener(10, "Пьер");

        remyDuplicate = new Kitchener(1, "Реми");
        lucienDuplicate = new Kitchener(4, "Люсьен");

        cinnabon = new Dish(
            "Булочка с корицей",
            "-",
            List.of("мука", "молоко", "яйца", "сахар", "корица"),
            DishCategory.DESSERT,
            (byte) 59,
            (byte) 66
        );
        orangeTart = new Dish(
            "Апельсиновый тарт",
            "-",
            List.of("мука", "молоко", "яйца", "сахар", "апельсин"),
            DishCategory.DESSERT,
            (byte) 87,
            (byte) 64
        );
        orangeJelly = new Dish(
            "Апельсиновое желе",
            "-",
            List.of("сахар", "желатин", "апельсин"),
            DishCategory.DESSERT,
            (byte) 7,
            (byte) 14
        );
        coffee = new Dish(
            "Кофе",
            "-",
            List.of("кофе", "молоко"),
            DishCategory.BEVERAGE,
            (byte) 99,
            (byte) 85
        );
        bumbleCoffee = new Dish(
            "Бамбл",
            "-",
            List.of("кофе", "апельсин"),
            DishCategory.BEVERAGE,
            (byte) 10,
            (byte) 55
        );
        juice = new Dish(
            "Апельсиновый сок",
            "-",
            List.of("апельсин"),
            DishCategory.BEVERAGE,
            (byte) 76,
            (byte) 98
        );
        potatoSoup = new Dish(
            "Картофельный крем-суп",
            "-",
            List.of("картофель", "сливки","соль"),
            DishCategory.SOUP,
            (byte) 35,
            (byte) 61
        );
        salmonSoup = new Dish(
            "Крем-суп из лосося",
            "-",
            List.of("картофель", "сливки", "соль", "лосось"),
            DishCategory.SOUP,
            (byte) 65,
            (byte) 77
        );
        finnishSoup = new Dish(
            "Финская уха",
            "-",
            List.of("картофель", "сливки", "соль", "лосось"),
            DishCategory.SOUP,
            (byte) 81,
            (byte) 98
        );
        mashedPotato = new Dish(
            "Картофельное пюре",
            "-",
            List.of("картофель", "сливки", "соль"),
            DishCategory.SIDE_DISH,
            (byte) 45,
            (byte) 45
        );
        grilledVeggies = new Dish(
            "Овощи на гриле",
            "-",
            List.of("кабачок", "картофель", "перец", "томаты", "соль"),
            DishCategory.SIDE_DISH,
            (byte) 74,
            (byte) 68
        );
        bruschetta = new Dish(
            "Брускетта с томатами",
            "-",
            List.of("хлеб", "томаты", "соль"),
            DishCategory.APPETIZER,
            (byte) 100,
            (byte) 41
        );
        frenchToast = new Dish(
            "Сладкий френч-тост",
            "-",
            List.of("хлеб", "яйцо", "сахар"),
            DishCategory.APPETIZER,
            (byte) 64,
            (byte) 41
        );
        salmonCarpaccio = new Dish(
            "Карпаччо из лосося",
            "-",
            List.of("лосось"),
            DishCategory.APPETIZER,
            (byte) 64,
            (byte) 79
        );
        beef = new Dish(
            "Говядина на гриле",
            "-",
            List.of("говядина"),
            DishCategory.MAIN_DISH,
            (byte) 64,
            (byte) 89
        );
        chickenSousVide = new Dish(
            "Курица су-вид",
            "-",
            List.of("курица", "соль"),
            DishCategory.MAIN_DISH,
            (byte) 83,
            (byte) 70
        );
        grilledSalmon = new Dish(
            "Лосось на гриле",
            "-",
            List.of("лосось"),
            DishCategory.MAIN_DISH,
            (byte) 54,
            (byte) 100
        );
        coleSlaw = new Dish(
            "Коул слоу",
            "-",
            List.of("капуста", "морковь"),
            DishCategory.SALAD,
            (byte) 27,
            (byte) 36
        );
        caesar = new Dish(
            "Цезарь",
            "-",
            List.of("салат", "курица", "сыр", "соус"),
            DishCategory.SALAD,
            (byte) 52,
            (byte) 83
        );
        orangeBeetroot = new Dish(
            "Салат со свеклой и апельсином",
            "-",
            List.of("свекла", "апельсин", "соус"),
            DishCategory.SALAD,
            (byte) 100,
            (byte) 1
        );




        coffeeDuplicate = new Dish(
            "Кофе",
            "-",
            List.of("кофе", "молоко"),
            DishCategory.BEVERAGE,
            (byte) 99,
            (byte) 85
        );
        orangeTartDuplicate = new Dish(
            "Апельсиновый тарт",
            "-",
            List.of("мука", "молоко", "яйца", "сахар", "апельсин"),
            DishCategory.DESSERT,
            (byte) 87,
            (byte) 64
        );
        grilledSalmonDuplicate = new Dish(
            "Лосось на гриле",
            "-",
            List.of("лосось"),
            DishCategory.MAIN_DISH,
            (byte) 54,
            (byte) 100
        );
        bruschettaDuplicate = new Dish(
            "Брускетта с томатами",
            "-",
            List.of("хлеб", "томаты", "соль"),
            DishCategory.APPETIZER,
            (byte) 100,
            (byte) 41
        );

        kitchenerDishesMap = new HashMap<>() {{
            put(remy, Set.of(cinnabon, caesar, beef, orangeBeetroot, coffeeDuplicate, finnishSoup));
            put(bertrand, Set.of(beef, coleSlaw, chickenSousVide, orangeJelly, orangeTartDuplicate));
            put(nicolas, Set.of(coffee, cinnabon, orangeTart, bumbleCoffee, mashedPotato, frenchToast));
            put(lucien, Set.of(cinnabon, juice, potatoSoup, finnishSoup, grilledVeggies, coffee));
            put(charlene, Set.of(mashedPotato, salmonSoup, salmonCarpaccio, finnishSoup));
            put(eugene, Set.of(potatoSoup, mashedPotato, bruschettaDuplicate));
            put(mylene, Set.of(juice, salmonSoup, grilledVeggies, coleSlaw));
            put(karine, Set.of(juice, bruschetta, frenchToast, grilledSalmonDuplicate));
            put(claude, Set.of(salmonSoup, grilledVeggies, bruschettaDuplicate, frenchToast, grilledSalmon));
            put(pierre, Set.of(finnishSoup, grilledVeggies, grilledSalmon, coleSlaw));

            put(remyDuplicate, Set.of(cinnabon, caesar, beef, orangeBeetroot, coffeeDuplicate, finnishSoup));
            put(lucienDuplicate, Set.of(cinnabon, juice, potatoSoup, finnishSoup, grilledVeggies, coffee));
        }};
    }

    public static HashMap<Kitchener, Set<Dish>> kitchenerDishesMap;


    public static Kitchener remy;
    public static Kitchener bertrand;
    public static Kitchener nicolas;
    public static Kitchener lucien;
    public static Kitchener charlene;
    public static Kitchener eugene;
    public static Kitchener mylene;
    public static Kitchener karine;
    public static Kitchener claude;
    public static Kitchener pierre;

    public static Kitchener remyDuplicate;
    public static Kitchener lucienDuplicate;

    public static Dish cinnabon;
    public static Dish orangeTart;
    public static Dish orangeJelly;
    public static Dish coffee;
    public static Dish bumbleCoffee;
    public static Dish juice;
    public static Dish potatoSoup;
    public static Dish salmonSoup;
    public static Dish finnishSoup;
    public static Dish mashedPotato;
    public static Dish grilledVeggies;
    public static Dish bruschetta;
    public static Dish frenchToast;
    public static Dish salmonCarpaccio;
    public static Dish beef;
    public static Dish chickenSousVide;
    public static Dish grilledSalmon;
    public static Dish coleSlaw;
    public static Dish caesar;
    public static Dish orangeBeetroot;




    public static Dish coffeeDuplicate;
    public static Dish orangeTartDuplicate;
    public static Dish grilledSalmonDuplicate;
    public static Dish bruschettaDuplicate;
}
