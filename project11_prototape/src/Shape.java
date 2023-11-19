public abstract class Shape implements Cloneable{
    protected String type;

    public abstract void draw();

    public String getType() {
        return type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape clone = null;
        clone = (Shape) super.clone();
        return clone;
    }
}
