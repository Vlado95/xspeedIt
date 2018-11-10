package com.xspeedId.robot;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.xspeedid.models.Box;
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

	@Test
	public void testAddInBox() {
		Box box = new Box(10);
		Integer expected1 = 8;
		robot.addInBox(box, 2);
		System.out.println("etiquette1 "+box.getEtiquette());
		Assert.assertEquals("add in box 1 ", expected1, box.getCapacity());
		Integer expected2 = 5;
		robot.addInBox(box, 3);
		System.out.println("etiquette "+box.getEtiquette());
		Assert.assertEquals("add in box 2", expected2, box.getCapacity());
		Assert.assertEquals("add in box 3", expected2, robot.addInBox(box, 9).getCapacity());
	}

	@Test
	public void testIntToArrayInt() {
		String articles = "12345678964464446";
		List<Integer> expecteds = Arrays.asList(1,2,3,4,5,6,7,8,9,6,4,4,6,4,4,4,6);
		Collections.sort(expecteds,Collections.reverseOrder());
		Assert.assertEquals("integer to list integer ", expecteds, robot.intToArrayInt(articles));
	}

	@Test
	public void testCreateEtiquette() {
		List<Box> boxArticles = new ArrayList<Box>();
		Box box = new Box(10);
		box.setEtiquette("136");
		Box box1 = new Box(10);
		box1.setEtiquette("46");
		Box box2 = new Box(10);
		box2.setEtiquette("244");
		Box box3 = new Box(10);
		box3.setEtiquette("19");
		Box box4 = new Box(10);
		box4.setEtiquette("53");
		boxArticles.add(box);
		boxArticles.add(box1);
		boxArticles.add(box2);
		boxArticles.add(box3);
		boxArticles.add(box4);
		
		String expected = "136/46/244/19/53";
		 Assert.assertEquals("creating tiquette", expected, robot.createEtiquette(boxArticles));
		 System.out.println(robot.createEtiquette(boxArticles));

	}
	
	@Test
	public void createBoxEtiquette() {
	 Box box = new Box(10);
	 List<Integer> articles = new ArrayList<Integer>();
	 articles.add(1);
	 articles.add(3);
	 articles.add(6);
	 box.setArticle(articles);
	 String expected ="136";
	 Assert.assertEquals("creating box tiquette", expected, robot.createBoxEtiquette(box).getEtiquette());

	 
	 
		
	}

}
