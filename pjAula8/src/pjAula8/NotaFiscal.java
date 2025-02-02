package pjAula8;

import java.util.List;

/**
 * Modelagem COnceitual de Nota Fiscal
 * @author Leonardo Bertogna Sia
 * @data 02/04/2024
 */

public class NotaFiscal {
	//Artibutos Estáticos
	public static int sequencia = 1;
	public static double cambio;
	
	//Atributos
	private int numero;
	private String fornecedor;
	private double total;
	private List<NotaFiscalItem> itens;
	
	//Método Construtor
	public NotaFiscal() {
		this.numero = sequencia++;
	}
	
	//Métodos Getters and Setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public List<NotaFiscalItem> getItens() {
		return itens;
	}
	public void setItens(List<NotaFiscalItem> itens) {
		this.itens = itens;
	}
	
	
	
}
