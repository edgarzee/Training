package java_training.prep;

public class ObjectClone implements Cloneable{

    private int value;

    public ObjectClone(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
