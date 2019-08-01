public class Point3D extends Point2D {
    public float z=0;
    public Point3D(){}

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] XYZ(){
        float[] count=new float[3];
        count[0]=this.x;
        count[1]=this.y;
        count[3]=this.z;
        return count;

    }

    @Override
    public String toString() {
     return "Point 3D: x = " + this.x + ", y = " + this.y + ", z = " + this.z + ", which is subclass of "+super.toString();
    }
}
