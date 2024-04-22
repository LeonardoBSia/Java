package br.unisal.modelagem;

public class AlterarProduto {
	public static boolean alterar(String[] produtos, String codigo, String novoProduto) {
		for (int i = 0; i < produtos.length; i++) {
			if (produtos[i] != null && produtos[i].toString().equalsIgnoreCase(codigo)) {
				produtos[i] = novoProduto;
					return true;
				}
			}
			return false;
		}
}

