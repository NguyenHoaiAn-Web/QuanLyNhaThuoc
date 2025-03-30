package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel contentPanel;
    private CardLayout cardLayout;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Test().initialize();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void initialize() {
        // Create main frame
        frame = new JFrame("Expandable Menu Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        // Create main panel with BorderLayout
        mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);

        // Create menu panel on the left
        JPanel menuPanel = createMenuPanel();
        mainPanel.add(menuPanel, BorderLayout.WEST);

        // Create content panel with CardLayout
        contentPanel = new JPanel();
        cardLayout = new CardLayout();
        contentPanel.setLayout(cardLayout);
        
        // Add default content
        contentPanel.add(new JLabel("Select a function from the menu", JLabel.CENTER), "welcome");
        cardLayout.show(contentPanel, "welcome");
        
        mainPanel.add(contentPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JPanel createMenuPanel() {
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        menuPanel.setBackground(new Color(240, 240, 240));

        // Create menu items
        createExpandableMenuItem(menuPanel, "Processing", new String[]{"Add", "Edit", "Delete"});
        createExpandableMenuItem(menuPanel, "Employee Management", new String[]{"Add Employee", "Edit Employee", "Delete Employee", "View Employees"});
        createExpandableMenuItem(menuPanel, "Statistics", new String[]{"Daily Report", "Monthly Report", "Annual Report", "Custom Report"});

        return menuPanel;
    }

    private void createExpandableMenuItem(JPanel parentPanel, String mainItem, String[] subItems) {
        // Create main item button
        JButton mainButton = new JButton(mainItem);
        styleMainButton(mainButton);
        
        // Create panel for sub-items
        JPanel subItemPanel = new JPanel();
        subItemPanel.setLayout(new BoxLayout(subItemPanel, BoxLayout.Y_AXIS));
        subItemPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        subItemPanel.setVisible(false); // Initially hidden

        // Create sub-item buttons
        for (String subItem : subItems) {
            JButton subButton = new JButton(subItem);
            styleSubButton(subButton);
            
            // Add action listener for sub-button
            subButton.addActionListener(e -> {
                String cardName = mainItem + " - " + subItem;
                
                // Check if this card already exists
                boolean cardExists = false;
                for (Component comp : contentPanel.getComponents()) {
                    if (comp.getName() != null && comp.getName().equals(cardName)) {
                        cardExists = true;
                        break;
                    }
                }
                
                if (!cardExists) {
                    JPanel newCard = createContentCard(mainItem, subItem);
                    newCard.setName(cardName);
                    contentPanel.add(newCard, cardName);
                }
                
                cardLayout.show(contentPanel, cardName);
            });
            
            subItemPanel.add(subButton);
        }

        // Add action listener to toggle sub-items visibility
        mainButton.addActionListener(e -> {
            subItemPanel.setVisible(!subItemPanel.isVisible());
            parentPanel.revalidate();
            parentPanel.repaint();
        });

        // Add components to parent panel
        parentPanel.add(mainButton);
        parentPanel.add(subItemPanel);
        parentPanel.add(Box.createRigidArea(new Dimension(0, 10)));
    }

    private JPanel createContentCard(String mainItem, String subItem) {
        JPanel card = new JPanel(new BorderLayout());
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel titleLabel = new JLabel(mainItem + " > " + subItem, JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        card.add(titleLabel, BorderLayout.NORTH);
        
        // Add sample content based on the function
        JTextArea contentArea = new JTextArea();
        contentArea.setEditable(false);
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        contentArea.setText("This is the content for " + mainItem + " - " + subItem + ".\n\n" +
                "Functionality would be implemented here.");
        
        card.add(new JScrollPane(contentArea), BorderLayout.CENTER);
        
        return card;
    }

    private void styleMainButton(JButton button) {
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, button.getPreferredSize().height));
        button.setBackground(new Color(70, 130, 180));
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }

    private void styleSubButton(JButton button) {
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, button.getPreferredSize().height));
        button.setBackground(new Color(220, 220, 220));
        button.setForeground(Color.BLACK);
        button.setFocusPainted(false);
        button.setFont(new Font("Arial", Font.PLAIN, 12));
        button.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 10));
    }
}