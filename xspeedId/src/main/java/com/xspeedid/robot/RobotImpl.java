package com.xspeedid.robot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.xspeedid.models.Box;

public class RobotImpl implements IRobot {

	@Override
	public Integer getClosest(List<Integer> articleList, Integer article) {
		   if(articleList.size() !=0) {
			   //Integer vi=articleList.get(0);
			   Integer res = 0;
			   Integer art = Math.abs(articleList.get(0)-article);
			   for(Integer arti : articleList) {
				   Integer ar = Math.abs(arti-article);
				   if(ar<=art & arti <= article) {
					   art = ar;
					   res= arti;
				   }
			   }
		        return res;
		   }
		return 0;
	}

	@Override
	public Box addInBox(Box box, Integer article) {
		List<Integer> articles = new ArrayList<Integer>();
		if(box.getCapacity() >=article){
			articles.add(article);
			box.getArticle().add(article);//(articles);
			//int sum = box.getArticle().stream().collect(Collectors.summingInt(Integer::intValue));
			box.setCapacity(box.getCapacity()-article);
			
			box =createBoxEtiquette(box);
//		    StringBuilder sb = new StringBuilder();
//		    for (Integer x : box.getArticle()) {
//		        sb.append(x.toString());
//		    }
//		    box.setEtiquette(sb.toString());
		}
		return box;
	}

	@Override
	public List<Integer> intToArrayInt(String articles) {
		List<Integer> digits = new ArrayList<Integer>();
	    for(int i = 0; i < articles.length(); i++) {
	        Integer j = Character.digit(articles.charAt(i), 10);
	        if(j==-1){
	        	throw new NumberFormatException("mauvaise format d'article");
	        }
	        digits.add(j);
	    }
	    Collections.sort(digits,Collections.reverseOrder());
		return digits;
	}

	@Override
	public String createEtiquette(List<Box> boxArticles) {
		 StringBuilder sb = new StringBuilder();
		 String s;
		 sb.append(boxArticles.get(0).getEtiquette());
		   for (int i =1 ;i < boxArticles.size(); i++) {
			   sb.append("/"+boxArticles.get(i).getEtiquette());
		    }
		s = sb.toString();
		return s;
	}

	@Override
	public Box createBoxEtiquette(Box box) {
		    StringBuilder sb = new StringBuilder();
		    for (Integer x : box.getArticle()) {
		        sb.append(x.toString());
		    }
		    box.setEtiquette(sb.toString());
		return box;
	}
}
