import javax.swing.*;
import javax.swing.JOptionPane;

public class Frequencia {

    public static void main(String args[]) {

        String nome = JOptionPane.showInputDialog(null,
        "Digite o nome do aluno", "Nome aluno", JOptionPane.QUESTION_MESSAGE);

        String aulas = JOptionPane.showInputDialog(null,
        "Digite o número total de aulas", "Aulas Dadas", JOptionPane.QUESTION_MESSAGE);

        // Formato para perguntas
            String faltas = JOptionPane.showInputDialog(null,
            "Digite o número de faltas", "Ausências", JOptionPane.QUESTION_MESSAGE);

        // Transformando variável tipo string em float

            float v1 = Float.parseFloat(aulas);
            float v2 = Float.parseFloat(faltas);
            float percent = (((v1 - v2)*100)/v1);

        JOptionPane.showMessageDialog(null,
        "Frequência do aluno "+nome +" é de " +percent +" %", "Resultado", JOptionPane.INFORMATION_MESSAGE);

        if (percent<60) {
            JOptionPane.showMessageDialog(null,
            "Frequência muito baixa", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

        else if (percent>=75) {
            JOptionPane.showMessageDialog(null,
            "Frequência Ideal - Certificado Liberado","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
    
        System.exit(0);

    }
}