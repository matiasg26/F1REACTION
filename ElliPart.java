package cartoon;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class ElliPart extends Ellipse {

    private Ellipse ell1;
    public ElliPart(double xLoc, double yLoc, double radX, double radY,
                    Color color, Pane myPane, double rotate) {
        this.ell1 = new Ellipse(xLoc,yLoc,radX,radY);
        this.ell1.setFill(color);
        this.ell1.setRotate(rotate);
    }
    //makes sure the ellipse gets created
    public Ellipse getElli() {
        return this.ell1;
    }
}
