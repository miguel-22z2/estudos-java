package testes;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ExemploScrollJOptionPane {
    public static void main(String[] args) {
        // 1. Crie o componente com o texto longo
        JTextArea textArea = new JTextArea(15, 30);
        textArea.setText("Texto muito longo que precisa de scroll...\n".repeat(30));
        
        // Impede que o usuário edite o texto (opcional)
        textArea.setEditable(false); 
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // 2. Coloque o JTextArea dentro do JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // 3. Exiba o JOptionPane passando o scrollPane como mensagem
        JOptionPane.showMessageDialog(
            null, 
            scrollPane, 
            "Mensagem com Scroll", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}

