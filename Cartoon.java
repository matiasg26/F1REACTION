package cartoon;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;


public class Cartoon{
    private BorderPane midPane;
    private Pane racePane;
    private Background background;

    private Timeline readyRace;
    private Timeline startRace;
    private RaceCar racecar;
    private Timeline timeLine;
    private Timeline startLightTimeLine;
    public Cartoon(BorderPane midPane, Pane racePane) {
        this.timeLine = new Timeline();
        this.midPane = midPane;
        this.racePane = racePane;
        this.racecar = new RaceCar(racePane);
        this.background = new Background(this.midPane);
        this.startLightTimeLine = new Timeline();
        this.readyDriver();
    }
    //randomizes the teams when space bar is pressed
    public void handleKeyPress(KeyEvent e) {
        KeyCode keyPressed = e.getCode();
        if (keyPressed == KeyCode.SPACE) {
            this.racecar.changeTeam();
        }
        e.consume();
    }
    //brings the driver slowly to the start line
    public void readyDriver() {
        KeyFrame gf = new KeyFrame(Duration.seconds(.05),(f) -> this.racecar.updateRace());
        this.readyRace = new Timeline(gf);
        this.readyRace.setCycleCount(37);
        this.readyRace.play();
    }
    //sends the driver off the screen to start the race
    public void beginRace(){
        KeyFrame kf = new KeyFrame(Duration.seconds(.004),(f) -> this.racecar.updateRace());
        this.startRace = new Timeline(kf);
        this.startRace.setCycleCount(120);
        this.startRace.play();
    }
}
