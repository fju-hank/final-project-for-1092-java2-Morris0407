package com.fju;

import javax.swing.*;

public class SeverDemo {
    private JPanel Mainpanel;
    private JPanel NorthPanel;
    private JButton hiButton;
    private JPanel WestPanel;
    private JButton menuButton;
    private JTextField textField1;
    private JButton leaveButton;
    private JTextArea a1BlackPeperNoodleTextArea;

    String name;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,800);
        frame.setContentPane(new SeverDemo().Mainpanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
