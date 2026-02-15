import javax.swing.*;
import java.awt.*;


public class Tester extends JFrame {

    public Tester() {
        super("SE 471 Lab 1");

        JLabel title = new JLabel("Select Game Mode", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        JButton beginnerBtn = new JButton("Beginner");
        JButton intermediateBtn = new JButton("Intermediate");
        JButton advancedBtn = new JButton("Advanced");

        beginnerBtn.setFont(new Font("Arial", Font.BOLD, 18));
        intermediateBtn.setFont(new Font("Arial", Font.BOLD, 18));
        advancedBtn.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel panel = new JPanel(new GridLayout(3, 1, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 80, 40, 80));

        panel.add(beginnerBtn);
        panel.add(intermediateBtn);
        panel.add(advancedBtn);

        JPanel mainPanel = new JPanel(new BorderLayout(10, 20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(panel, BorderLayout.CENTER);

        add(mainPanel);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 550);
        setLocationRelativeTo(null);
        setVisible(true);

        // Button actions (for now just print)
        beginnerBtn.addActionListener(e ->  {testMode("beginner");
            dispose();});
        intermediateBtn.addActionListener(e -> {testMode("intermediate");
            dispose();});
        advancedBtn.addActionListener(e -> {testMode("advanced");
            dispose();});
    }

    private void testMode(String mode){
        GameGUIFactoryIF factory = GameUtility.createGameGUIFactory(mode);

        String characterPath = factory.createCharacterPanel().display();
        String weaponPath = factory.createWeaponPanel().display();

        JFrame gameFrame = new JFrame("SE 471 Lab 1");
        gameFrame.setLayout(new BorderLayout());

        JLabel left = new JLabel(new ImageIcon(characterPath), SwingConstants.CENTER);
        JLabel right = new JLabel(new ImageIcon(weaponPath), SwingConstants.CENTER);

        // Create Border with color according to the mode
        switch (mode) {
            case "beginner" -> {
                left.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                right.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
            }
            case "intermediate" -> {
                left.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
                right.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            }
            case "advanced" -> {
                left.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                right.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            }
        }

        JPanel center = new JPanel(new GridLayout(1, 2, 20, 0));
        center.add(left);
        center.add(right);

        JLabel modeText = new JLabel(mode + " mode", SwingConstants.CENTER);
        modeText.setFont(new Font("Arial", Font.BOLD, 28));
        modeText.setForeground(Color.BLUE);

        gameFrame.add(center, BorderLayout.CENTER);
        gameFrame.add(modeText, BorderLayout.SOUTH);

        gameFrame.setSize(900, 550);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gameFrame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(Tester::new);

    }
}


