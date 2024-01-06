/* Authors: Katarina Hanson, Matthew Boyea
 * Creation Date: 2024/01/03
 * Last Edit Date: 2024/01/04
 * Editors: ---
 * Description: Main is the entrypoint of the program.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static final String TITLE = "All Stars Agility";
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static Physics physics;
    public static Input input;
    public static Window window;
    public static void main(String[] args) {
        // this calls Main.init(), Main.start(Stage), & Main.stop()
        launch(args);
    }
    @Override public void init() {
        input = new Input();
        physics = new Physics(WIDTH, HEIGHT);
    }
    @Override public void start(Stage appStage) {
        window = new Window(appStage, WIDTH, HEIGHT, TITLE);
        appStage.setScene(new Scene(window.pane));
        input = new Input();
        // TODO: AgilityGame.init()
        appStage.show();
        // TODO: AgilityGame.start()
    }
    @Override public void stop() {
        // TDOO: AgilityGame.stop()
    }
}
