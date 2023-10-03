package br.senac.tads.dsw.springmvcthymeleaf.pojo.model;

public class Contato {

	private String title;
	private String link;
	
	public Contato() {
	}
	
	public Contato(String title, String link) {
		super();
		this.title = title;
		this.link = link;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	
	
}
