/* Authors: Katarina Hanson, Matthew Boyea
 * Creation Date: 2024/01/03
 * Last Edit Date: 2024/01/03
 * Editors: ---
 * Description: Window manages the JavaFX window & game textures.
 */
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Window {
    public Pane rootPane;
    public Stage rootStage;
    public Window(Stage appStage) {
        this(appStage, 800, 600, "Game Window");
    }
    public Window(Stage appStage, int w, int h, String title) {
        rootPane = new Pane();
        rootStage = appStage;
        setSize(w, h);
        setTitle(title);
    }
    public void setTitle(String title) {
        rootStage.setTitle(title);
    }
    public void setSize(int w, int h) {
        rootPane.setPrefSize(w, h);
    }
}
