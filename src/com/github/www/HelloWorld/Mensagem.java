import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mensagem extends JFrame {

    private JButton jButton;
    private JTextField input;
    private JLabel mensagem;
    private JLabel titleLabel;
    private JLabel resultLabel;

    public Mensagem() {
        // Chama o Construtor da Superclasse
        super();
        // Instancia e configura o JFrame
        setTitle("Hello World");
        setSize(768, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        // Configura o Background
        JPanel contentPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(64, 64, 64));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        contentPanel.setLayout(null);
        setContentPane(contentPanel);

        // Componentes
        titleLabel = new JLabel("Hello World");
        titleLabel.setFont(new Font("Open Sans", Font.BOLD, 24));
        titleLabel.setForeground(new Color(240, 240, 240));
        titleLabel.setBounds(315, 30, 200, 30);
        contentPanel.add(titleLabel);

        mensagem = new JLabel("Digite uma Frase: ");
        mensagem.setFont(new Font("Open Sans", Font.ITALIC, 18));
        mensagem.setForeground(new Color(240, 240, 240));
        mensagem.setBounds(100, 130, 200, 30);
        contentPanel.add(mensagem);

        input = new JTextField();
        input.setBackground(new Color(220, 220, 220));
        input.setFont(new Font("Open Sans", Font.PLAIN, 18));
        input.setBounds(300, 130, 250, 30);
        contentPanel.add(input);

        jButton = new JButton("Clique Aqui");
        jButton.setBounds(100, 270, 100, 30);
        jButton.setBackground(new Color(2, 117, 216));
        jButton.setForeground(new Color(240, 240, 240));
        contentPanel.add(jButton);

        resultLabel = new JLabel(); // Crie o JLabel para exibir o resultado
        resultLabel.setFont(new Font("Open Sans", Font.ITALIC, 20));
        resultLabel.setForeground(new Color(240, 240, 240));
        resultLabel.setBounds(100, 400, 500, 30);
        contentPanel.add(resultLabel);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = input.getText(); // Obtenha o texto do campo de entrada
                resultLabel.setText("Você digitou: " + textoDigitado); // Exiba o texto no JLabel
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Mensagem());
    }
}
