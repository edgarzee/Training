package java_training.ppeight;

public class Book2 {
    protected int pages;

    //------------------------------------------------------------------------------
    //Constructor: Sets up the book with the specified number of pages.
    //------------------------------------------------------------------------------

    public Book2 (int pages){
        this.pages = pages;
    }

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
