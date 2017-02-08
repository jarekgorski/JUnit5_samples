package junit5_test.simplemavenapp;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.*;

public class AssumptionsTest {

    @Test
    void testAssumptions1() {
    	Assumptions.assumeFalse(System.currentTimeMillis() > 0);
        Assertions.assertTrue(false);
    }
	
    @Test
    void testAssumptions2() {
    	List<String> items = new ArrayList<>();
    	Assumptions.assumingThat(!isListEmpty(items), () -> Assertions.assertTrue(false));
    }
    
    private boolean isListEmpty(List<?> l) {
    	return (l.size() == 0);
    }
}
