package Ex_2and3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 2. Нужно покрыть тестами метод evenOddNumber() на 100%
class CalculationsTest {
    @Test
    void evenPositiveNumberTest() {
        assertTrue(Calculations.evenOddNumber(12));
    }
    @Test
    void oddPositiveNumberTest() {
        assertFalse(Calculations.evenOddNumber(3));
    }
    @Test
    void evenNegativeNumberTest() {
        assertTrue(Calculations.evenOddNumber(-666));
    }
    @Test
    void oddNegativeNumberTest() {
        assertFalse(Calculations.evenOddNumber(-333));
    }
    @Test
    void ZeroNumberTest() {
        assertTrue(Calculations.evenOddNumber(0));
    }
}