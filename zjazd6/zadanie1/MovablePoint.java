/*
Author:Mariusz Krzyżopolski
Summary: klasa implementujaca poruszanie sie do punktu
*/
public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUP() {
        this.y -= ySpeed;
    }

    public void moveDown() {
        this.y += ySpeed;
    }

    public void moveLeft() {
        this.x -= xSpeed;
    }

    public void moveRight() {
        this.x += xSpeed;
    }

    public String toString() {
        return "MovablePoint{" + "x=" + x + " y=" + y + " xSpeed=" + xSpeed + " ySpeed=" + ySpeed + '}';
    }
}