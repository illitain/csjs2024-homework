package ru.croc.javaschool2024.surname.task6.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task6.IllegalMoveException;
import ru.croc.javaschool2024.surname.task6.KnightsMoveChecker;
import ru.croc.javaschool2024.surname.task6.KnightsMoveCheckerFactory;

/**
 * Тест методов {@link KnightsMoveChecker}.
 * 
 * @author Dmitry Malenok
 */
public class TestKnightsMoveChecker implements TestExceptionThrown{

    /**
     * Тестируемый обработчик.
     */
    private KnightsMoveChecker checker;

    /**
     * Инициализация, выполняемая перед каждым тестом.
     */
    protected void setUp() {
        checker = KnightsMoveCheckerFactory.get();
    }

    /**
     * Тест метода {@link KnightsMoveChecker#check(String[])}.
     * <p/>
     * Проверяет один правильный ход.
     * 
     * @throws IllegalMoveException
     *             при ошибке теста
     */
    @Test
    public void checkOneLegalMove() throws IllegalMoveException {
        setUp();
        // given:

        // when:
        // then:
        checker.check(new String[] { "b1", "c3" });
        checker.check(new String[] { "b1", "a3" });
        checker.check(new String[] { "g8", "h6" });
        checker.check(new String[] { "g8", "f6" });
    }


    /**
     * Тест метода {@link KnightsMoveChecker#check(String[])}.
     * <p/>
     * Проверяет обход доски конём по маршруту Яниша.
     * 
     * @throws IllegalMoveException
     *             при ошибке теста
     */
    @Test
    public void checkJaenischSequence() throws IllegalMoveException {
        setUp();
        // given:

        // when:

        // then:
        checker.check(new String[] { "d4",
            "c2",
            "a1",
            "b3",
            "c1",
            "a2",
            "b4",
            "d3",
            "c5",
            "a6",
            "b8",
            "d7",
            "f6",
            "e8",
            "g7",
            "h5",
            "g3",
            "h1",
            "f2",
            "e4",
            "d6",
            "b5",
            "a7",
            "c8",
            "e7",
            "g8",
            "h6",
            "f5",
            "h4",
            "g2",
            "e1",
            "f3",
            "e5",
            "f7",
            "h8",
            "g6",
            "f8",
            "h7",
            "g5",
            "e6",
            "f4",
            "h3",
            "g1",
            "e2",
            "c3",
            "d1",
            "b2",
            "a4",
            "b6",
            "a8",
            "c7",
            "d5",
            "e3",
            "g4",
            "h2",
            "f1",
            "d2",
            "b1",
            "a3",
            "c4",
            "a5",
            "b7",
            "d8",
            "c6" });
    }

    /**
     * Тест метода {@link KnightsMoveChecker#check(String[])}.
     * <p/>
     * Проверяет неправильный ход.
     * 
     * @throws IllegalMoveException
     *             при ошибке теста
     */
    @Test
    public void checkWrongMove() {
        setUp();
        // given:

        // when:
        // then:
        checkExpectedExceptionIsThrown(
                checker,
                new String[] { "b2", "b3" },
                IllegalMoveException.class,
                "b2 -> b3");
        checkExpectedExceptionIsThrown(
                checker,
                new String[] { "b2", "c4", "e4", "g6" },
                IllegalMoveException.class,
                "c4 -> e4"
        );
    }
}
