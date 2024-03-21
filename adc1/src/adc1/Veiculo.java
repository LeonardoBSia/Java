package adc1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Veiculo extends JFrame implements ActionListener{
	
	private JTextField txtPlaca, txtModelo, txtAno, txtValor, txtFabricante, txtCompra;
	private Label lbRotulo1, lbRotulo2, lbRotulo3, lbRotulo4, lbRotulo5, lbRotulo6;
	private Button btCadastrar, btAlterar, btExcluir, btPesquisar, btLimpar, btSair;
	private JPanel pTexto, pBotoes;
	private GridLayout grid;
	
	
	public Veiculo() {
		
		super ("Controle de Frota - Cadastro de Veículos");
		setSize(600,300);
		getContentPane().setLocation(400,400);
		getContentPane().setLayout(new BorderLayout(5,5));
		
		grid = new GridLayout(1,2,5,5);
		
		txtPlaca = new JTextField (10);
		txtModelo = new JTextField(10);
		txtAno = new JTextField(10);
		txtValor = new JTextField(10);
		txtFabricante = new JTextField(10);
		lbRotulo1 = new Label("Placa");
		lbRotulo2 = new Label("Modelo");
		//lbRotulo3 = new Label("Data Compra");
		lbRotulo4 = new Label("Ano");
		lbRotulo5 = new Label("Fabricante");
		lbRotulo6 = new Label("Valor");
		btCadastrar = new Button ("Cadastrar");
		btAlterar = new Button ("Alterar");
		btExcluir = new Button ("Excluir");
		btPesquisar = new Button ("Pesquisar");
		btLimpar = new Button ("Limpar");		
		btSair = new Button ("Sair");
		pTexto = new JPanel();
		pBotoes = new JPanel();
		
		pTexto.add(lbRotulo1);
		pTexto.add(txtPlaca);
		pTexto.add(lbRotulo2);								
		pTexto.add(txtModelo);
		//pTexto.add(lbRotulo3);
		//pTexto.add(txtCompra);
		pTexto.add(lbRotulo4);
		pTexto.add(txtFabricante);
		pTexto.add(lbRotulo5);
		pTexto.add(txtAno);
		pTexto.add(lbRotulo6);
		pTexto.add(txtValor);
		
		txtPlaca.addActionListener(this);
		txtModelo.addActionListener(this);
		//txtCompra.addActionListener(this);
		txtAno.addActionListener(this);
		txtValor.addActionListener(this);
		txtFabricante.addActionListener(this);
		
		btCadastrar.addActionListener(this);
		btAlterar.addActionListener(this);
		btExcluir.addActionListener(this);
		btPesquisar.addActionListener(this);
		btLimpar.addActionListener(this);					
		btSair.addActionListener(this);
		
		pBotoes.add(btCadastrar);
		pBotoes.add(btAlterar);
		pBotoes.add(btExcluir);
		pBotoes.add(btPesquisar);
		pBotoes.add(btLimpar);
		pBotoes.add(btSair);
		
		
		//definição do cursor quando o mesmo estiver sobre o painel pBotoes
		pBotoes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		pBotoes.setLayout(grid);
				
		getContentPane().add(pTexto,BorderLayout.CENTER);
		getContentPane().add(pBotoes,BorderLayout.SOUTH);
					
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		Veiculo form = new Veiculo();
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
	
