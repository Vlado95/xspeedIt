package com.xspeedid.models;

import java.util.*;

public class Box {
	private String etiquette;
	private int capacity;
	private List<Integer> article = new ArrayList<Integer>();
	public String getEtiquette() {
		return etiquette;
	}
	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<Integer> getArticle() {
		return article;
	}
	public void setArticle(List<Integer> article) {
		this.article = article;
	} 
	
	

}
