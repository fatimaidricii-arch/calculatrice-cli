
package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddOperationTest {

    @Test
    public void testAdditionPositiveNumbers() {
        AddOperation addition = new AddOperation();
        assertEquals(15.0, addition.execute(10.0, 5.0));
    }

    @Test
    public void testAdditionNegativeNumbers() {
        AddOperation addition = new AddOperation();
        assertEquals(-8.0, addition.execute(-5.0, -3.0));
    }

    @Test
    public void testAdditionDecimals() {
        AddOperation addition = new AddOperation();
        assertEquals(4.0, addition.execute(1.5, 2.5));
    }
}
