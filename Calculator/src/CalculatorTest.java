import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    static Calculator calculator;

    @BeforeAll
    static void setUp(){
        calculator = new Calculator();
    }



    @Test
    void validateOperator() {
        assertEquals('+',calculator.validateOperator('+'));
    }

    @Test
    void valideteNumber() {
        assertEquals(1L,calculator.valideteNumber("1"));
    }

}