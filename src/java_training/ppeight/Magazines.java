package java_training.ppeight;

public class Magazines extends ReadingMaterial{
    private String category;

    public Magazines(String title, String category, int pages){
        super(title, pages);
        this.category = category;
    }

    public void readMagazine(){
        System.out.println("Reading magazine: " + super.getTitle() + " in category " + category);
    }
}
