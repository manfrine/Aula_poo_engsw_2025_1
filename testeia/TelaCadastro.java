package testeia;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaCadastro extends JFrame {
    private JTextField txtNome, txtIdade, txtSalario;
    private JRadioButton rbMasculino, rbFeminino;
    private JComboBox<String> cbBairro;
    private JCheckBox chkBD, chkLogica, chkEngenharia, chkWeb;
    private JTable tabela;
    private DefaultTableModel modeloTabela;
    private List<Pessoa> listaPessoas;

    public TelaCadastro() {
        setTitle("Cadastro de Pessoa");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        listaPessoas = new ArrayList<Pessoa>();

        // Painel de entrada de dados
        JPanel panelInputs = new JPanel(new GridLayout(7, 2));
        panelInputs.setBorder(BorderFactory.createTitledBorder("Dados da Pessoa"));

        txtNome = new JTextField();
        txtIdade = new JTextField();
        txtSalario = new JTextField();

        rbMasculino = new JRadioButton("Masculino");
        rbFeminino = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(rbMasculino);
        grupoSexo.add(rbFeminino);

        cbBairro = new JComboBox<String>(new String[]{"Centro", "Zona Sul", "Zona Norte", "Zona Leste", "Zona Oeste"});

        chkBD = new JCheckBox("Banco de Dados");
        chkLogica = new JCheckBox("Lógica de Programação");
        chkEngenharia = new JCheckBox("Engenharia de Software");
        chkWeb = new JCheckBox("Tecnologia Web");

        panelInputs.add(new JLabel("Nome:"));
        panelInputs.add(txtNome);
        panelInputs.add(new JLabel("Idade:"));
        panelInputs.add(txtIdade);
        panelInputs.add(new JLabel("Salário:"));
        panelInputs.add(txtSalario);
        panelInputs.add(new JLabel("Sexo:"));
        JPanel panelSexo = new JPanel();
        panelSexo.add(rbMasculino);
        panelSexo.add(rbFeminino);
        panelInputs.add(panelSexo);
        panelInputs.add(new JLabel("Bairro:"));
        panelInputs.add(cbBairro);
        panelInputs.add(new JLabel("Cursos:"));
        JPanel panelCursos = new JPanel();
        panelCursos.add(chkBD);
        panelCursos.add(chkLogica);
        panelCursos.add(chkEngenharia);
        panelCursos.add(chkWeb);
        panelInputs.add(panelCursos);

        add(panelInputs, BorderLayout.NORTH);

        // Tabela
        modeloTabela = new DefaultTableModel(new String[]{"Nome", "Idade", "Salário", 
        		"Sexo", "Bairro", "Cursos"}, 0);
        tabela = new JTable(modeloTabela);
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        // Botão
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarPessoa();
            }
        });
        add(btnCadastrar, BorderLayout.SOUTH);
    }

    private void cadastrarPessoa() {
        String nome = txtNome.getText();
        int idade;
        double salario;
        try {
            idade = Integer.parseInt(txtIdade.getText());
            salario = Double.parseDouble(txtSalario.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Idade ou salário inválido!");
            return;
        }

        String sexo = rbMasculino.isSelected() ? "Masculino" : rbFeminino.isSelected() ? "Feminino" : "";

        if (sexo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione o sexo!");
            return;
        }

        String bairro = (String) cbBairro.getSelectedItem();

        List<String> cursos = new ArrayList<String>();
        if (chkBD.isSelected()) cursos.add("Banco de Dados");
        if (chkLogica.isSelected()) cursos.add("Lógica de Programação");
        if (chkEngenharia.isSelected()) cursos.add("Engenharia de Software");
        if (chkWeb.isSelected()) cursos.add("Tecnologia Web");

        Pessoa pessoa = new Pessoa(nome, idade, salario, sexo, bairro, cursos);
        listaPessoas.add(pessoa);

        modeloTabela.addRow(new Object[]{nome, idade, salario, sexo, bairro, String.join(", ", cursos)});

        limparCampos();
    }

    private void limparCampos() {
        txtNome.setText("");
        txtIdade.setText("");
        txtSalario.setText("");
        rbMasculino.setSelected(false);
        rbFeminino.setSelected(false);
        cbBairro.setSelectedIndex(0);
        chkBD.setSelected(false);
        chkLogica.setSelected(false);
        chkEngenharia.setSelected(false);
        chkWeb.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastro().setVisible(true));
    }
}
