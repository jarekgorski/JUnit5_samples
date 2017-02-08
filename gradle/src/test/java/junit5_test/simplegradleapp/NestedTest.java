package junit5_test.simplegradleapp;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;


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
	class TestEmptyList {
		@Test
		public void sizeShouldReturnZero() {
			Assertions.assertEquals(0, items.size());
		}
		
	}
	
	@Nested
	class TestOneElementList {
		@Test
		void addingOneElementShouldIncreaseSize() {
			items.add("Item");
			Assertions.assertEquals(items.size(), 1);
		}
	}
	

	
}
