/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Hector
 */
public class ClientesDTO {
    String nome_cliente,endereco_cliente,email_cliente;
int id_cliente,cpfcnpj_cliente,telefone_cliente;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

public String getNome_cliente() {
	return nome_cliente;
}
public void setNome_cliente(String nome_cliente) {
	this.nome_cliente = nome_cliente;
}
public String getEndereco_cliente() {
	return endereco_cliente;
}
public void setEndereco_cliente(String endereco_cliente) {
	this.endereco_cliente = endereco_cliente;
}
public String getEmail_cliente() {
	return email_cliente;
}
public void setEmail_cliente(String email_cliente) {
	this.email_cliente = email_cliente;
}
public int getCpfcnpj_cliente() {
	return cpfcnpj_cliente;
}
public void setCpfcnpj_cliente(int cpfcnpj_cliente) {
	this.cpfcnpj_cliente = cpfcnpj_cliente;
}
public int getTelefone_cliente() {
	return telefone_cliente;
}
public void setTelefone_cliente(int telefone_cliente) {
	this.telefone_cliente = telefone_cliente;
}
}
