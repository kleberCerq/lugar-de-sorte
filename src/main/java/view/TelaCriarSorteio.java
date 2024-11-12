package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import model.Sorteios;

public class TelaCriarSorteio extends JFrame {

    // Componentes da interface gráfica
    private JTextField campoNome;
    private JTextArea campoDescricao;
    private final JButton btnCriarSorteio;

    public TelaCriarSorteio() {
        // Configurações da janela
        setTitle("Criar Sorteio");
        setSize(500, 400); // Aumentando o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Janela no centro da tela
        
        // Layout para a tela
        setLayout(new BorderLayout(20, 20)); // Adicionando espaçamento entre os componentes
        
        // Painel para os campos de entrada
        JPanel painelCampos = new JPanel();
        painelCampos.setLayout(new GridLayout(3, 2, 10, 10)); // Ajustando o espaçamento entre os campos
        painelCampos.setBackground(Color.white); // Cor de fundo do painel
        
        // Definindo os labels e os campos de texto
        JLabel lblNome = new JLabel("Nome do Sorteio:");
        lblNome.setFont(new Font("Arial", Font.BOLD, 14)); // Alterando a fonte do label
        campoNome = new JTextField(20);
        campoNome.setFont(new Font("Arial", Font.PLAIN, 14)); // Alterando a fonte do campo
        campoNome.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Borda no campo
        
        JLabel lblDescricao = new JLabel("Descrição do Sorteio:");
        lblDescricao.setFont(new Font("Arial", Font.BOLD, 14)); // Alterando a fonte do label
        campoDescricao = new JTextArea(5, 20);
        campoDescricao.setWrapStyleWord(true);
        campoDescricao.setLineWrap(true);
        campoDescricao.setFont(new Font("Arial", Font.PLAIN, 14)); // Alterando a fonte do campo
        campoDescricao.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1)); // Borda no campo
        
        // Botão de criação do sorteio
        btnCriarSorteio = new JButton("Criar Sorteio");
        btnCriarSorteio.setFont(new Font("Arial", Font.BOLD, 16)); // Alterando a fonte do botão
        btnCriarSorteio.setBackground(new Color(70, 130, 180)); // Cor de fundo do botão
        btnCriarSorteio.setForeground(Color.white); // Cor da fonte do botão
        btnCriarSorteio.setFocusPainted(false); // Remove o foco quando clicado

        // Adicionando os componentes no painel
        painelCampos.add(lblNome);
        painelCampos.add(campoNome);
        painelCampos.add(lblDescricao);
        painelCampos.add(new JScrollPane(campoDescricao)); // Adiciona a rolagem no campo de descrição
        painelCampos.add(new JLabel()); // Espaço vazio
        painelCampos.add(btnCriarSorteio);

        // Adicionando painel de campos à tela
        add(painelCampos, BorderLayout.CENTER);
        
        // Adicionando um painel de cabeçalho com título
        JPanel painelCabecalho = new JPanel();
        painelCabecalho.setBackground(new Color(70, 130, 180));
        JLabel titulo = new JLabel("Criação de Sorteios");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.white);
        painelCabecalho.add(titulo);
        add(painelCabecalho, BorderLayout.NORTH);
        
        // Ação do botão "Criar Sorteio"
        btnCriarSorteio.addActionListener(e -> {
            String nome = campoNome.getText();
            String descricao = campoDescricao.getText();

            if (!nome.isEmpty() && !descricao.isEmpty()) {
                Sorteios novoSorteio = new Sorteios();
                novoSorteio.setDescricao(descricao);
                novoSorteio.setDataRealizacao(new Date());
                System.out.println("Sorteio criado com sucesso!");
                System.out.println("Nome: " + nome);
                System.out.println("Descrição: " + descricao);
                
                // Aqui você pode adicionar o novo sorteio à sua lista de sorteios ou ao sistema
            } else {
                JOptionPane.showMessageDialog(TelaCriarSorteio.this, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        // Exibindo a tela
        SwingUtilities.invokeLater(() -> new TelaCriarSorteio().setVisible(true));
    }
}
