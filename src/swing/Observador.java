package swing;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

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

        button.addActionListener(e -> {
            System.out.println("Evento ocorreu!!!");
        });

        janela.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) { // focus in
                // TODO Auto-generated method stub
                
            }

            @Override
            public void focusGained(FocusEvent e) { /// focus out
                // TODO Auto-generated method stub
                
            }
        });
        janela.setVisible(true);
    }
}
