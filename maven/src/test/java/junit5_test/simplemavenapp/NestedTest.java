package junit5_test.simplemavenapp;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Assertions;

@DisplayName("Nested class")
public class NestedTest {
	
	private List<String> items;
	
	@BeforeEach
	void setup() {
		items = new LinkedList<>();
	}
	
	@Test
	void isEmpty() {
		Assertions.assertTrue(items.isEmpty());
	}
	
	@Nested
	class WhenEmpty {
		@Test
		public void sizeShouldReturnZero() {
			Assertions.assertEquals(0, items.size());
		}
		
	}
	
	@Nested
	class WhenWithOneElement {
		@Test
		void addingOneElementShouldIncreaseSize() {
			items.add("Item");
			Assertions.assertEquals(items.size(), 1);
		}
	}
	

	
}
