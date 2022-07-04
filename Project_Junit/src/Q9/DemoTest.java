package Q9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void test() {
		assertEquals("This red car", Demo.remove("This @red $car-."));
		
	}

}
