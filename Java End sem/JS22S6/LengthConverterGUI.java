package JS22S6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LengthConverterGUI extends JFrame implements ActionListener, KeyListener {
    private JTextField meterTextField, centimeterTextField;

    public LengthConverterGUI() {
        setTitle("Length Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        JLabel meterLabel = new JLabel("Meter:");
        meterTextField = new JTextField();
        meterTextField.addActionListener(this);
        meterTextField.addKeyListener(this);

        JLabel centimeterLabel = new JLabel("Centimeter:");
        centimeterTextField = new JTextField();
        centimeterTextField.addActionListener(this);
        centimeterTextField.addKeyListener(this);

        add(meterLabel);
        add(meterTextField);
        add(centimeterLabel);
        add(centimeterTextField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == meterTextField) {
            double meterValue = Double.parseDouble(meterTextField.getText());
            double centimeterValue = meterValue * 100; // 1 meter = 100 centimeters
            centimeterTextField.setText(String.format("%.2f", centimeterValue));
        } else if (e.getSource() == centimeterTextField) {
            double centimeterValue = Double.parseDouble(centimeterTextField.getText());
            double meterValue = centimeterValue / 100; // 1 centimeter = 0.01 meters
            meterTextField.setText(String.format("%.2f", meterValue));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (e.getSource() == meterTextField) {
                double meterValue = Double.parseDouble(meterTextField.getText());
                double centimeterValue = meterValue * 100; // 1 meter = 100 centimeters
                centimeterTextField.setText(String.format("%.2f", centimeterValue));
            } else if (e.getSource() == centimeterTextField) {
                double centimeterValue = Double.parseDouble(centimeterTextField.getText());
                double meterValue = centimeterValue / 100; // 1 centimeter = 0.01 meters
                meterTextField.setText(String.format("%.2f", meterValue));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LengthConverterGUI converter = new LengthConverterGUI();
            converter.setVisible(true);
        });
    }
}
