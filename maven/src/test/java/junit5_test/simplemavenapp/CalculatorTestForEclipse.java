package junit5_test.simplemavenapp;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

// to be able to run in old IDE
@RunWith(JUnitPlatform.class)
@DisplayName("My first JUnit 5 class run in old IDE version")
class CalculatorTestForEclipse {

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
