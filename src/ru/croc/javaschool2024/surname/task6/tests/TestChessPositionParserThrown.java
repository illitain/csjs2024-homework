package ru.croc.javaschool2024.surname.task6.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task6.ChessPosition;
import ru.croc.javaschool2024.surname.task6.ChessPositionParser;

import java.util.Objects;

/**
 * Тесты методов {@link ChessPositionParser}.
 * 
 * @author Dmitry Malenok
 */
public class TestChessPositionParserThrown implements TestExceptionThrown {

    /**
     * Тест метода {@link ChessPositionParser#parse(String)}.
     * <p/>
     * Проверяет правильность преобразования наименования одной из клеток внутри доски.
     */
    @Test
    public void parseSomethingInside() {
        // given:
        final String position = "e4";
        final int expectedX = 4;
        final int expectedY = 3;

        // when:
        final ChessPosition result = ChessPositionParser.parse(position);
        assert result != null;
        assert Objects.equals(result.x(), expectedX);
        assert Objects.equals(result.y(), expectedY);
        assert Objects.equals(result.toString(), position);
    }

    /**
     * Тест метода {@link ChessPositionParser#parse(String)}.
     * <p/>
     * Проверяет правильность преобразования наименования левой нижней клетки.
     */
    @Test
    public void parseLowerLeftConner() {
        // given:
        final String position = "a1";
        final int expectedX = 0;
        final int expectedY = 0;

        // when:
        final ChessPosition result = ChessPositionParser.parse(position);

        // then:
        assert result != null;
        assert Objects.equals(result.x(), expectedX);
        assert Objects.equals(result.y(), expectedY);
        assert Objects.equals(result.toString(), position);
    }

    /**
     * Тест метода {@link ChessPositionParser#parse(String)}.
     * <p/>
     * Проверяет правильность преобразования наименования правой верхней клетки.
     */
    @Test
    public void parseUpperRightConner() {
        // given:
        final String position = "h8";
        final int expectedX = 7;
        final int expectedY = 7;

        // when:
        final ChessPosition result = ChessPositionParser.parse(position);

        // then:
        assert result != null;
        assert Objects.equals(result.x(), expectedX);
        assert Objects.equals(result.y(), expectedY);
        assert Objects.equals(result.toString(), position);
    }

    /**
     * Тест метода {@link ChessPositionParser#parse(String)}.
     * <p/>
     * Проверяет правильность обработки некорректной клетки.
     */
    @Test
    public void parseInvalidPosition() {
        // given:
        final String expectedExceptionClassName = "IllegalPositionException";

        // when:
        // then:
        // В промышленном коде, лучше создать исключение с самого начала и проверить на соответствие его типу.
        checkExpectedExceptionIsThrown(() -> ChessPositionParser.parse("a9"), expectedExceptionClassName);
        checkExpectedExceptionIsThrown(() -> ChessPositionParser.parse("a0"), expectedExceptionClassName);
        checkExpectedExceptionIsThrown(() -> ChessPositionParser.parse("ao"), expectedExceptionClassName);
        checkExpectedExceptionIsThrown(() -> ChessPositionParser.parse("k1"), expectedExceptionClassName);
        checkExpectedExceptionIsThrown(() -> ChessPositionParser.parse("a23"), expectedExceptionClassName);
    }



}
