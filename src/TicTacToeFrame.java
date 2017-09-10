import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz on 8/16/2017.
 */
public class TicTacToeFrame extends JFrame implements ActionListener {

    private List<JButton> buttons = new ArrayList<>();
    private int counter;

    public TicTacToeFrame(String title, int width) {
        super(title);
        setSize(width, width);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for (int i = 1; i <= 9; i++) {
            JButton jButton = new JButton("");
            buttons.add(jButton);
            jButton.addActionListener(this);
            add(jButton);
        }
        setLayout(new GridLayout(3, 3));
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToeFrame("Tic Tac Toe", 500);
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        JButton clickedButton = (JButton) e.getSource();

        if (counter % 2 == 0) {
            clickedButton.setText("X");
        } else {
            clickedButton.setText("O");
        }

        counter++;

        clickedButton.setEnabled(false);
        if (isWinner()) {
            JOptionPane.showMessageDialog(null, "Koniec gry!");
            setAllButtonsDisabled();
        }
        System.out.println("Kliknięto mnie");

    }


    public boolean isWinner() {
        if (isWinner(0, 1, 2)) {
            return true;
        }
        if (isWinner(3, 4, 5)) {
            return true;
        }
        if (isWinner(6, 7, 8)) {
            return true;
        }
        if (isWinner(0, 3, 6)) {
            return true;
        }
        if (isWinner(1, 4, 7)) {
            return true;
        }
        if (isWinner(2, 5, 8)) {
            return true;
        }
        if (isWinner(0, 4, 8)) {
            return true;
        }
        if (isWinner(2, 4, 6)) {
            return true;
        }
        return false;
    }

    public boolean isWinner(int i, int j, int k) {
        if (buttons.get(i).getText().equals(buttons.get(j).getText()) && buttons.get(j).getText().equals(buttons.get(k).getText()) && !buttons.get(k).getText().equals("")) {
            buttons.get(i).setBackground(Color.green);
            buttons.get(j).setBackground(Color.green);
            buttons.get(k).setBackground(Color.green);

            return true;
        } else {
            return false;
        }
    }

    public void setAllButtonsDisabled() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

}
