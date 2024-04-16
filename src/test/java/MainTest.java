import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void task1Test() {
        assertEquals("Right", Main.task1(0));
        assertEquals("Nope", Main.task1(1));
    }

    @Test
    void task2Test() {
        assertEquals("Right", Main.task2(1));
        assertEquals("Nope", Main.task2(0));
    }

    @Test
    void task3Test() {
        assertEquals("Right", Main.task3(-3));
        assertEquals("Nope", Main.task3(0));
    }

    @Test
    void task4Test() {
        assertEquals("Right", Main.task4(0));
        assertEquals("Right", Main.task4(132));
        assertEquals("Nope", Main.task4(-5));
    }

    @Test
    void task5Test() {
        assertEquals("Right!", Main.task5(0));
        assertEquals("Nope!", Main.task5(12));
        assertEquals("Right!", Main.task5(-4));
    }

    @Test
    void task6Test() {
        assertEquals("Right!", Main.task6(1));
        assertEquals("Nope!", Main.task6(0));
    }

    @Test
    void task7Test() {
        assertEquals("Right!", Main.task7(12, 12));
        assertEquals("Nope!", Main.task7(12, 3));
    }

    @Test
    void task8Test() {
        assertEquals("Right!", Main.task8(1, 1));
        assertEquals("Nope!", Main.task8(3, 5));
    }

    @Test
    void task9Test() {
        assertEquals("True", Main.task9(true));
        assertEquals("False", Main.task9(false));
    }

    @Test
    void task10Test() {
        assertEquals("False", Main.task10(true));
        assertEquals("True", Main.task10(false));
    }

    @Test
    void task11Test() {
        assertEquals("Nope!", Main.task11(5));
        assertEquals("Nope!", Main.task11(-3));
        assertEquals("Right!", Main.task11(2));
    }

    @Test
    void task12Test() {
        assertEquals(7, Main.task12(0));
        assertEquals(1, Main.task12(10));
        assertEquals(9, Main.task12(2));
    }

    @Test
    void task13Test() {
        assertEquals(4, Main.task13(1, 3));
        assertEquals(6, Main.task13(6, 0));
        assertEquals(-2, Main.task13(3, 5));
    }

    @Test
    void task14Test() {
        assertEquals("Nope!", Main.task14(12, 23));
        assertEquals("Right!", Main.task14(2, 11));
        assertEquals("Right!", Main.task14(8, 4));
    }

    @Test
    void task15Test() {
        assertEquals("Зима", Main.task15(1));
        assertEquals("Весна", Main.task15(2));
        assertEquals("Лето", Main.task15(3));
        assertEquals("Осень", Main.task15(4));
    }

    @Test
    void task16Test() {
        assertEquals("Перша декада", Main.task16(5));
        assertEquals("Друга декада", Main.task16(15));
        assertEquals("Третя декада", Main.task16(25));
        assertEquals("Четверта декада", Main.task16(31));
    }

    @Test
    void task17Test() {
        assertEquals("Зима", Main.task17(1));
        assertEquals("Лето", Main.task17(6));
        assertEquals("Весна", Main.task17(8));
        assertEquals("Осень", Main.task17(11));
        assertEquals("Неправильний місяц", Main.task17(13));
    }

    @Test
    void task18Test() {
        assertEquals("Yes", Main.task18("coala"));
        assertEquals("No", Main.task18("xyz"));
    }

    @Test
    void task19Test() {
        assertEquals("Yes", Main.task19("12345"));
        assertEquals("Nope", Main.task19("67890"));
    }

    @Test
    void task20Test() {
        assertEquals(19, Main.task20("892"));
        assertEquals(17, Main.task20("782"));
    }

    @Test
    void task21Test() {
        assertEquals("Yes", Main.task21("123330"));
        assertEquals("Nope", Main.task21("123456"));
    }
}