/*
Author:Mariusz Krzyżopolski
Summary: skalowanie koła
*/
public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(int percent) {
        super.radius=(super.radius*percent)/100+super.radius;
    }
}