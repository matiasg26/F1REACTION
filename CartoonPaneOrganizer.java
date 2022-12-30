package cartoon;

import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CartoonPaneOrganizer{
    private BorderPane root;
    private Background background;
    private Cartoon cartoon;
    private BorderPane midPane;
    private Pane racePane;
    private HBox backPane;
    private Button var3;
    private Button go;
    public BorderPane getRoot() {return root;}
    public CartoonPaneOrganizer() {
        this.midPane = new BorderPane();
        this.racePane = new Pane();
        this.root = new BorderPane();
        this.createBackground();
        this.createButtonPane();
        this.createRacePane();
        this.createRaceTrack();
        this.cartoon = new Cartoon(this.midPane, this.racePane);
        this.background.bringStartLight();
        this.background.bringStartLight2();
        this.background.bringStartLight3();
        this.background.bringStartLight4();
        this.background.bringStartLight5();
        this.background.pushStartLight();
        this.background.startStopwatch();
    }
    //creates a new background
    private void createBackground() {
        BorderPane midPane = new BorderPane();
        this.root.setTop(midPane);
        this.background = new Background(midPane);
    }
    //creates the background for the racetrack
    private void createRaceTrack() {
        new HBox(0);
        this.root.setStyle(Constants.RACE_PANE_COLOR);
        this.root.setBottom(this.backPane);
    }
    //creates the pane on which the car moves
    private void createRacePane() {
        Pane racePane = new Pane();
        racePane.setPrefSize(Constants.RACE_PANE_WIDTH, Constants.RACE_PANE_HEIGHT);
        this.root.setCenter(this.racePane);
        this.racePane.setOnKeyPressed((KeyEvent e) -> this.cartoon.handleKeyPress(e));
        this.racePane.setFocusTraversable(true);
    }
    //creates the buttons quit, restart, and go and assigns them methods
    private void createButtonPane() {
        Pane var1 = new Pane();
        var1.setPrefSize(70.0, 200);
        this.root.setLeft(var1);
        Button var2 = new Button("Quit");
        var2.setLayoutY(350);
        this.var3 = new Button("Restart");
        this.var3.setLayoutY(400);
        this.var3.setDisable(true);
        this.go = new Button("GO!");
        this.go.setLayoutY(450);
        var1.getChildren().addAll(var2, var3,go);
        var2.setOnAction((var0) -> {
            System.exit(0);
        });
        this.go.setOnAction((var0) -> {
            this.background.timeLineStopper();
            this.cartoon.beginRace();
            this.var3.setDisable(false);
        });
        this.var3.setOnAction((var0) -> {
            this.background.restartStopWatch();
            this.cartoon = new Cartoon(this.midPane, this.racePane);
            this.background.bringStartLight();
            this.background.bringStartLight2();
            this.background.bringStartLight3();
            this.background.bringStartLight4();
            this.background.bringStartLight5();
            this.background.pushStartLight();
            this.background.defaultLabel();
            this.background.startStopwatch();
            this.var3.setDisable(true);
        });
        var1.setFocusTraversable(false);
        var2.setFocusTraversable(false);
        var3.setFocusTraversable(false);
        go.setFocusTraversable(false);
    }

}