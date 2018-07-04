package com.xspeedid.robot;

import java.util.List;

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
	public Integer addInBox(Box box, Integer article) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> intToArrayInt(Integer articles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createEtiquette(List boxArticles) {
		// TODO Auto-generated method stub
		return null;
	}
}
