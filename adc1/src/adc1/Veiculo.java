package adc1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Veiculo extends JFrame implements ActionListener{

	JButton btCadastrar, btAlterar, btExcluir, btPesquisar, btLimpar, btSair;
	JTextField txtPlaca, txtModelo, txtAno, txtData, txtValor;	
	JLabel lbPlaca, lbModelo, lbAno, lbData, lbValor, lbFabricante;
	JPanel pnCampos, pnCampos2, pnCampos3, pnBotoes;
	JComboBox<String> cmbFabricante = new JComboBox<>();
	public Veiculo() {
		super("Controle de Frota - Cadastro de Veículos");
		setSize(600, 300);
		setLayout(new BorderLayout());
		
	
		txtPlaca = new JTextField(69);
		txtModelo = new JTextField(69);
		cmbFabricante = new JComboBox<String>();
		cmbFabricante.addItem("CHEVROLET");
		cmbFabricante.addItem("FORD");
		cmbFabricante.addItem("FERRARI");
		cmbFabricante.addItem("VOLKSWAGEN");
		cmbFabricante.addItem("FIAT");
		txtAno = new JTextField(69);
		txtData = new JTextField("21/03/2024", 69);
		txtValor = new JTextField(69);
		
		lbPlaca = new JLabel("Placa");
		lbModelo = new JLabel("Modelo");
		lbAno = new JLabel("Ano");
		lbData = new JLabel("Data Compra");
		lbValor = new JLabel("Valor (R$)");
		lbFabricante = new JLabel("Fabricante");
		btCadastrar = new JButton("Cadastrar");
		btAlterar = new JButton("Alterar");
		btExcluir = new JButton("Excluir");
		btPesquisar = new JButton("Pesquisar");
		btLimpar = new JButton("Limpar");
		btSair = new JButton("Sair");
		
		
		pnCampos = new JPanel(new GridLayout(3, 4, 12, 2));
		pnBotoes = new JPanel(new FlowLayout());
		
		// 3 Passo adicionar objeto a tela
		pnCampos.add(lbPlaca);
		pnCampos.add(txtPlaca);
		pnCampos.add(lbFabricante);
		pnCampos.add(cmbFabricante);
		pnCampos.add(lbModelo);
		pnCampos.add(txtModelo);
		pnCampos.add(lbAno);
		pnCampos.add(txtAno);
		pnCampos.add(lbData);
		pnCampos.add(txtData);
		pnCampos.add(lbValor);
		pnCampos.add(txtValor);
		
		pnBotoes.add(btCadastrar);
		btSair.addActionListener(this);
		pnBotoes.add(btAlterar).setEnabled(false);
		pnBotoes.add(btExcluir).setEnabled(false);
		pnBotoes.add(btPesquisar);
		pnBotoes.add(btLimpar);
		btLimpar.addActionListener(this);
		pnBotoes.add(btSair);
		
		add(pnCampos, new BorderLayout().NORTH);
		add(pnBotoes, new BorderLayout().SOUTH);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Veiculo form = new Veiculo();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == txtModelo){
		txtModelo.setText(txtModelo.getText().toUpperCase());
		}
		if(evento.getSource() == btCadastrar){
		
		}
		if(evento.getSource() == btAlterar){
			
		}
		if(evento.getSource() == btExcluir){
			
		}
		if(evento.getSource() == btPesquisar){
			
		}
		if(evento.getSource() == btLimpar){
			txtPlaca.setText("");
			txtModelo.setText("");
			txtAno.setText("");
			txtData.setText("");
			txtValor.setText("");
			
			txtPlaca.requestFocus();
			
		}
		if(evento.getSource() == btSair){
				System.exit(0);
		}
	}
	
}