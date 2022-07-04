package Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromTest {

	@Test
	void test() {
		assertEquals(true, Palindrom.check("aabaa","aabaa"));
	}

}
