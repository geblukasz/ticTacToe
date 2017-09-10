import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lukasz on 8/16/2017.
 */
public class Window {

    private String title;
    private List<String> options = new ArrayList<>();
    private int width;
    private int height;

    public Window(String title) {
        this.title = title;
    }



    public Window(String title, int width) {
        this.title = title;
        this.width = width;
    }

    public Window(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    public Window(List<String> options, int width, int height) {
        this.options = options;
        this.width = width;
        this.height = height;
    }

    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public Window(String title, List<String> options, int width, int height) {
        this.title = title;
        this.options = options;
        this.width = width;
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
