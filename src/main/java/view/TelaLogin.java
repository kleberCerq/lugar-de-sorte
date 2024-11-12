package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TelaLogin extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JComboBox<String> tipoUsuarioCombo;
    private JButton btnLogin;

    public TelaLogin() {
        setTitle("Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(20, 20));

        // Painel principal
        JPanel painel = new JPanel(new GridLayout(4, 2, 10, 10));
        painel.setBackground(Color.white);

        // Componentes da tela de login
        JLabel lblUsuario = new JLabel("Usuário:");
        campoUsuario = new JTextField(20);

        JLabel lblSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField(20);

        JLabel lblTipoUsuario = new JLabel("Tipo de Usuário:");
        tipoUsuarioCombo = new JComboBox<>(new String[] {"Comum", "Empresa/CNPJ"}); // Opções do tipo de usuário

        btnLogin = new JButton("Entrar");

        painel.add(lblUsuario);
        painel.add(campoUsuario);
        painel.add(lblSenha);
        painel.add(campoSenha);
        painel.add(lblTipoUsuario);
        painel.add(tipoUsuarioCombo);
        painel.add(new JLabel()); // Espaço vazio
        painel.add(btnLogin);

        add(painel, BorderLayout.CENTER);

        // Ação do botão de login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoUsuario = (String) tipoUsuarioCombo.getSelectedItem();

                // Fecha a tela de login
                dispose();

                // Verifica o tipo de usuário e abre a tela correta
                if ("Empresa/CNPJ".equals(tipoUsuario)) {
                    new TelaCriarSorteio().setVisible(true); // Acesso para empresas
                } else if ("Comum".equals(tipoUsuario)) {
                    new TelaInscricaoSorteio().setVisible(true); // Acesso para usuários comuns
                }
            }
        });
    }

    // Método main para iniciar a aplicação com a tela de login
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaLogin().setVisible(true));
    }
}
