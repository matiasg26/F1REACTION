package cartoon;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircPart extends Circle {
    private Circle circ;
    public CircPart(double xLoc, double yLoc, double rad,
                    Color color) {
        this.circ = new Circle(xLoc,yLoc,rad);
        this.circ.setFill(color);
    }
    //makes sure the circle gets created
    public Circle getCirc() {
        return this.circ;
    }
}
