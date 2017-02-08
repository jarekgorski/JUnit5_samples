package junit5_test.simplemavenapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

import junit5_test.simplemavenapp.Calculator;

public class GroupedTest {

	@Disabled
    @Test
    void testGrouped() {
    	Calculator calc = new Calculator();
    	Assertions.assertAll(
    			() -> Assertions.assertEquals(3, calc.sum(1, 2)),
    			() -> Assertions.assertEquals(4, calc.sum(2, 3)), // <-- should fail
    			() -> Assertions.assertEquals(1, calc.sum(1, 1)) // <-- this one too
    			);
    }

	
}
