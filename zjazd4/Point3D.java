/*
Author: Mariusz Krzyżopolski
Summary:zadanie 21 klasa Point3D
*/
public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
      z = 0.0f;
    }
    public float getZ() {
      return z;
    }
    public void setZ(float z) {
      this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
      super.setXY(x,y);
      this.z = z;
    }
    public float[] getXYZ() {
        float[] result = {super.getX(), super.getY(), z};
        return result;
    }
    public String toString() {
        return "("+super.getX() +"," + super.getY() + "," + z+")";
    }
}