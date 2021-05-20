package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class multiplyIntTest {

	@Test
	void test() {
		multiplyInt test = new multiplyInt();
		int result = test.multiply(49, 9);
		assertEquals(441, result);
	}

}
