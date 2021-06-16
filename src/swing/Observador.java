package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class Observador {
    
    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new SpringLayout());
        janela.setLocationRelativeTo(null); // Centralizar o componente na tela do computador

        JButton button = new JButton("Clicar!");
        janela.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Evento ocorreu");
            }
        });
        janela.setVisible(true);
    }
}
