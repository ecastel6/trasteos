package es.upm.miw.iwvg.trasteostest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.iwvg.trasteos.Point;

public class PointTest {
	private Point pt;
	public static final int XCOORD=-10;
	public static final int YCOORD=20;
	public double PHASE=Math.atan(YCOORD/XCOORD);
	public double MODULE=Math.sqrt(Math.pow(XCOORD, 2)+Math.pow(YCOORD, 2));

	@Test(expected=java.lang.Exception.class)
	public void negativeparm() throws Exception{
		pt = new Point(-10,20);
	}
	
//	@Before
//	public void before() throws Exception {
//		pt = new Point(XCOORD, YCOORD);
//	}
//
//	@Test(expected=java.lang.Exception.class)
//	public void testPuntoIntInt() {
//		assertEquals(XCOORD, pt.getX());
//		assertEquals(YCOORD, pt.getY());
	}
	//    
	//    @Test
	//    public void testModule() {
	//        assertEquals(MODULE, pt.module(), 10e-5);
	//    }
	//
	//    @Test
	//    public void testFase() {
	//        assertEquals(PHASE, pt.phase(), 10e-5);
	//    }
	//
	//    @Test
	//    public void testTranslate() {
	//        try {
	//			this.pt.translateOrigin(new Point(1, 1));
	//		} catch (Exception e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//        assertEquals(XCOORD-1, pt.getX());
	//        assertEquals(YCOORD-1, pt.getY());
	//    }


