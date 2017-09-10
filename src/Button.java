/**
 * Created by Lukasz on 8/16/2017.
 */
public class Button {

    private String title;
    private int x;
    private int y;
    private int height;
    private int width;

    public Button(String title) {
        this.title = title;
    }

    public Button(String title, int x, int y, int height, int width) {
        this.title = title;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
