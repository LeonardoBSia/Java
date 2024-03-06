package pjAula1;

import java.util.Iterator;

/**
 * @author Leonardo Sia
 * @data 06/02/2024
 * Classe de Modelagem Conceitual de Produto
 */


public class Produto {
	//Atributos
	
	int codigo;
	String descricao;
	float quantidade;
	
	//Métodos
	public void incluir(int id, String nome, float valor) {
	codigo = id;
	descricao = nome;
	quantidade = valor;
	
	}

	

	public void excluir() {
		//...
	}
	
	public static void main(String [] args) {
		for(int x = 51; x < 177; x++) {
			System.out.println(x);
		}
	}
	
}


