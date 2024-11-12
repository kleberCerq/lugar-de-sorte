package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class TelaInscricaoSorteio extends JFrame {

    public TelaInscricaoSorteio() {
        setTitle("Inscrição em Sorteios");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

        JLabel lblInfo = new JLabel("Inscreva-se nos sorteios disponíveis", SwingConstants.CENTER);
        lblInfo.setFont(new Font("Arial", Font.BOLD, 18));
        painel.add(lblInfo, BorderLayout.NORTH);

        // Exemplo de área onde sorteios poderiam ser listados
        JTextArea areaSorteios = new JTextArea(10, 30);
        areaSorteios.setText("Lista de sorteios disponíveis...");
        areaSorteios.setEditable(false);

        painel.add(new JScrollPane(areaSorteios), BorderLayout.CENTER);

        add(painel);
    }
}
