package ru.croc.javaschool2024.surname.task6.tests;

import ru.croc.javaschool2024.surname.task6.KnightsMoveChecker;

import java.util.Objects;

public interface TestExceptionThrown {

    default void checkExpectedExceptionIsThrown(Runnable method, String expectedExceptionClassName) {
        try {
            method.run();
        } catch (Exception ex) {
            boolean exceptionIsCorrect = Objects.equals(ex.getClass().getSimpleName(), expectedExceptionClassName);
            assert exceptionIsCorrect;
            return;
        }
        assert false;
    }


    default void checkExpectedExceptionIsThrown(KnightsMoveChecker method, String[] args, Class<?> expectedClass, String expectedMsg) {
        try {
            method.check(args);
        } catch (Exception ex) {
            assert Objects.equals(ex.getClass(), expectedClass);
            assert Objects.equals(ex.getMessage(), expectedMsg);
            return;
        }
        assert false;
    }
}
