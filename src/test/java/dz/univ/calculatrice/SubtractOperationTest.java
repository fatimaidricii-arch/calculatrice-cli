
package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractOperationTest {

    @Test
    public void testSubtractionPositiveNumbers() {
        SubtractOperation subtraction = new SubtractOperation();
        assertEquals(7.0, subtraction.execute(10.0, 3.0));
    }

    @Test
    public void testSubtractionNegativeNumbers() {
        SubtractOperation subtraction = new SubtractOperation();
        assertEquals(-2.0, subtraction.execute(-5.0, -3.0));
    }

    @Test
    public void testSubtractionDecimals() {
        SubtractOperation subtraction = new SubtractOperation();
        assertEquals(1.0, subtraction.execute(2.5, 1.5));
    }
}
