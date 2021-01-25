package io.javabrains.moviecatalogservice.modelos;

public class CatalogItem {
	
	private String title;
	private String desc;
	private Integer rating;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
	public CatalogItem(String title, String desc, Integer rating) {
		super();
		this.title = title;
		this.desc = desc;
		this.rating = rating;
	}
	
	

}
