package br.senac.tads.dsw.springmvcthymeleaf.pojo;

import java.util.ArrayList;
import java.util.List;

import br.senac.tads.dsw.springmvcthymeleaf.pojo.model.Contato;
import br.senac.tads.dsw.springmvcthymeleaf.pojo.model.Educacao;
import br.senac.tads.dsw.springmvcthymeleaf.pojo.model.Experiencia;
import br.senac.tads.dsw.springmvcthymeleaf.pojo.model.Idioma;
import br.senac.tads.dsw.springmvcthymeleaf.pojo.model.Introducao;

public class Curriculo{

	private Introducao introducao;
	private Educacao educacao;
	private List<Experiencia> experiencia;
	private Idioma idioma;
	private List<Contato> contatos;
	
	public Curriculo() {
		introducao = new Introducao();
		educacao = new Educacao();
		experiencia = new ArrayList<>();
		idioma = new Idioma();
		contatos = new ArrayList<>();
	}
	
	public void setCurriculoPronto() {
		introducao.setName("Ronald Amorim Garcia");
		introducao.setSubtitle("Programador Java");
		introducao.setQuote("Take one thing at a time");
		introducao.setDescription("Sou programador backend com mais de 4 meses de experiência em criação de serviços visando transações bancárias, \r\n"
				+ "            utilizando tecnologias variadas como Jakarta EE (JMS, EJB, JPA), Spring MVC, Oracle DB, MariaDB, WebSphere, MQ e Gitlab/Git.  \r\n"
				+ "            Apaixonado por novos desafios e soluções de problemas, participei da manutenção de aplicações escaláveis que são acionadas mais de um milhão de vezes ao dia.");
		
		
		
		educacao.setTitle("Centro Universitário Senac");
		educacao.setSubtitle("Tecnólogo em Análise e Desenvolvimento de Sistemas");
		educacao.setModel("Presencial");
		educacao.setTime("Jan 2022 - Jun 2024");
		
		Experiencia xp1 = new Experiencia();
		xp1.setTitle("Estagiário em Transações Online");
		xp1.setModel("Hibrido");
		xp1.setSubtitle("Tecnologia Bancária - TecBan");
		xp1.setTime("Mar 2023 - Presente");
		xp1.setDescription("Colaboro no setor de transações online em que sou responsável por desenvolver soluções de software para tratar novas transações entre instituições.\r\n"
				+ "Nesse sentido, participei do desenvolvimento de softwares altamente escaláveis que suportam milhões de requisições.");
		experiencia.add(xp1);
		
		idioma.setTitle("Wizard By Pearson");
		idioma.setDescription("Inglês intermediário");
		idioma.setTime("Jan 2018 - Presente");
		idioma.setModel("Presencial");
		
		
		contatos.add(new Contato("Email", "ronald_amorim1@outlook.com"));
		contatos.add(new Contato("Telefone", "(+55) 11 98370-2899"));
		contatos.add(new Contato("Linkedin", "https://www.linkedin.com/in/ronald-amorim-garcia"));
		contatos.add(new Contato("Github", "https://www.github.com/RonaldAG"));
		
	}

	public Introducao getIntroducao() {
		return introducao;
	}

	public void setIntroducao(Introducao introducao) {
		this.introducao = introducao;
	}

	public Educacao getEducacao() {
		return educacao;
	}

	public void setEducacao(Educacao educacao) {
		this.educacao = educacao;
	}

	public List<Experiencia> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(List<Experiencia> experiencia) {
		this.experiencia = experiencia;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
}
