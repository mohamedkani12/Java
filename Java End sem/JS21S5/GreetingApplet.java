import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingApplet extends Applet implements ActionListener {
    private TextField nameField;
    private Button greetButton;
    private String message = "";

    public void init() {
        setLayout(new FlowLayout());

        // Create name input field
        nameField = new TextField(20);
        add(new Label("Enter your name: "));
        add(nameField);

        // Create greet button
        greetButton = new Button("Greet");
        add(greetButton);

        // Register button action listener
        greetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        message = "Hello, " + name + "!";
        repaint(); // Request the applet to be repainted
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Set font styles and colors
        Font fontPlain = new Font("Arial", Font.PLAIN, 18);
        Font fontBold = new Font("Arial", Font.BOLD, 20);
        Font fontItalic = new Font("Arial", Font.ITALIC, 22);

        Color colorRed = Color.RED;
        Color colorGreen = Color.GREEN;
        Color colorBlue = Color.BLUE;

        // Display greeting message with different styles and colors
        if (!message.isEmpty()) {
            g.setFont(fontPlain);
            g.setColor(colorRed);
            g.drawString(message, 20, 80);

            g.setFont(fontBold);
            g.setColor(colorGreen);
            g.drawString("Nice to meet you, " + message.substring(7), 20, 120);

            g.setFont(fontItalic);
            g.setColor(colorBlue);
            g.drawString("Welcome, " + message.substring(7), 20, 160);
        }
    }
}
