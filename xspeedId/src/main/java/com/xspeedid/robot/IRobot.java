package com.xspeedid.robot;

import java.util.*;

import com.xspeedid.models.Box;

public interface IRobot {
	
	Integer getClosest(List<Integer> articleList, Integer article);
	
	Box addInBox(Box box,  Integer article);
	
	List<Integer> intToArrayInt(String articles);
	
	String  createEtiquette(List<Box> boxArticles) ;
	
	Box  createBoxEtiquette(Box box) ;

}
