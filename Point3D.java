package season_4.Circle_Cylinder.Point2d_Point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){};
    public Point3D(float z, float x, float y){
        super(x,y);
        this.z = z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setXYZ(float z,float x, float y){
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYZ(){
        float [] array = {this.z, super.getX(), super.getY()};
        return array;
    }

    @Override
    public String toString(){
        return "z=" +this.getZ()
                +super.toString();
    }
}
