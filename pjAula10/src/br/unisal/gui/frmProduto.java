package br.unisal.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.unisal.modelagem.Produto;
import br.unisal.modelagem.Situacao;
import br.unisal.modelagem.UnidadeMedida;

public class frmProduto extends JFrame implements ActionListener{
	
	JLabel lbCodigo, lbDescricao, lbUnidadeMedida, lbLargura, lbComprimento, lbSituacao, lbLocalizacao;
	JTextField txtCodigo, txtDescricao, txtLargura, txtComprimento, txtLocalizacao;
	JComboBox cbxUnidadeMedida, cbxSituacao;
	JPanel pnCampos, pnBotoes;
	JButton btnInclui, btnExclui, btnAltera, btnPesquisa, btnLimpa;
	List<Produto>bdProduto = new ArrayList<Produto>();
	
	public frmProduto(){
		super("Cadastro de Produto");
		setSize(500, 250);
		setLayout (new BorderLayout());
		
		//2 Passo Construir os obejtos
		lbCodigo = new JLabel("Código");
		lbDescricao = new JLabel("Descrição");
		lbUnidadeMedida = new JLabel("UN. Medida");
		lbLargura = new JLabel ("Largura");
		lbComprimento = new JLabel ("Comprimento");
		lbSituacao = new JLabel ("Situação");
		lbLocalizacao = new JLabel ("Localização");
		
		txtCodigo = new JTextField();
		txtDescricao = new JTextField();
		txtLargura = new JTextField();
		txtComprimento = new JTextField();
		txtLocalizacao = new JTextField();
		cbxSituacao = new JComboBox<Situacao> (Situacao.values());
		cbxUnidadeMedida = new JComboBox<String> (UnidadeMedida.getUnidades());
		
		btnInclui = new JButton ("Incluir");
		btnAltera = new JButton ("Alterar");
		btnExclui = new JButton ("Excluir");
		btnPesquisa = new JButton ("Pesquisar");
		btnLimpa = new JButton ("Limpar");
		
		pnCampos = new JPanel (new GridLayout (7,2));
		pnBotoes = new JPanel (new GridLayout (1,4));
		
		pnCampos.add(lbCodigo);
		pnCampos.add(txtCodigo);
		
		//3 Passo adicionar os campos ao Frame
		
		pnCampos.add(lbCodigo);
		pnCampos.add(txtCodigo);
		pnCampos.add(lbDescricao);
		pnCampos.add(txtDescricao);
		pnCampos.add(lbUnidadeMedida);
		pnCampos.add(cbxUnidadeMedida);
		pnCampos.add(lbLargura);
		pnCampos.add(txtLargura);
		pnCampos.add(lbComprimento);
		pnCampos.add(txtComprimento);
		pnCampos.add(lbSituacao);
		pnCampos.add(cbxSituacao);
		pnCampos.add(lbLocalizacao);
		pnCampos.add(txtLocalizacao);
		
		add(pnCampos, BorderLayout.CENTER);
		
		pnBotoes.add(btnInclui);
		pnBotoes.add(btnAltera);
		pnBotoes.add(btnExclui);
		pnBotoes.add(btnPesquisa);
		pnBotoes.add(btnLimpa);
		
		add(pnBotoes, BorderLayout.SOUTH);
		
		//4 Passo incluir os elemntos no Listener de Ações
		btnInclui.addActionListener(this);
		btnAltera.addActionListener(this);
		btnExclui.addActionListener(this);
		btnPesquisa.addActionListener(this);
		btnLimpa.addActionListener(this);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == btnInclui) {
			 Produto p= instanciar();
			 if(p != null) {
				 bdProduto.add(p);
			 }
			}
		 if(e.getSource() == btnAltera) {
			 for(Produto p : bdProduto) {
				 if(p.getCodigo()== p.getCodigo()) {
					 Produto objeto = instanciar();
					 if(objeto != null) {
						 p = objeto;
					 }


				 }
			 }

			 
					
				}else {
					if (e.getSource()==btnLimpa){ //pressionado btLimpar
		 
						txtCodigo.setText("");
						txtDescricao.setText("");	
						txtLargura.setText("");
						txtComprimento.setText("");
						txtLocalizacao.setText("");
						//TODO
						//comando para dar foco ao objeto
						txtCodigo.requestFocus();
						
			 }
				}
				
		 System.out.println(bdProduto);
		 }
	
	
	private Produto instanciar(){
		Produto p = new Produto();
		try {
		p.setCodigo(Integer.parseInt(txtCodigo.getText()));
	}catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Código do Produto Inválido", "Validação", JOptionPane.ERROR_MESSAGE);
		
		return null;
		}
		p.setDescricao(txtDescricao.getText());
		p.setUn(UnidadeMedida.values()[
			cbxUnidadeMedida.getSelectedIndex()]);
	try {
		p.setLargura(Integer.parseInt(txtLargura.getText()));
	}catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Largura do Produto Inválido", "Validação", JOptionPane.ERROR_MESSAGE);
		
		return null;
	}
	
	try {
		p.setComprimento(Integer.parseInt(txtComprimento.getText()));
	}catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Comprimento do Produto Inválido", "Validação", JOptionPane.ERROR_MESSAGE);
		
		return null;
	}
	p.setSituacao(Situacao.values()[cbxSituacao.getSelectedIndex()]);
	p.setLocalizacao(txtLocalizacao.getText());
	return p;
	
}
	

	public static void main(String[] args) {
		frmProduto frm = new frmProduto();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
}
}