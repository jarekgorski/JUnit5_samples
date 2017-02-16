package junit5_test.simplegradleapp;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTestJunit4 {

    @Test
    public void testApp() {
        assertTrue(true);
    }
	
    @Test
    @Ignore("not implemented")
    public void disabledTest() {
        assertTrue(true);
    }
	
}
