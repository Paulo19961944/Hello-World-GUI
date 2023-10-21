package com.github.www.HelloWorld;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Mensagem extends JFrame {

    private JButton jButton; // Declara o Botão com Encapsulamento Privado
    private JTextField input; // Declara a Input com Encapsulamento Privado
    private JLabel mensagem; // Declara a Mensagem com Encapsulamento Privado
    private JLabel titleLabel; // Declara o Título com Encapsulamento Privado
    private JLabel resultLabel; // Declara o Resultado  com Encapsulamento Privado

    public Mensagem() {
        // Chama o Construtor da Superclasse
        super();
        // Instancia e configura o JFrame
        setTitle("Hello World"); // Seta o Titulo
        setSize(768, 600); // Seta o Tamanho da Interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Caso feche a interface para o programa
        setResizable(false); // Trava o Ajuste de Tamanho na Tela
        setLocationRelativeTo(null); // Alinha ao Centro

        // Configura o Background
        JPanel contentPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(64, 64, 64)); // Seta a cor do Background
                g.fillRect(0, 0, getWidth(), getHeight()); // Seta o Tamanho do Background
            }
        };

        contentPanel.setLayout(null); 
        setContentPane(contentPanel);

        // Componentes
        titleLabel = new JLabel("Hello World"); // Título
        titleLabel.setFont(new Font("Open Sans", Font.BOLD, 24)); // Seta a Fonte
        titleLabel.setForeground(new Color(240, 240, 240)); // Seta a Cor da Fonte
        titleLabel.setBounds(315, 30, 200, 30); // Seta a posição do Titulo
        contentPanel.add(titleLabel); // Adiciona na Interface

        mensagem = new JLabel("Digite uma Frase: "); // Titulo
        mensagem.setFont(new Font("Open Sans", Font.ITALIC, 18)); // Seta a Tipografia
        mensagem.setForeground(new Color(240, 240, 240)); // Seta a Cor da Fonte
        mensagem.setBounds(100, 130, 200, 30); // Ajusta na tela
        contentPanel.add(mensagem); // Adiciona na Interface

        input = new JTextField(); // Insere um Campo de Texto
        input.setBackground(new Color(220, 220, 220)); // Seta o Fundo do Input
        input.setFont(new Font("Open Sans", Font.PLAIN, 18)); // Seta o Tipo de Fonte
        input.setBounds(300, 130, 250, 30); // Seta a Posição do Input
        contentPanel.add(input); // Adiciona na Interface

        jButton = new JButton("Clique Aqui"); // Insere o Botão
        jButton.setBounds(100, 270, 100, 30); // Seta a Posição do Botåo
        jButton.setBackground(new Color(2, 117, 216)); // Seta a Cor de Fundo
        jButton.setForeground(new Color(40, 40, 40)); // Seta a Cor da Fonte
        contentPanel.add(jButton);

        resultLabel = new JLabel(); // Crie o JLabel para exibir o resultado
        resultLabel.setFont(new Font("Open Sans", Font.ITALIC, 20)); // Seta a Fonte
        resultLabel.setForeground(new Color(240, 240, 240)); // Seta a cor da Fonte
        resultLabel.setBounds(100, 400, 500, 30); // Seta a Posição
        contentPanel.add(resultLabel); // Adiciona na Tela

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = input.getText(); // Obtenha o texto do campo de entrada
                resultLabel.setText("Você digitou: " + textoDigitado); // Exiba o texto no JLabel
            }
        });

        setVisible(true); // Torna a Interface Visível
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Mensagem()); // Invoca o Construtor da Interface
    }
}
