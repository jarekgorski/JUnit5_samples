package junit5_test.simplegradleapp;

import org.junit.jupiter.api.*;

@DisplayName("My first JUnit 5 class ‰")
public class CalculatorTest {

	@BeforeAll
	static void setup() {
		System.out.println("Before tests");
	}
	
	@AfterAll
	static void cleanup() {
		System.out.println("After tests");
	}
	
	@BeforeEach
	void prepareEnv() {
		System.out.println("Before each test");
	}
	
	@AfterEach
	void cleanupTest() {
		System.out.println("After each test");
	}

	@Tag("tagged-test")
	@DisplayName("Just a simple test")
    @Test
    void testApp() {
        Assertions.assertTrue(true);
    }
	
	@DisplayName("Another test")
    @Test
    void testApp2() {
        Assertions.assertTrue(true);
    }
	
	@DisplayName("Disabled test")
	@Disabled("not implemented yet")
    @Test
    void disabledTest() {
        Assertions.assertTrue(true);
    }
	
}
