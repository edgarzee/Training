package java_training.ppeight;

public class Books extends ReadingMaterial {
    protected String author;

    public Books(String title, String author, int pages){
        super(title, pages);
        this.author = author;
    }

    public void readBook(){
        System.out.println("Reading book: " + super.getTitle() + " by " + author);
    }
}
