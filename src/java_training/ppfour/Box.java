package java_training.ppfour;

public class Box {
    private int height, width, depth;
    private boolean full;

    public Box (int height, int width, int depth){
        full = false;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public int getDepth(){
        return depth;
    }

    public String toString(){
        if (full == false) {
            return "The box is " + height + " high, " + width + " wide and " + depth + " deep and is not full.";
        } else{
            return "The box is " + height + " high, " + width + " wide and " + depth + " deep and is full.";
        }
    }
}
