package Game_of_life;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {
	private static Cell cell=new Cell();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGet_living_num() {
		cell.alter_living_num(2);
		assertEquals(2,cell.get_living_num());
	}
	public void testGet_state() {
		cell.alter_state(1);
		assertEquals(1,cell.get_state());
	}
	public void testAlter_living_num() {
		cell.alter_living_num(3);
		assertEquals(3,cell.get_living_num());
	}
	public void testAlter_state() {
		cell.alter_living_num(0);
		assertEquals(0,cell.get_state());
	}
	public void testJudge() {
		cell.alter_living_num(3);
		cell.alter_state(0);
		assertEquals(1,cell.judge());
	}
}
