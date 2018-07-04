package com.xspeedId.robot;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.xspeedid.robot.IRobot;
import com.xspeedid.robot.RobotImpl;

public class RobotTest {
	private static IRobot robot;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		robot = new RobotImpl();
	}
	
	@Before
	public void beforeEachTest() {
	   System.out.println("This is executed before each Test");
	}
	
	@After
	public void afterEachTest() {
	   System.out.println("This is exceuted after each Test");
	}


	@Test
	public void testGetClosest() {
		
		List<Integer> list= Arrays.asList(7,10,3,8,7,7,3,9,6,6,5,7,7,6,7);
		Assert.assertEquals(" plus petit proche de 4 dans la list", 3, robot.getClosest(list, 4).intValue());
		System.out.println(robot.getClosest(list, 1).intValue());
		Assert.assertEquals("not found = 0 ", 0, robot.getClosest(list, 1).intValue());
		Assert.assertEquals("vnombre egale a 3 ", 3, robot.getClosest(list, 3).intValue());
		
	}

//	@Test
//	public void testAddInBox() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testIntToArrayInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testCreateEtiquette() {
//		fail("Not yet implemented");
//	}

}
