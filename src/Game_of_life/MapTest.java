package Game_of_life;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MapTest {
	private static Map map=new Map();
	private static Cell [][]cell=new Cell[99][99];
    @SuppressWarnings("static-access")
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cell=map.initial();
	}

	@Before
	public void setUp() throws Exception {
	}
    @SuppressWarnings("static-access")
	@Test
	public void testCalculate_living() {
		for(int i=0;i<99;i++) {
			for(int j=0;j<99;j++) {
				cell[i][j].alter_state(1);
			}
		}
		map.calculate_living(cell);
		for(int i=0;i<99;i++) {
			for(int j=0;j<99;j++) {
				if(i>0&&i<98&&j>0&&j<98) assertEquals(8,cell[i][j].get_living_num());
				else if((i==0||i==98)&&(j>0&&j<98)||(j==0||j==98)&&(i>0&&i<98))
					assertEquals(5,cell[i][j].get_living_num());
				else assertEquals(3,cell[i][j].get_living_num());
			}
		}
		for(int i=0;i<99;i++) {
			for(int j=0;j<99;j++) {
				cell[i][j].alter_state(0);
			}
		}
		map.calculate_living(cell);
		for(int i=0;i<99;i++) {
			for(int j=0;j<99;j++) {
				assertEquals(0,cell[i][j].get_living_num());
				assertEquals(0,cell[i][j].get_state());
			}
		}
	}

}
