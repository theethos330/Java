import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class RegistrationForm11 implements ActionListener {
    JFrame jfr;
    JTextField nameField, ageField, rollField, classField, addressField, phoneField;
    JRadioButton maleRadio, femaleRadio;
    JCheckBox sportsClub, musicClub, danceClub;
    JButton submitButton, resetButton;

    public RegistrationForm11() {
        jfr = new JFrame("Student Registration Form");
        jfr.setSize(400, 550);
        jfr.setLayout(null);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel rollLabel = new JLabel("Roll No:");
        JLabel classLabel = new JLabel("Class:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel phoneLabel = new JLabel("Phone No:");
        JLabel clubsLabel = new JLabel("Clubs:");

        // Label positioning and styling
        nameLabel.setBounds(30, 30, 100, 30);
        nameLabel.setFont(nameLabel.getFont().deriveFont(14f));
        ageLabel.setBounds(30, 70, 100, 30);
        ageLabel.setFont(ageLabel.getFont().deriveFont(14f));
        genderLabel.setBounds(30, 110, 100, 30);
        genderLabel.setFont(genderLabel.getFont().deriveFont(14f));
        rollLabel.setBounds(30, 150, 100, 30);
        rollLabel.setFont(rollLabel.getFont().deriveFont(14f));
        classLabel.setBounds(30, 190, 100, 30);
        classLabel.setFont(classLabel.getFont().deriveFont(14f));
        addressLabel.setBounds(30, 230, 100, 30);
        addressLabel.setFont(addressLabel.getFont().deriveFont(14f));
        phoneLabel.setBounds(30, 300, 100, 30);
        phoneLabel.setFont(phoneLabel.getFont().deriveFont(14f));
        clubsLabel.setBounds(30, 340, 100, 30);
        clubsLabel.setFont(clubsLabel.getFont().deriveFont(14f));

        jfr.add(nameLabel);
        jfr.add(ageLabel);
        jfr.add(genderLabel);
        jfr.add(rollLabel);
        jfr.add(classLabel);
        jfr.add(addressLabel);
        jfr.add(phoneLabel);
        jfr.add(clubsLabel);

        // Input fields and components
        nameField = new JTextField();
        ageField = new JTextField();
        rollField = new JTextField();
        classField = new JTextField();
        addressField = new JTextField();
        phoneField = new JTextField();
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        sportsClub = new JCheckBox("Sports");
        musicClub = new JCheckBox("Music");
        danceClub = new JCheckBox("Dance");
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        // Component positioning and styling
        nameField.setBounds(150, 30, 200, 30);
        ageField.setBounds(150, 70, 80, 30);
        maleRadio.setBounds(150, 110, 80, 30);
        femaleRadio.setBounds(230, 110, 80, 30);
        rollField.setBounds(150, 150, 80, 30);
        classField.setBounds(150, 190, 80, 30);
        addressField.setBounds(150, 230, 200, 60);
        phoneField.setBounds(150, 300, 200, 30);
        sportsClub.setBounds(150, 340, 80, 30);
        musicClub.setBounds(230, 340, 80, 30);
        danceClub.setBounds(310, 340, 80, 30);
        submitButton.setBounds(100, 400, 80, 30);
        resetButton.setBounds(200, 400, 80, 30);

        jfr.add(nameField);
        jfr.add(ageField);
        jfr.add(maleRadio);
        jfr.add(femaleRadio);
        jfr.add(rollField);
        jfr.add(classField);
        jfr.add(addressField);
        jfr.add(phoneField);
        jfr.add(sportsClub);
        jfr.add(musicClub);
        jfr.add(danceClub);
        jfr.add(submitButton);
        jfr.add(resetButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        jfr.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submitButton) {
            // Gather form data
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String gender = maleRadio.isSelected() ? "Male" : "Female";
            String rollNo = rollField.getText();
            String className = classField.getText();
            String address = addressField.getText();
            String phoneNo = phoneField.getText();
            StringBuilder clubs = new StringBuilder();

            if (sportsClub.isSelected()) clubs.append("Sports ");
            if (musicClub.isSelected()) clubs.append("Music ");
            if (danceClub.isSelected()) clubs.append("Dance ");

            // Insert data into the database
            insertData(name, age, gender, rollNo, className, address, phoneNo, clubs.toString().trim());

        } else if (ae.getSource() == resetButton) {
            resetFields();
        }
    }

    private void insertData(String name, int age, String gender, String rollNo, String className,
                            String address, String phoneNo, String clubs) {
        String url = "jdbc:mysql://localhost:3306/regdb"; // Update with your DB URL
        String user = "root"; // Update with your DB username
        String password = ""; // Update with your DB password

        String query = "INSERT INTO student (name, age, gender, roll_no, class, address, phone_no, clubs) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, gender);
            pstmt.setString(4, rollNo);
            pstmt.setString(5, className);
            pstmt.setString(6, address);
            pstmt.setString(7, phoneNo);
            pstmt.setString(8, clubs);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(jfr, "Form Submitted and data saved to database!");
            } else {
                JOptionPane.showMessageDialog(jfr, "Failed to save data.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(jfr, "Database error: " + e.getMessage());
        }
    }

    private void resetFields() {
        nameField.setText("");
        ageField.setText("");
        rollField.setText("");
        classField.setText("");
        addressField.setText("");
        phoneField.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        sportsClub.setSelected(false);
        musicClub.setSelected(false);
        danceClub.setSelected(false);
    }

    public static void main(String[] args) {
        new RegistrationForm11();
    }
}