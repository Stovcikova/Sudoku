package sk.kosickaakademia.stovcikova.sudoku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton("Vyrieš!");
    JLabel label = new JLabel();

    public Gui() {
        label.setSize(20,20);
        label.setVisible(true);
        button.setSize(10,10);
        button.addActionListener(this);
        panel.add(button);
        panel.setBorder(BorderFactory.createEmptyBorder(300,300,150,300));
        panel.setLayout(new GridLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sudoku");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Sudoku sudoku = new Sudoku();
        sudoku.printBoard();
    }
}