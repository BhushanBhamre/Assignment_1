package Q15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class ItemTest {

	@Test
	void test() {
		Item i=new Item(123, "ajay", 100, 150, LocalDate.of(2020, 11, 23), LocalDate.of(2022, 12, 27));
		assertEquals(true,i.createObject(i));
	}

}
