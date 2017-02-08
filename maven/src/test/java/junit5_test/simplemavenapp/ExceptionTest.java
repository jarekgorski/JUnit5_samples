package junit5_test.simplemavenapp;

import org.junit.jupiter.api.*;


class ExceptionTest {
	
	@DisplayName("First exception test")
    @Test
    void testExceptions() {
        Exception ex = Assertions.assertThrows(NumberFormatException.class, () -> new Integer("a"));
        Assertions.assertEquals("For input string: \"a\"", ex.getMessage());
    }
	
}
