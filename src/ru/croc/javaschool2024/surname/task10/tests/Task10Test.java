package ru.croc.javaschool2024.surname.task10.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task10.BlackListFilter;
import ru.croc.javaschool2024.surname.task10.BlackListFilterImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Task10Test {

    @Test
    private void test() {
        testCase(
            new ArrayList<>(Arrays.asList("Ёжик, ты дурак!", "Отличная серия!", "Разумный ответ.")),
            Set.of("Дурак"),
            List.of("Отличная серия!", "Разумный ответ.")
        );
        testCase(
            new ArrayList<>(Arrays.asList("Ты дурачок?", "Морок", "Можно было и получше.", "Выглядит как дурачок")),
            Set.of("Дурачок", "мор"),
            List.of("Морок", "Можно было и получше.")
        );
        testCase(
            new ArrayList<>(Arrays.asList("Лучший рецепт!", "Фу, какой мрак", "Чучело!")),
            Set.of("мрак", "чучело"),
            List.of("Лучший рецепт!")
        );
    }

    private void testCase(List<String> comments, Set<String> blackList, List<String> expected) {
        BlackListFilter filter = new BlackListFilterImpl();

        filter.filterComments(comments, blackList);
        assert comments.equals(expected);
    }
}
