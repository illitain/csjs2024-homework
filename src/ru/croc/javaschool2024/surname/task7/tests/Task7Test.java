package ru.croc.javaschool2024.surname.task7.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task7.Task7;

import java.util.Objects;

public class Task7Test {


    @Test
    public void testCrocKitty() {
        assert testNormalization(
                "КРОК/работа/src/./../../универ/../../../мемы/котики",
                "../мемы/котики"
        );
    }

    @Test
    public void testOnlyKitty() {
        assert testNormalization(
                "./../../../мемы/котики/./././.",
                "../../../мемы/котики"
        );
    }

    private boolean testNormalization(String input, String expectedRes) {
        String res = Task7.normalizePath(input);
        return Objects.equals(expectedRes, res);

    }
}
