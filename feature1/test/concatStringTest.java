package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class concatStringTest {

	@Test
	void test() {
		concatString test = new concatString();
		String result = test.concatenate("COSC", "499");
		assertEquals("COSC499", result);
	}

}
