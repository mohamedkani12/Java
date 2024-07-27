package JS22S5;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksCalculatorGUI extends JFrame implements ActionListener {
    private JTextField[] marksField1 = new JTextField[5];
    private JTextField[] marksField2 = new JTextField[5];
    private JLabel[] subjectLabels = new JLabel[5];
    private JButton calculateButton;
    private JTextArea resultArea;
    private JLabel leastAverageLabel;

    public MarksCalculatorGUI() {
        setTitle("Marks Calculator");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        initializeComponents();
        setComponentsLayout();
        addComponentsToFrame();
        addActionListeners();

        setVisible(true);
    }

    private void initializeComponents() {
        for (int i = 0; i < 5; i++) {
            marksField1[i] = new JTextField();
            marksField2[i] = new JTextField();
            subjectLabels[i] = new JLabel("Subject " + (i + 1));
        }

        calculateButton = new JButton("Calculate");
        resultArea = new JTextArea();
        resultArea.setEditable(false);

        leastAverageLabel = new JLabel("Least Average Subject:");
    }

    private void setComponentsLayout() {
        int startX = 30;
        int startY = 30;
        int labelWidth = 70;
        int fieldWidth = 50;
        int height = 20;
        int spacing = 30;

        for (int i = 0; i < 5; i++) {
            subjectLabels[i].setBounds(startX, startY + i * spacing, labelWidth, height);
            marksField1[i].setBounds(startX + labelWidth + 10, startY + i * spacing, fieldWidth, height);
            marksField2[i].setBounds(startX + labelWidth + 10 + fieldWidth + 10, startY + i * spacing, fieldWidth, height);
        }

        calculateButton.setBounds(startX + labelWidth + 10, startY + 5 * spacing, 100, height);
        resultArea.setBounds(startX, startY + 6 * spacing, 300, 100);
        leastAverageLabel.setBounds(startX, startY + 6 * spacing + 110, 300, height);
    }

    private void addComponentsToFrame() {
        for (int i = 0; i < 5; i++) {
            add(subjectLabels[i]);
            add(marksField1[i]);
            add(marksField2[i]);
        }

        add(calculateButton);
        add(resultArea);
        add(leastAverageLabel);
    }

    private void addActionListeners() {
        calculateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            calculateAverageMarks();
        }
    }

    private void calculateAverageMarks() {
        double[] totalMarks = new double[5];
        int totalSubjects = 5;

        for (int i = 0; i < totalSubjects; i++) {
            double marks1 = Double.parseDouble(marksField1[i].getText());
            double marks2 = Double.parseDouble(marksField2[i].getText());

            totalMarks[i] = (marks1 + marks2) / 2;
        }

        StringBuilder result = new StringBuilder();
        double leastAverage = Double.MAX_VALUE;
        int leastIndex = -1;

        for (int i = 0; i < totalSubjects; i++) {
            result.append("Subject ").append(i + 1).append(": ").append(totalMarks[i]).append("\n");

            if (totalMarks[i] < leastAverage) {
                leastAverage = totalMarks[i];
                leastIndex = i + 1;
            }
        }
        resultArea.setText(result.toString());
        leastAverageLabel.setText("Least Average Subject: Subject " + leastIndex);
    }

    public static void main(String[] args) {
        new MarksCalculatorGUI();
    }
}
