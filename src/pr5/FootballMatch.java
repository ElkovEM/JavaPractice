package pr5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FootballMatch extends JFrame {
    public static void main(String[] args) {
        FootballMatch MilanReal = new FootballMatch();
        MilanReal.createGUI();
    }

    public void createGUI() {
        JFrame frame = new JFrame("AC Milan VS FC Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);

        JPanel Clubs = new JPanel();
        Clubs.setBackground(Color.GRAY);
        Clubs.setPreferredSize( new Dimension(200,300));

        JButton buttonMilan = new JButton("AC Milan");
        JButton buttonReal = new JButton("Real Madrid");

        JLabel labelResult = new JLabel("Result 0 X 0", JLabel.CENTER);
        JLabel lastScorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel labelWinner = new JLabel("Winner: DRAW", JLabel.CENTER);

        Clubs.add(buttonMilan);
        Clubs.add(buttonReal);
        Clubs.add(labelResult);
        Clubs.add(lastScorer);
        Clubs.add(labelWinner);

        frame.getContentPane().add(Clubs);
        frame.pack();

        /*JPanel Result = new JPanel();
        Result.setBackground(Color.GRAY);
        Result.setPreferredSize( new Dimension(300,200));
        *//*JLabel labelResult = new JLabel("Result 0 X 0", JLabel.LEFT);
        JLabel lastScorer = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        JLabel labelWinner = new JLabel("Winner: DRAW", JLabel.CENTER);*//*
        *//*Result.add(labelResult);
        Result.add(lastScorer);
        Result.add(labelWinner);*//*
        frame.getContentPane().add(Result);*/

        frame.setVisible(true);
    }
}
