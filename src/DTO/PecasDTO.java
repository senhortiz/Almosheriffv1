/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Hector
 */
public class PecasDTO {
    private int codigo_pecas,quantidade;
	private String nome_pecas,unidade,localizacao,fabricante;
	private double valor;
	
	
	public int getCodigo_pecas() {
		return codigo_pecas;
	}
	public void setCodigo_pecas(int codigo_pecas) {
		this.codigo_pecas = codigo_pecas;
	}
	public String getNome_pecas() {
		return nome_pecas;
	}
	public void setNome_pecas(String nome_pecas) {
		this.nome_pecas = nome_pecas;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
}
