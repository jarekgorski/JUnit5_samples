package junit5_test.simplegradleapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;


@DisplayName("My first test class using custom extension")
@UseMyExtension
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
		int i = 2/0;
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