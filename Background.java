package cartoon;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

import static javafx.scene.paint.Color.*;
import static jdk.nashorn.internal.parser.TokenType.CASE;

public class Background{
    private Rectangle rect;
    private Rectangle rect1;
    private Rectangle rect2;
    private Rectangle rect3;
    private Rectangle rect4;
    private Rectangle rect5;
    private Rectangle rect6;
    private Rectangle rect7;
    private Rectangle rect8;
    private Rectangle rect9;
    private Rectangle rect10;
    private Rectangle rect11;
    private Rectangle rect12;
    private Rectangle rect13;
    private Rectangle rect14;
    private Rectangle rect15;
    private Rectangle rect16;
    private Rectangle rect17;
    private Rectangle rect18;
    private Rectangle rect19;
    private Rectangle rect20;
    private Rectangle rect21;
    private Rectangle rect22;
    private Rectangle rect23;
    private Rectangle rect24;
    private Rectangle rect25;
    private Rectangle rect26;
    private Rectangle rect27;







    private Circle red;
    private Circle red2;
    private Circle red3;
    private Circle red4;
    private Circle red5;
    private Circle red6;
    private Circle red7;
    private Circle red8;
    private Circle red9;
    private Circle red10;
    private Circle circ;
    private Circle circ1;
    private Circle circ2;
    private Circle circ3;
    private Circle circ4;
    private Circle circ5;
    private Circle circ6;
    private Circle circ7;
    private Circle circ8;
    private Circle circ9;
    private Circle circ10;
    private Circle circ11;
    private Circle circ12;
    private Circle circ13;
    private Circle circ14;
    private Circle circ15;
    private Circle circ16;
    private Circle circ17;
    private Circle circ18;
    private Circle circ19;
    private Circle circ20;
    private Circle circ21;
    private Circle circ22;
    private Circle circ23;
    private Circle circ24;
    private Circle circ25;
    private Circle circ26;
    private Circle circ27;
    private Circle circ28;
    private Circle circ29;
    private Circle circ30;
    private Circle circ31;
    private Circle circ32;
    private Circle circ33;
    private Circle circ34;
    private Circle circ35;
    private Circle circ36;
    private Circle circ37;
    private Circle circ38;
    private Circle circ39;
    private BorderPane midPane;
    private RaceCar racecar;
    private Button var3;
    private Timeline timeline;
    private Timeline startLightTimeLine;
    private Timeline startLightTimeLine2;
    private int now;
    private int randInt;
    private double stopInt;
    private Pane labelPane;
    private Label label;
    private KeyFrame frame;
    public Background(BorderPane midPane) {
        this.midPane = midPane;
        this.labelPane = new VBox();
        this.timeline = new Timeline();
        this.startLightTimeLine = new Timeline();
        this.startLightTimeLine2 = new Timeline();
        this.setUpLights();
        this.now = 0;
        this.label = new Label();
        this.labelPane.getChildren().add(this.label);
        this.midPane.setRight(this.labelPane);
        this.randInt = (int) (Math.random() * 5 + 6);
        this.stopInt = 0.1;
        this.defaultLabel();
    }
    // creates the racetrack, the steel bars attaching to the lights, and the lights themselves
    private void setUpLights() {
        //racetrack
        this.rect = new RectPart(0, 778, 1350, 70, Color.DARKGREY, midPane, 0).getRect();
        this.rect1 = new RectPart(665, 778, 5, 70, BLACK, midPane, 0).getRect();
        //steel bars
        this.rect2 = new RectPart(0, 310, 1350, 10, GRAY, midPane, 0).getRect();
        this.rect3 = new RectPart(0, 330, 1350, 10, GRAY, midPane, 0).getRect();
        //first light
        this.rect4 = new RectPart(545, 300, 41, 170, BLACK, midPane, 0).getRect();
        this.circ = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ1 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ2 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ3 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ4 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ5 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ6 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ7 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        //second light
        this.rect5 = new RectPart(595, 300, 41, 170, BLACK, midPane, 0).getRect();
        this.circ8 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ9 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ10 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ11 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_BORDER_RAD,
                GRAY).getCirc();
        this.circ12 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ13 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ14 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ15 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        //third light
        this.rect6 = new RectPart(645, 300, 41, 170, BLACK, midPane, 0).getRect();
        this.circ16 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ17 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ18 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ19 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ20 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ21 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ22 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ23 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        //fourth light
        this.rect7 = new RectPart(695, 300, 41, 170, BLACK, midPane, 0).getRect();
        this.circ24 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ25 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ26 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ27 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ28 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ29 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ30 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ31 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        //fifth light
        this.rect8 = new RectPart(745, 300, 41, 170, BLACK, midPane, 0).getRect();
        this.circ32 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ33 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ34 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ35 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_BORDER_RAD, GRAY)
                .getCirc();
        this.circ36 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_1_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ37 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_2_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ38 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        this.circ39 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, BLACK)
                .getCirc();
        //flashing lights
        this.red = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red2 = new CircPart(Constants.LIGHT_COLUMN_1_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red3 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red4 = new CircPart(Constants.LIGHT_COLUMN_2_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red5 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red6 = new CircPart(Constants.LIGHT_COLUMN_3_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red7 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red8 = new CircPart(Constants.LIGHT_COLUMN_4_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red9 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_3_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        this.red10 = new CircPart(Constants.LIGHT_COLUMN_5_X, Constants.LIGHT_ROW_4_Y, Constants.LIGHT_RAD, Color.RED)
                .getCirc();
        //stands
        this.rect9 = new RectPart(0,390,Constants.FULL_WIDTH,150,GRAY,midPane,0).getRect();
        this.rect10 = new RectPart(0,540,Constants.FULL_WIDTH,250,LIGHTGRAY,midPane,0)
                .getRect();
        this.rect11 = new RectPart(0,540,Constants.FULL_WIDTH,20,BLACK,midPane,0).getRect();
        this.rect12 = new RectPart(0,700,Constants.FULL_WIDTH,10,BLACK,midPane,0).getRect();
        this.rect13 = new RectPart(0,700,10,80,BLACK,midPane,0).getRect();
        this.rect14 = new RectPart(1340,700,10,80,BLACK,midPane,0).getRect();
        //f1 sign
        this.rect15 = new RectPart(250,420,105,90,RED,midPane,0).getRect();
        this.rect16 = new RectPart(260,430,10,70,WHITE,midPane,0).getRect();
        this.rect17 = new RectPart(260,430,40,10,WHITE,midPane,0).getRect();
        this.rect18 = new RectPart(260,460,40,10,WHITE,midPane,0).getRect();
        this.rect19 = new RectPart(330,430,10,70,WHITE,midPane,0).getRect();
        this.rect20 = new RectPart(315,430,15,10,WHITE,midPane,0).getRect();
        //f1 sign 2
        this.rect21 = new RectPart(975,420,105,90,RED,midPane,0).getRect();
        this.rect22 = new RectPart(985,430,10,70,WHITE,midPane,0).getRect();
        this.rect23 = new RectPart(985,430,40,10,WHITE,midPane,0).getRect();
        this.rect24 = new RectPart(985,460,40,10,WHITE,midPane,0).getRect();
        this.rect25 = new RectPart(1055,430,10,70,WHITE,midPane,0).getRect();
        this.rect26 = new RectPart(1040,430,15,10,WHITE,midPane,0).getRect();
        this.midPane.getChildren().addAll(this.rect9,this.rect10,this.rect11,this.rect12,this.rect13,this.rect14,
                this.rect15,this.rect16,this.rect17,this.rect18,this.rect19,this.rect20,this.rect21,this.rect22,this.rect23,
                this.rect24,this.rect25,this.rect26,this.rect,this.rect1,this.rect2,this.rect3,this.rect4,this.rect5,this.rect6,this.rect7,this.rect8,
                this.circ,this.circ1,this.circ2,this.circ3,this.circ4,this.circ5,this.circ6,this.circ7,this.circ8,
                this.circ9,this.circ10,this.circ11,this.circ12,this.circ13,this.circ14,this.circ15,this.circ16,
                this.circ17,this.circ18,this.circ19,this.circ20,this.circ21,this.circ22,this.circ23,this.circ24,
                this.circ25,this.circ26,this.circ27,this.circ28,this.circ29,this.circ30,this.circ31,this.circ32,
                this.circ33,this.circ34,this.circ35,this.circ36,this.circ37,this.circ38,this.circ39);
    }
    //brings into existence all the columns of start lights
    public void bringStartLight(int num) {
        switch (num){
            case 1:
                frame = new KeyFrame(Duration.seconds(num), (ActionEvent e) -> this.midPane.getChildren().addAll(this.red,this.red2));
                break;
            case 2:
                frame= new KeyFrame(Duration.seconds(num), (ActionEvent e) -> this.midPane.getChildren().addAll(this.red3,this.red4));
                break;
            case 3:
                frame = new KeyFrame(Duration.seconds(num), (ActionEvent e) -> this.midPane.getChildren().addAll(this.red5,this.red6));
                break;
            case 4:
                frame = new KeyFrame(Duration.seconds(num), (ActionEvent e) -> this.midPane.getChildren().addAll(this.red7,this.red8));
                break;
            case 5:
                frame= new KeyFrame(Duration.seconds(num), (ActionEvent e) ->  this.midPane.getChildren().addAll(this.red9,this.red10));
                break;
        }
        this.startLightTimeLine = new Timeline(frame);
        this.startLightTimeLine.setCycleCount(1);
        this.startLightTimeLine.play();
    }
    //makes the start lights disappear
    public void pushStartLight() {
        KeyFrame gf = new KeyFrame(Duration.seconds(randInt), (ActionEvent e) -> this.destroyStartLight());
        this.startLightTimeLine = new Timeline(gf);
        this.startLightTimeLine.setCycleCount(1);
        this.startLightTimeLine.play();
    }
    //makes the label count up
    void setUpTimeLine() {
        KeyFrame kf = new KeyFrame(Duration.seconds(.001),(ActionEvent e) -> this.updateLabel());
        this.timeline = new Timeline(kf);
        this.timeline.setCycleCount(Animation.INDEFINITE);
        this.timeline.play();

    }
    //gives other classes the ability to stop the above timeline
    void timeLineStopper() {
       this.timeline.stop();
    }
    /*
    actually starts the stopwatch, allowing for the appropriate delay in order to make it start when the lights
    turn off
     */
    public void startStopwatch() {
        KeyFrame fg = new KeyFrame(Duration.seconds(randInt), e -> this.setUpTimeLine());
        this.startLightTimeLine = new Timeline(fg);
        this.startLightTimeLine.setCycleCount(1);
        this.startLightTimeLine.play();
    }
    //sets the default label when timer is not running
    void defaultLabel() {
        this.label.setText("Press the 'GO!' button when the lights turn off to start! Press SPACE" +
                " to randomly change teams!");
        this.label.setPrefSize(1075,50);
        this.label.setFont(new Font("Serif", 20));
    }
    //creates the label that counts up
    void updateLabel() {
        this.label.setText("Your reaction time is " + this.now + " milliseconds!");
        this.label.setPrefSize(840, 50);
        this.label.setFont(new Font("Serif", 20));
        this.now += 1;
    }
    //sets the stopwatch back to 0
    void restartStopWatch() {
        this.now = 0;
    }
    //integral part of pushStartLight() method, makes them all disappear
    public void destroyStartLight() {
        this.midPane.getChildren().removeAll(this.red,this.red2,this.red3,this.red4,this.red5,this.red6,
                this.red7,this.red8,this.red9,this.red10);
    }
}