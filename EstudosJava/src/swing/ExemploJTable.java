package swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class ExemploJTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo JTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // 1. Criar o modelo e definir as colunas
        String[] colunas = {"Nome", "Idade", "Profissão"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);

        // 2. Adicionar linhas de dados
        modelo.addRow(new Object[]{"Ana", 28, "Engenheira"});
        modelo.addRow(new Object[]{"Bruno", 34, "Professor"});
        modelo.addRow(new Object[]{"Carla", 22, "Estudante"});
        modelo.addRow(new Object[]{"Miguel", 14, "Dev"});

        // 3. Associar o modelo à JTable
        JTable tabela = new JTable(modelo);

        // 4. Adicionar a tabela a um JScrollPane (para barra de rolagem)
        JScrollPane painelRolagem = new JScrollPane(tabela);
        frame.add(painelRolagem, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

