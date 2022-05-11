import DiaryApplication.DiarySite;

import java.awt.*;
import javax.swing.*;
public class PanelExample {
    PanelExample() {
        JFrame f = new JFrame("Panel Example");
        DiarySite diary = new DiarySite();
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.BLACK);
        JOptionPane tab = new JOptionPane();
        panel.getAccessibleContext();
        JButton b1 = new JButton("WELCOME TO DIARY SITE ");
        JButton b3 = new JButton("SIGN IN");
        tab.setMessageType(3);
        b3.setBounds(10,22,200,200);
        b1.setBounds(50, 100, 80, 30);
        b3.setBackground(Color.CYAN);
        b1.setBackground(Color.BLUE);
        JButton b2 = new JButton("LOGIN");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.green);
        panel.add(b1);
        panel.add(b3);
        panel.add(b2);
        f.add(panel);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.getJMenuBar();
    }

    public static void main(String args[]) {
        new PanelExample();
    }
}