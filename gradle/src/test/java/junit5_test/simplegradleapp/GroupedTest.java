package junit5_test.simplegradleapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

public class GroupedTest {

    @Test
    void testGrouped() {
    	Calculator calc = new Calculator();
    	Assertions.assertAll(
    			() -> Assertions.assertEquals(3, calc.sum(1, 2)),
    			() -> Assertions.assertEquals(4, calc.sum(2, 3)), // <-- should fail
    			() -> Assertions.assertEquals(1, calc.sum(1, 1)), // <-- this one too
				() -> Assertions.assertAll(
					() -> Assertions.assertEquals(3, calc.sum(1, 2)),
					() -> Assertions.assertEquals(6, calc.sum(2, 3)),
					() -> Assertions.assertEquals(7, calc.sum(2, 3)))
    			);
    }

	
}
