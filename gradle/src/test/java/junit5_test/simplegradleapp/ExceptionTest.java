package junit5_test.simplegradleapp;

import org.junit.jupiter.api.*;

class ExceptionTest {

	@DisplayName("First exception test")
    @Test
    void testExceptions() {

	    // old fashioned way
        try {
            new Integer("a");
            // return here with error
        } catch (NumberFormatException e) {
            // should pass
        }

        // new way
        Exception ex = Assertions.assertThrows(NumberFormatException.class, () -> new Integer("a"));
        Assertions.assertEquals("For input string: \"a\"", ex.getMessage());
    }
	
}
