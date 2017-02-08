package junit5_test.simplegradleapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class DynamicTestingTest {

	@TestFactory
	List<DynamicTest> createDynamicTestsReturnAsCollection() {
		return Arrays.asList(
				DynamicTest.dynamicTest("A dynamic test", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Another dynamic test", () -> Assertions.assertEquals(6, 3 * 2)));
	}
	
	@TestFactory
	Stream<DynamicTest> dynamicSquareRootTest() {
	return Stream.of(
			new Object[][] {{2d, 4d}, {3d, 9d}, {4d, 16d}})
				.map(i -> DynamicTest.dynamicTest("Square root test",
						() -> Assertions.assertEquals(i[0], Math.sqrt((double)i[1])))); 
	
	}
}