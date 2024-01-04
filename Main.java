/* Authors: Katarina Hanson, Matthew Boyea
 * Creation Date: 2024/01/03
 * Last Edit Date: 2024/01/03
 * Editors: ---
 * Description: Main is the entrypoint of the program.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    Window window;
    public static void main(String[] args) {
        // this calls init(), then start(Stage), then stop() via JavaFX
        launch(args);
    }
    @Override public void init() {
        
    }
    @Override public void start(Stage appStage) {
        window = new Window(appStage);
        appStage.setScene(new Scene(window.rootPane));
        appStage.show();
    }
    @Override public void stop() {
        
    }
}
