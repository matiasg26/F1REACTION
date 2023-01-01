package cartoon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Here's cartoon! Your first JavaFX assignment!
 * Before you start coding your cartoon, take a look at
 * the lecture slides and JavaFX Guide for all the
 * information you'll need (and more!).
 *
 * Please put your overall comments for the project here.
 *
 */

public class App extends Application {
    @Override
    public void start(Stage stage) {
        // Create top-level object, set up the scene, and show the stage here.
        stage.setTitle("Test your F1 reaction time!");
        stage.show();
        CartoonPaneOrganizer organizer = new CartoonPaneOrganizer();
        Scene scene = new Scene(organizer.getRoot(), Constants.FULL_WIDTH, Constants.FULL_HEIGHT);
        stage.setScene(scene);
    }

    /*
    * Here is the mainline! No need to change this.
    */
    public static void main(String[] argv) {
        // launch is a method inherited from Application
        launch(argv);
    }
}
