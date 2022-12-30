package cartoon;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class RectPart extends Rectangle {
    private Rectangle rect1;
    public RectPart(double xLoc, double yLoc, double width, double height, Color color, Pane myPane, double rotate) {
        this.rect1 = new Rectangle(xLoc,yLoc,width,height);
        this.rect1.setFill(color);
        this.rect1.setRotate(rotate);
    }
    //makes sure the rectangle gets created
    public Rectangle getRect() {
        return this.rect1;
    }
}
