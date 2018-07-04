package com.xspeedid.robot;

import java.util.*;

import com.xspeedid.models.Box;

public interface IRobot {
	
	Integer getClosest(List<Integer> articleList, Integer article);
	
	Integer addInBox(Box box,  Integer article);
	
	List<Integer> intToArrayInt(Integer articles);
	
	String  createEtiquette(List boxArticles) ;

}
