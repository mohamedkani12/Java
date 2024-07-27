import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;

public class TheatreRevenueCalculator extends JFrame implements ActionListener {
    private JLabel lblAdultPrice, lblAdultTickets, lblChildPrice, lblChildTickets, lblAdultRevenue, lblChildRevenue, lblTotalRevenue;
    private JTextField txtAdultPrice, txtAdultTickets, txtChildPrice, txtChildTickets;
    private JButton btnCalculate;

    public TheatreRevenueCalculator() {
        setTitle("Theatre Revenue Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       // Center the window

        initializeComponents();

        setLayout(new GridLayout(7, 2));
        add(lblAdultPrice);
        add(txtAdultPrice);
        add(lblAdultTickets);
        add(txtAdultTickets);
        add(lblChildPrice);
        add(txtChildPrice);
        add(lblChildTickets);
        add(txtChildTickets);
        add(btnCalculate);
        add(lblAdultRevenue);
        add(lblChildRevenue);
        add(lblTotalRevenue);
        setVisible(true);
    }

    private void initializeComponents() {
        lblAdultPrice = new JLabel("Price per Adult Ticket:");
        lblAdultTickets = new JLabel("Number of Adult Tickets Sold:");
        lblChildPrice = new JLabel("Price per Child Ticket:");
        lblChildTickets = new JLabel("Number of Child Tickets Sold:");
        lblAdultRevenue = new JLabel("Net Revenue for Adult Tickets:");
        lblChildRevenue = new JLabel("Net Revenue for Child Tickets:");
        lblTotalRevenue = new JLabel("Total Net Revenue:");

        txtAdultPrice = new JTextField();
        txtAdultTickets = new JTextField();
        txtChildPrice = new JTextField();
        txtChildTickets = new JTextField();

        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double adultPrice = Double.parseDouble(txtAdultPrice.getText());
            int adultTickets = Integer.parseInt(txtAdultTickets.getText());
            double childPrice = Double.parseDouble(txtChildPrice.getText());
            int childTickets = Integer.parseInt(txtChildTickets.getText());

            double adultRevenue = calculateNetRevenue(adultPrice, adultTickets);
            double childRevenue = calculateNetRevenue(childPrice, childTickets);
            double totalRevenue = adultRevenue + childRevenue;

            // DecimalFormat df = new DecimalFormat("#.##");

            lblAdultRevenue.setText("Net Revenue for Adult Tickets: $" + adultRevenue);
            lblChildRevenue.setText("Net Revenue for Child Tickets: $" + childRevenue);
            lblTotalRevenue.setText("Total Net Revenue: $" + totalRevenue);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter valid numbers.");
        }
    }

    private double calculateNetRevenue(double price, int tickets) {
        double grossRevenue = price * tickets;
        double maintenanceCost = grossRevenue * 0.25; // 25% maintenance cost
        return grossRevenue - maintenanceCost;
    }

    public static void main(String[] args) {
         new TheatreRevenueCalculator();
    }
}