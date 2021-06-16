package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
    
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);

        JButton button = new JButton("Clicar!");
        janela.add(button);

        janela.setVisible(true);
    }
}
