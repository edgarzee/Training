package java_training.ppeight;

public class Book {
    protected int pages = 1500;

    //------------------------------------------------------------------------------
    //Pages mutator.
    //------------------------------------------------------------------------------

    public void setPages (int pages){
        this.pages = pages;
    }

    //------------------------------------------------------------------------------
    //Pages accessor.
    //------------------------------------------------------------------------------

    public int getPages(){
        return pages;
    }
}
