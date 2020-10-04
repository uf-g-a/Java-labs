package program;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame{

    private int GuessingNumber;
    int Trying = 0;
    int number = 0;

    JTextField jf1 = new JTextField(5);
    JButton jb1 = new JButton("Ввод");
    JLabel jl1 = new JLabel("Угадайте число от 0 до 20");

    Main() {

        super("Угадайка");


        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();


        setSize(200, 200);



        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 0;
        c.gridy = 0;
        add(jl1, c);

        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 1;
        add(jf1, c);

        c.gridx = 0;
        c.gridy = 2;
        add(jb1, c);

        setGuessingNumber();

        jb1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                try {
                    number = newNumber();
                    if(number > 20){
                        wrongNumber();
                    }
                    else if (number < 0)
                        wrongNumber();
                    else if (number == GuessingNumber && Trying < 3) {
                        JOptionPane.showMessageDialog(null, youWin(), "Конец", JOptionPane.PLAIN_MESSAGE);
                        System.exit(0);
                    }
                    else if (number < GuessingNumber && Trying < 3) {
                        mayBeMore();
                        Trying++;
                    }
                    else if (number > GuessingNumber && Trying < 3) {
                        mayBeLess();
                        Trying++;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, youLose(), "Конец", JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                    }
                }

                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Error!", "Ошибка" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public int newNumber() {
        String str = jf1.getText();
        return Integer.parseInt(str);
    }

    public void setGuessingNumber() {
        this.GuessingNumber = (int)(Math.random() * 20);
    }
    public String youWin() {
        return "Вы выйграли!";
    }

    public String youLose() {
        return "Вы проиграли! Загадонное число: " + GuessingNumber + ".";
    }

    public void mayBeLess() {
        jl1.setText("Число должно быть меньше");
    }

    public void wrongNumber() {
        jl1.setText("Число должно быть больше 0 и меньше 20");
    }

    public void mayBeMore() {
        jl1.setText("Число должно быть больше");
    }

    public static void main(String[] args) {
        new Main ();
    }
}
