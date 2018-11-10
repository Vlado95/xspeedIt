package com.xspeedid.models;

import java.util.*;

public class Box {
	private String etiquette;
	Integer capacity;
	private List<Integer> article = new ArrayList<Integer>();
	
	
	public Box() {
		super();
	}
	public Box(Integer capacity) {
		super();
		this.capacity = capacity;
	}
	public String getEtiquette() {
		return etiquette;
	}
	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public List<Integer> getArticle() {
		return article;
	}
	public void setArticle(List<Integer> article) {
		this.article = article;
	} 
	
	

}
