package view;

import controller.ProdutoController;
import model.Produto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class TelaProduto extends JFrame {
    private JTextField txtId, txtNome, txtCategoria, txtPreco, txtQuantidade;
    private JButton btnCadastrar, btnAlterar, btnRemover, btnBuscar, btnLimpar;
    private JTable tblProdutos;
    private DefaultTableModel tableModel;
    private ProdutoController controller;

    public TelaProduto() {
        controller = new ProdutoController();
        configurarTela();
    }

    private void configurarTela() {
        setTitle("Cadastro de Produtos");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // PAINEL DE FORMULÁRIO
        JPanel panelForm = new JPanel(new GridLayout(5, 2, 5, 5));
        panelForm.setBorder(BorderFactory.createTitledBorder("Dados do Produto"));

        panelForm.add(new JLabel("ID:"));
        txtId = new JTextField();
        panelForm.add(txtId);

        panelForm.add(new JLabel("Nome:"));
        txtNome = new JTextField();
        panelForm.add(txtNome);

        panelForm.add(new JLabel("Categoria:"));
        txtCategoria = new JTextField();
        panelForm.add(txtCategoria);

        panelForm.add(new JLabel("Preço:"));
        txtPreco = new JTextField();
        panelForm.add(txtPreco);

        panelForm.add(new JLabel("Quantidade:"));
        txtQuantidade = new JTextField();
        panelForm.add(txtQuantidade);

        // PAINEL DE BOTÕES
        JPanel panelBotoes = new JPanel(new FlowLayout());
        btnCadastrar = new JButton("Cadastrar");
        btnBuscar = new JButton("Buscar (ID)");
        btnAlterar = new JButton("Alterar");
        btnRemover = new JButton("Remover (ID)");
        btnLimpar = new JButton("Limpar Campos");

        panelBotoes.add(btnCadastrar);
        panelBotoes.add(btnBuscar);
        panelBotoes.add(btnAlterar);
        panelBotoes.add(btnRemover);
        panelBotoes.add(btnLimpar);

        JPanel panelNorte = new JPanel(new BorderLayout());
        panelNorte.add(panelForm, BorderLayout.CENTER);
        panelNorte.add(panelBotoes, BorderLayout.SOUTH);

        add(panelNorte, BorderLayout.NORTH);

        // TABELA
        String[] colunas = {"ID", "Nome", "Categoria", "Preço", "Qtd"};
        tableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        tblProdutos = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tblProdutos);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Lista de Produtos"));
        add(scrollPane, BorderLayout.CENTER);

        // EVENTOS
        btnCadastrar.addActionListener(e -> cadastrar());
        btnBuscar.addActionListener(e -> buscar());
        btnAlterar.addActionListener(e -> alterar());
        btnRemover.addActionListener(e -> remover());
        btnLimpar.addActionListener(e -> limparCampos());
        
        // Selecionar linha na tabela e preencher formulário
        tblProdutos.getSelectionModel().addListSelectionListener(e -> {
            int row = tblProdutos.getSelectedRow();
            if (row != -1 && !e.getValueIsAdjusting()) {
                txtId.setText(tableModel.getValueAt(row, 0).toString());
                txtNome.setText(tableModel.getValueAt(row, 1).toString());
                txtCategoria.setText(tableModel.getValueAt(row, 2).toString());
                txtPreco.setText(tableModel.getValueAt(row, 3).toString());
                txtQuantidade.setText(tableModel.getValueAt(row, 4).toString());
            }
        });
    }

    private void cadastrar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText();
            String categoria = txtCategoria.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            int qtd = Integer.parseInt(txtQuantidade.getText());

            if (controller.cadastrar(id, nome, categoria, preco, qtd)) {
                JOptionPane.showMessageDialog(this, "Produto cadastrado!");
                atualizarTabela();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro: ID já existe!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Preencha os campos numéricos corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buscar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            Produto p = controller.buscar(id);
            if (p != null) {
                txtNome.setText(p.getNome());
                txtCategoria.setText(p.getCategoria());
                txtPreco.setText(String.valueOf(p.getPreco()));
                txtQuantidade.setText(String.valueOf(p.getQuantidade()));
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Informe um ID válido para buscar!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterar() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String nome = txtNome.getText();
            String categoria = txtCategoria.getText();
            double preco = Double.parseDouble(txtPreco.getText());
            int qtd = Integer.parseInt(txtQuantidade.getText());

            if (controller.alterar(id, nome, categoria, preco, qtd)) {
                JOptionPane.showMessageDialog(this, "Produto alterado!");
                atualizarTabela();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Preencha os campos numéricos corretamente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void remover() {
        try {
            int id = Integer.parseInt(txtId.getText());
            if (controller.remover(id)) {
                JOptionPane.showMessageDialog(this, "Produto removido!");
                atualizarTabela();
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Produto não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Informe um ID válido para remover!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        List<Produto> produtos = controller.listar();
        for (Produto p : produtos) {
            tableModel.addRow(new Object[]{p.getId(), p.getNome(), p.getCategoria(), p.getPreco(), p.getQuantidade()});
        }
    }

    private void limparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCategoria.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        tblProdutos.clearSelection();
    }
}