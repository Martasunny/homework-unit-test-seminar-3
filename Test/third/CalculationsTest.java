package Ex_2and3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 3. Нужно покрыть тестами метод numberInInterval() на 100%
class CalculationsTest {
    @Test
    void numberIsInInterval() {
        assertTrue(Calculations.numberInInterval(26));
    }
    @Test
    void numberBelowInterval() { 
        assertFalse(Calculations.numberInInterval(25));
    }
    @Test
    void numberOverInterval() {
        assertFalse(Calculations.numberInInterval(120));
    }
}