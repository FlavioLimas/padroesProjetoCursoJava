package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class Observador {
    
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new SpringLayout());

        JButton button = new JButton("Clicar!");
        janela.add(button);

        janela.setVisible(true);
    }
}
