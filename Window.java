/* Authors: Katarina Hanson, Matthew Boyea
 * Creation Date: 2024/01/03
 * Last Edit Date: 2024/01/04
 * Editors: ---
 * Description: Window manages the JavaFX window & game textures.
 */
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Window {
    public Pane pane;
    public Stage stage;
    public Window(Stage rootStage) {
        this(rootStage, 800, 600, "Game Window");
    }
    public Window(Stage rootStage, int w, int h, String title) {
        pane = new Pane();
        stage = rootStage;
        setSize(w, h);
        setTitle(title);
    }
    public void setTitle(String title) {
        stage.setTitle(title);
    }
    public void setSize(int w, int h) {
        pane.setPrefSize(w, h);
    }
}
