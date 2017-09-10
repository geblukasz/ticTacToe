import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz on 8/16/2017.
 */
public class TicTacToeWindow extends Window{

    private List<Button> buttons = new ArrayList<>();



    public TicTacToeWindow(String title, int width, int height) {
        super(title, width, height);
        for(int i=1; i<=9; i++){
            buttons.add(new Button(""));
        }
    }

    public TicTacToeWindow(String title, int width) {
        this(title, width, width);
    }

    public TicTacToeWindow(String title, int width, int height, List<Button> buttons) {
        super(title, width, height);
        this.buttons = buttons;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public static void main(String[] args) {
        TicTacToeWindow ticTacToeWindow = new TicTacToeWindow("Tic Tac Toe", 500);
        System.out.println("Okno ma tytuł: " + ticTacToeWindow.getTitle());
        System.out.println("Szerokość i wysokość to : " + ticTacToeWindow.getWidth() + " " + ticTacToeWindow.getHeight());
        System.out.println("Okno ma " + ticTacToeWindow.getButtons().size() + " przcisków");
        System.out.println("Pierwszy button ma tytuł : " + ticTacToeWindow.getButtons().get(0).getTitle());
    }
}
