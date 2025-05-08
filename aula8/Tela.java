package aula8;

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
	PessoaDao pdao = new PessoaDao();
	
	JFrame tela = new JFrame("CADASTRO DE PESSOAS");
	JPanel painel = new JPanel();
	
	JTextField txtcod = new JTextField();
	JTextField txtnome = new JTextField();
	JTextField txtidade = new JTextField();
	JTextField txtsal = new JTextField();
	
	JLabel lbcod = new JLabel("Código: ");
	JLabel lbnome = new JLabel("Nome: ");
	JLabel lbid = new JLabel("Idade: ");
	JLabel lbsal = new JLabel("Salário: ");
	
	JButton btsalvar = new JButton("Salvar");
	JButton btlistar= new JButton("Listar");
	JButton btalterar = new JButton("Alterar");
	JButton btpesq = new JButton("Pesquisar");
	JButton btexcluir = new JButton("Excluir");
	
	void criarTela() {
		tela.setSize(500, 400);
		tela.setLocation(200, 200);
		painel.setLayout(null);
		
		lbcod.setBounds(20, 20, 100, 30);
		txtcod.setBounds(100, 20, 150, 30);
		txtcod.disable();
		btpesq.setBounds(300, 20, 100, 30);
		btpesq.disable();
		btpesq.addActionListener(this);//ação
		lbnome.setBounds(20, 70, 100, 30);
		txtnome.setBounds(100, 70, 150, 30);
		lbid.setBounds(20, 120, 100, 30);
		txtidade.setBounds(100, 120, 150, 30);
		lbsal.setBounds(20, 170, 100, 30);
		txtsal.setBounds(100, 170, 150, 30);
		
		btsalvar.setBounds(30, 250, 100, 30);
		btsalvar.addActionListener(this);//ação
		btlistar.setBounds(140, 250, 100, 30);
		btlistar.addActionListener(this);//ação
		btalterar.setBounds(250, 250, 100, 30);
		btalterar.addActionListener(this);//ação
		btexcluir.setBounds(360, 250, 100, 30);
		btexcluir.addActionListener(this);//ação
		
		painel.add(lbcod);
		painel.add(txtcod);
		painel.add(btpesq);
		painel.add(txtnome);
		painel.add(lbnome);
		painel.add(lbid);
		painel.add(txtidade);
		painel.add(lbsal);
		painel.add(txtsal);
		painel.add(btsalvar);
		painel.add(btlistar);
		painel.add(btalterar);
		painel.add(btexcluir);
		
		tela.getContentPane().add(painel);
		tela.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Tela t = new Tela();
		t.criarTela();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btsalvar) {
			
			String n = txtnome.getText();
			Integer i = Integer.valueOf(txtidade.getText());
			Double s = Double.valueOf(txtsal.getText());
			
			pes = new Pessoa(n, i, s);
			pdao.salvar(pes);
			JOptionPane.showMessageDialog(null, "Objeto salvo com sucesso !");
			
			txtcod.enable();
			btpesq.enable();
			
			txtnome.setText("");
			txtidade.setText("");
			txtsal.setText("");
		}//fim do salvar
		
		if(e.getSource() == btlistar) {
			pdao.listar();
		}
		
		if(e.getSource() == btpesq) {
			int x = Integer.valueOf(txtcod.getText());
			pes = new Pessoa();
			pes = pdao.buscar(x);
			
			txtnome.setText(pes.getNome());
			txtidade.setText(String.valueOf(pes.getIdade()));
			txtsal.setText(String.valueOf(pes.getSalario()));
		}
		
		if(e.getSource() == btalterar) {
			
			int z = Integer.valueOf(txtcod.getText());
			
			String n = txtnome.getText();
			Integer i = Integer.valueOf(txtidade.getText());
			Double s = Double.valueOf(txtsal.getText());
			
			pes = new Pessoa(n, i, s);
			pdao.alterar(z, pes);
			JOptionPane.showMessageDialog(null, "Objeto alterado com sucesso !");
			txtnome.setText("");
			txtidade.setText("");
			txtsal.setText("");
		}
		
		if(e.getSource() == btexcluir) {
			
			int z = Integer.valueOf(txtcod.getText());
			
			pdao.excluir(z);
			JOptionPane.showMessageDialog(null, "Objeto excluído com sucesso !");
			txtnome.setText("");
			txtidade.setText("");
			txtsal.setText("");
		}
	}
}
