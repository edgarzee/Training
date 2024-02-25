package java_training.ppeight;

public class ReadingMaterial {
    protected String title;
    protected int pages;

    public ReadingMaterial(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    public String getTitle(){
        return title;
    }

    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
    }
}
