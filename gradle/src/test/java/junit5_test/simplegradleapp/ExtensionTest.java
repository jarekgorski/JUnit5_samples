package junit5_test.simplegradleapp;

import org.junit.jupiter.api.*;


@DisplayName("My first testclass using custom extension")
public class ExtensionTest {
	@DisplayName("Just a simple test")
	@TagCountedTest
	void testApp() {
		Assertions.assertTrue(true);
	}

	@DisplayName("Another test")
	@TagCountedTest
	void testApp2() {
		Assertions.assertTrue(true);
	}

	@DisplayName("3rd test")
	@TagCountedTest
	@Tag("Another tag")
	void testApp3() {
		Assertions.assertTrue(true);
	}

	@AfterAll
	static void summarize() {
		System.out.println("summarize");
	}
}