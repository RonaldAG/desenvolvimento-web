package br.senac.tads.dsw.springmvcthymeleaf.pojo.model;

public class Cabecalhos {

	private String tituloPagina;
	private String introducao;
	private String educacao;
	private String experiencia;
	private String idiomas;
	private String contatos;
	
	public void setCabecalhoPronto() {
		tituloPagina = "Curriculo Ronald";
		introducao = "Introdução";
		educacao = "Educação";
		experiencia = "Experiência";
		idiomas = "Idiomas";
		contatos = "Contatos";
	}

	
	public String getTituloPagina() {
		return tituloPagina;
	}
	
	public void setTituloPagina(String tituloPagina) {
		this.tituloPagina = tituloPagina;
	}
	
	public String getIntroducao() {
		return introducao;
	}
	
	public void setIntroducao(String introducao) {
		this.introducao = introducao;
	}
	
	public String getEducacao() {
		return educacao;
	}
	
	public void setEducacao(String educacao) {
		this.educacao = educacao;
	}
	
	public String getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	public String getIdiomas() {
		return idiomas;
	}
	
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	
	public String getContatos() {
		return contatos;
	}
	
	public void setContatos(String contatos) {
		this.contatos = contatos;
	}
	
}
