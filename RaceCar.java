package cartoon;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

import java.util.Random;

import static javafx.scene.paint.Color.*;

public class RaceCar extends Rectangle {
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
    private Ellipse ell;
    private Ellipse ell1;
    private Circle circ;
    private Circle circ1;
    private Circle circ2;
    private Circle circ3;
    private Circle circ4;
    private Circle circ5;
    private Circle circ6;
    private Pane racePane;
    public RaceCar(Pane racePane){
        this.racePane = racePane;
        this.createRaceCar();
    }
    /*
    creates a new race car with Ferrari colors, decided not to opt for constants here as there were
    many numbers
     */
    private void createRaceCar() {
        this.rect = new RectPart(-33,720,30,45,Color.BLACK,racePane,45).getRect();
        this.rect1 = new RectPart(15,755, 79,15,Color.BLACK,racePane, 0).getRect();
        this.rect2 = new RectPart(7,740,113,20, RED,racePane, 0).getRect();
        this.rect3 = new RectPart(-15,725,38,45, RED,racePane,0).getRect();
        this.rect4 = new RectPart(-15,740,38,30,Color.BLACK,racePane,0).getRect();
        this.rect5 = new RectPart(-42,705,8,59, RED,racePane,0).getRect();
        this.rect6 = new RectPart(-54,705,20,10, RED,racePane,0).getRect();
        this.rect7 = new RectPart(116,747,52,18, RED,racePane,15).getRect();
        this.rect8= new RectPart(-34,740,38,30, RED,racePane,0).getRect();
        this.ell = new ElliPart(40,757,46,16,Color.BLACK,racePane,355).getElli();
        this.ell1 = new ElliPart(40,757,45,15, RED,racePane,355).getElli();
        this.circ = new CircPart(40,757,12,Color.BLACK).getCirc();
        this.circ1 = new CircPart(40,757,7,Color.WHITE).getCirc();
        this.circ2 = new CircPart(110,765,13,Color.BLACK).getCirc();
        this.circ3 = new CircPart(110,765,5,Color.GRAY).getCirc();
        this.circ4 = new CircPart(-38,761,17,Color.BLACK).getCirc();
        this.circ5 = new CircPart(-38,761,8,Color.GRAY).getCirc();
        this.circ6 = new CircPart(169,763,9, RED).getCirc();
        this.rect9 = new RectPart(161,766,38,6, RED,racePane,0).getRect();
        this.rect10 = new RectPart(161,766,38,3,Color.BLACK,racePane,0).getRect();
        this.racePane.getChildren().addAll(this.rect, this.rect1,this.rect2,this.rect3,this.rect4,this.rect5,
                this.rect6,this.rect7,this.rect8,this.ell,this.ell1,this.circ,this.circ1,
                this.circ2,this.circ3,this.circ4,this.circ5,this.circ6,this.rect9,this.rect10);
    }
    //switch statement method that randomly selects a new team to create
    void changeTeam() {
        Random carChoose = new Random();
        int rand;
        rand = carChoose.nextInt(6);
        switch(rand) {
            //mercedes
            case 0:
                this.ell1.setFill(DARKCYAN);
                this.circ6.setFill(GRAY);
                this.rect2.setFill(GRAY);
                this.rect3.setFill(DARKCYAN);
                this.rect5.setFill(GRAY);
                this.rect6.setFill(GRAY);
                this.rect7.setFill(GRAY);
                this.rect8.setFill(GRAY);
                this.rect9.setFill(GRAY);
                break;
            //mclaren
            case 1:
                this.ell1.setFill(DARKBLUE);
                this.circ6.setFill(DARKORANGE);
                this.rect2.setFill(DARKORANGE);
                this.rect3.setFill(DARKBLUE);
                this.rect5.setFill(DARKORANGE);
                this.rect6.setFill(DARKORANGE);
                this.rect7.setFill(DARKORANGE);
                this.rect8.setFill(DARKORANGE);
                this.rect9.setFill(DARKORANGE);
                break;
            //haas
            case 2:
                this.ell1.setFill(WHITE);
                this.circ1.setFill(RED);
                this.circ6.setFill(WHITE);
                this.rect2.setFill(WHITE);
                this.rect3.setFill(RED);
                this.rect5.setFill(WHITE);
                this.rect6.setFill(WHITE);
                this.rect7.setFill(WHITE);
                this.rect8.setFill(WHITE);
                this.rect9.setFill(BLUE);
                break;
            //aston martin
            case 3:
                this.ell1.setFill(DARKCYAN);
                this.circ1.setFill(WHITE);
                this.circ6.setFill(DARKCYAN);
                this.rect2.setFill(DARKCYAN);
                this.rect3.setFill(BLACK);
                this.rect5.setFill(DARKCYAN);
                this.rect6.setFill(DARKCYAN);
                this.rect7.setFill(DARKCYAN);
                this.rect8.setFill(DARKCYAN);
                this.rect9.setFill(BLACK);
                break;
            //red bull
            case 4:
                this.ell1.setFill(DARKBLUE);
                this.circ1.setFill(WHITE);
                this.circ6.setFill(DARKBLUE);
                this.rect2.setFill(DARKBLUE);
                this.rect3.setFill(RED);
                this.rect5.setFill(DARKBLUE);
                this.rect6.setFill(DARKBLUE);
                this.rect7.setFill(DARKBLUE);
                this.rect8.setFill(RED);
                this.rect9.setFill(BLACK);
                break;
            //ferrari
            case 5:
                this.ell1.setFill(RED);
                this.circ6.setFill(RED);
                this.rect2.setFill(RED);
                this.rect3.setFill(RED);
                this.rect5.setFill(RED);
                this.rect6.setFill(RED);
                this.rect7.setFill(RED);
                this.rect8.setFill(RED);
                this.rect9.setFill(RED);
                break;
            default:
                break;
        }
    }
    //moves the car
    void updateRace() {
        this.rect.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect1.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect2.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect3.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect4.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect5.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect6.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect7.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect8.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect9.setTranslateX(this.rect.getTranslateX() + 10);
        this.rect10.setTranslateX(this.rect.getTranslateX() + 10);
        this.circ.setTranslateX(this.rect.getTranslateX() + 10);
        this.circ1.setTranslateX(this.rect.getTranslateX() + 10);
        this.circ2.setTranslateX(this.rect.getTranslateX() + 10);
        this.circ3.setTranslateX(this.rect.getTranslateX() + 10);
        this.circ4.setTranslateX(this.rect.getTranslateX() + 10);
        this.circ5.setTranslateX(this.rect.getTranslateX() + 10);
        this.circ6.setTranslateX(this.rect.getTranslateX() + 10);
        this.ell.setTranslateX(this.rect.getTranslateX() + 10);
        this.ell1.setTranslateX(this.rect.getTranslateX() + 10);
    }
}





