package br.com.fiap.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate dataNascimento;
	private String numeroCPF;
	private String numeroRG;
	private String digitoRG;
	private LocalDateTime dataCadastro = LocalDateTime.now();
	private String imagePath;
	
	
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNumeroRG() {
		return numeroRG;
	}
	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}
	public String getDigitoRG() {
		return digitoRG;
	}
	public void setDigitoRG(String digitoRG) {
		this.digitoRG = digitoRG;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	@Override
	public String toString() {
		return "Nome do Visitante: " + name + ", Data Nascimento: " + dataNascimento + ", Número CPF: " + numeroCPF + ", Número RG: " + numeroRG + ", Dígito RG: " + digitoRG + ", Data Cadastro: " + dataCadastro;
	}
	
	

}
