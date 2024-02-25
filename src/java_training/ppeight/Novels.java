package java_training.ppeight;

public class Novels extends Books {
    private String protagonist;

    public Novels (String title, String author, String protagonist, int pages){
        super(title, author, pages);
        this.protagonist = protagonist;
    }
    public void readNovel(){
        System.out.println("Reading novel: " + super.getTitle() + " with protagonist " + protagonist);
    }
}
