package ru.croc.javaschool2024.surname.task6.tests;

import org.testng.annotations.Test;
import ru.croc.javaschool2024.surname.task6.Application;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Objects;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Тест логики работы приложения.
 *
 * @author Dmitry Malenok
 */
public class TestApplication {

    /**
     * Исходный основной поток приложения.
     */
    private final PrintStream standardOut = System.out;

    /**
     * Поток, в который записывается вывод приложения в консоль.
     */
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    /**
     * Инициализация, запускаемая перед каждым тестом.
     */
    protected void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor, true, UTF_8));
        outputStreamCaptor.reset();
    }

    /**
     * Восстановление, запускаемое после каждого теста.
     */
    protected void tearDown() {
        System.setOut(standardOut);
    }

    /**
     * Тест запуска приложения с неверным ходом в последовательности ходов.
     */
    @Test
    public void testIllegalMove() {
        setUp();
        // given:
        final String[] moves = new String[] { "g8", "e7", "e6" };

        // when:
        Application.main(moves);

        // then:
        assert Objects.equals("конь так не ходит: e7 -> e6", outputStreamCaptor.toString(UTF_8));
        tearDown();
    }

    /**
     * Тест запуска приложения с верной последовательностью ходов.
     */
    @Test
    public void testLegalMoves() {
        setUp();
        // given:
        final String[] moves = new String[] { "g8", "e7", "c8" };

        // when:
        Application.main(moves);

        // then:
        assert Objects.equals(outputStreamCaptor.toString(UTF_8), "OK");
        tearDown();
    }
}
