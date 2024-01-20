import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testCalculateMethod() {
        // Testăm operații de bază
        assertEquals("5.0", Calculator.Run("2+3"));

        // Testăm prioritățile operațiilor
        assertEquals("14.0", Calculator.Run("2+3*4"));

        // Testăm împărțirea la zero
        assertEquals("ERROR", Calculator.Run("6/0"));

        // Testăm expresie validă cu număr negativ
        assertEquals("0.0", Calculator.Run("10+(-5)*2"));

        // Testăm expresie validă cu paranteze
        assertEquals("20.0", Calculator.Run("(2+3)*4"));
    }
}
