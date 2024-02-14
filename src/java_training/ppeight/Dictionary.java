package java_training.ppeight;

public class Dictionary extends Book{
    private int definitions = 52500;

    //------------------------------------------------------------------------------
    //Prints a message using both local and inherited values.
    //------------------------------------------------------------------------------

    public double computeRatio(){
        return definitions / pages;
    }

    //------------------------------------------------------------------------------
    //Definitions mutator.
    //------------------------------------------------------------------------------

    public void setDefinitions (int definitions){
        this.definitions = definitions;
    }

    //------------------------------------------------------------------------------
    //Definitions accessor.
    //------------------------------------------------------------------------------

    public int getDefinitions(){
        return definitions;
    }

}
