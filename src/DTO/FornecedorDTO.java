/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Hector
 */
public class FornecedorDTO {
    String nome_fornecedor,endereco_fornecedor,email_fornecedor;
int cnpj_fornecedor,telefone_fornecedor;
public String getNome_fornecedor() {
	return nome_fornecedor;
}
public void setNome_fornecedor(String nome_fornecedor) {
	this.nome_fornecedor = nome_fornecedor;
}
public String getEndereco_fornecedor() {
	return endereco_fornecedor;
}
public void setEndereco_fornecedor(String endereco_fornecedor) {
	this.endereco_fornecedor = endereco_fornecedor;
}
public String getEmail_fornecedor() {
	return email_fornecedor;
}
public void setEmail_fornecedor(String email_fornecedor) {
	this.email_fornecedor = email_fornecedor;
}
public int getCnpj_fornecedor() {
	return cnpj_fornecedor;
}
public void setCnpj_fornecedor(int cnpj_fornecedor) {
	this.cnpj_fornecedor = cnpj_fornecedor;
}
public int getTelefone_fornecedor() {
	return telefone_fornecedor;
}
public void setTelefone_fornecedor(int telefone_fornecedor) {
	this.telefone_fornecedor = telefone_fornecedor;
}
}