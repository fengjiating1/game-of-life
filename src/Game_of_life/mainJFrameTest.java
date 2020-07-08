package Game_of_life;

import static org.junit.Assert.*;

import java.awt.Color;

import javax.swing.JButton;

import org.junit.Before;
import org.junit.Test;

public class mainJFrameTest{
	private static mainJFrame mJFrame=new mainJFrame();
    static Cell cell[][]=new Cell[99][99];
	static JButton[][] btn=new JButton[99][99];

	@Before
	public void setUp() {
	}

	@Test
	public void testalter_map() {
		cell=Map.initial();
		cell[1][1].alter_state(1);
		cell[1][2].alter_state(1);
		cell[0][1].alter_state(1);
		for(int i=0;i<99;i++) {
			for(int j=0;j<99;j++) {
			   btn[i][j]=new JButton();
			   btn[i][j].setBackground(Color.white);
			}
		}
		mJFrame.alter_map();
		assertEquals(Color.white,btn[1][1].getBackground());
	}
	

}
