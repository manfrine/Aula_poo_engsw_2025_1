package aula7gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela implements ActionListener{
	
	Pessoa pes;
	JFrame tela = new JFrame("Cadastro de Pessoas");
	JPanel painel = new JPanel();
	
	//labels
	JLabel lbNome = new JLabel("Nome:" );
	JLabel lbidade = new JLabel("Idade:" );
	JLabel lbSal = new JLabel("Salário:" );
	
	//campo texto
	JTextField txtnome = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtsal = new JTextField();
	
	//botões
	JButton btSalvar = new JButton("Salvar");
	JButton btExibir = new JButton("Exibir");
	
	void criarTela() {
		tela.setSize(300, 300); // tam da tela altura x largura
		tela.setLocation(500, 200);// posição
		painel.setLayout(null); // layout padrão
		
		lbNome.setBounds(10, 10, 100, 30);
		txtnome.setBounds(120, 10, 150, 30);
		lbidade.setBounds(10, 60, 100, 30);
		txtidade.setBounds(120, 60, 150, 30);
		lbSal.setBounds(10, 110, 100, 30);
		txtsal.setBounds(120, 110, 150, 30);
		
		btSalvar.setBounds(20, 170, 100, 30);
		btSalvar.addActionListener(this);// ação
		btExibir.setBounds(150, 170, 100, 30);
		btExibir.addActionListener(this);// ação
		
		painel.add(lbNome);
		painel.add(txtnome);
		painel.add(lbidade);
		painel.add(txtidade);
		painel.add(lbSal);
		painel.add(txtsal);
		painel.add(btSalvar);
		painel.add(btExibir);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true); // exibir a tela
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btSalvar) {
			String n = txtnome.getText();
			Integer i = Integer.valueOf(txtidade.getText());
			Double s = Double.valueOf(txtsal.getText());
			
			pes = new Pessoa(i, n, s);
			JOptionPane.showMessageDialog(null, "Objeto Salvo com Sucesso !!");
			
			txtnome.setText("");
			txtidade.setText("");
			txtsal.setText("");
		}
		
		if(e.getSource() == btExibir) {
			JOptionPane.showMessageDialog(null, 
					  "O nome: "+pes.getNome()
					+"\nA idade: "+pes.getIdade()
					+"\nO Salário: R$ "+pes.getValor());
		}
		
		
	}
	
}





