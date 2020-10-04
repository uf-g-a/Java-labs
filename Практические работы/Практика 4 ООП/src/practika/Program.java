package practika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program extends JFrame {
    private int mil, mad, win;
    private JButton milan = new JButton("AC Milan");
    private JButton madrid = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result " + mil + " X " + mad);
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: N/A");

    public Program(){
        super("AC Milan vs Real Madrid");
        setBounds(750,400,300,200);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        add(winner, BorderLayout.SOUTH);
        add(lastScorer, BorderLayout.WEST);
        add(result, BorderLayout.EAST);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(milan);
        buttonsPanel.add(madrid);
        add(buttonsPanel, BorderLayout.NORTH);
        change();
    }
    public void change(){
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                changLabel(1);
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mad++;
                changLabel(0);
            }
        });
    }
    public void changLabel(int last){
        if(last == 0)
            lastScorer.setText("Last Scorer: Real Madrid");
        else
            lastScorer.setText("Last Scorer: AC Milan");
        if(mil > mad)
            winner.setText("Winner: AC Milan");
        if(mil < mad)
            winner.setText("Winner: Real Madrid");
        if(mil == mad)
            winner.setText("Draw");
        result.setText("Result " + mil + " X " + mad);
    }
}