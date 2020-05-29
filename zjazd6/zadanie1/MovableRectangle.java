/*
Author:Mariusz Krzyżopolski
Summary: klasa implementujaca poruszanie sie do prostokatu
*/
public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUP() {
        this.topLeft.y -= topLeft.ySpeed;
        this.bottomRight.y -= bottomRight.ySpeed;
    }

    public void moveDown() {
        this.topLeft.y += topLeft.ySpeed;
        this.bottomRight.y += bottomRight.ySpeed;
    }

    public void moveLeft() {
        this.topLeft.x -= topLeft.xSpeed;
        this.bottomRight.x -= bottomRight.xSpeed;
    }

    public void moveRight() {
        this.topLeft.x += topLeft.xSpeed;
        this.bottomRight.x += bottomRight.xSpeed;
    }

    public String toString() {
        return "MovableRectangle[" + "topLeft=(x=" + topLeft.x +", y=" + topLeft.y + "), bottomRight=(x=" + bottomRight.x +", y=" + bottomRight.y + ")]";
    }
}