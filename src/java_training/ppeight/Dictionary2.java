package java_training.ppeight;

public class Dictionary2 extends Book2 {
    private int definitions;

    //------------------------------------------------------------------------------
    //Constructor: Sets up the dictionary with the specified number of pages and definitions.
    //------------------------------------------------------------------------------

    public Dictionary2 (int pages, int definitions){
        super (pages);

        this.definitions = definitions;
    }

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
