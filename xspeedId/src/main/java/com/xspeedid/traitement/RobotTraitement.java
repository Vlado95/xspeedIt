package com.xspeedid.traitement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xspeedid.models.Box;
import com.xspeedid.robot.IRobot;
import com.xspeedid.robot.RobotImpl;

public class RobotTraitement {
	
	IRobot robot= new RobotImpl();
	
	public List<Box> remplir(String articles){
		List<Box> list = new ArrayList<Box>();
		List<Integer> articlesList = new ArrayList<Integer>();
	
		
		
		try {
			articlesList  = robot.intToArrayInt(articles);
			
			for(Iterator<Integer> iterator = articlesList.iterator() ; iterator.hasNext();){
				 Integer article = iterator.next();
				if(article > 5){
					Box b = robot.addInBox(new Box(10), article);
					//b= robot.createBoxEtiquette(b);
					list.add(b);
					iterator.remove();
				}
			}
			
			for(Box box : list){
				Integer article = robot.getClosest(articlesList, box.getCapacity());
				robot.addInBox(box, article);
				articlesList.remove(article);
			}
				
			for(Iterator<Integer> iterator = articlesList.iterator() ; iterator.hasNext();){
					 Integer article = iterator.next();
					 iterator.remove();
					 Box b = robot.addInBox(new Box(10), article);
						for(Integer o : articlesList){
							System.out.println("restes dans la list 0 "+o);
						}
					 List<Integer> ls =articlesList;
					 
					 for(Iterator<Integer> iterator2 = ls.iterator() ; iterator2.hasNext();){
						 Integer a = robot.getClosest(ls,b.getCapacity());
						 Integer a2 =iterator2.next();
						 if(a==a2){
							 robot.addInBox(b, a2);
							 	 
						 }
						 iterator2.remove();
						 
					 }
					 list.add(b);
					 articlesList=ls;		
						
			}
			

				
				for(Integer article : articlesList){
					System.out.println("restes dans la list "+article);
				}

			
		
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return list;
		
		
	}
	
	
	
	public static void main(String[] args) {
		RobotTraitement robotTraitement = new RobotTraitement();
		
		List<Box> list = robotTraitement.remplir("12345678933333348484854");
		for(Box b : list){
			System.out.println(b.getEtiquette() +" --> "+b.getCapacity());
		}
		
	}

}
