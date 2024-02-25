package java_training.ppeight;

public class ReadingMaterialDriver {
    public static void main(String[] args){
        Books book = new Books("The book", "The Author", 1000);
        book.displayDetails();
        book.readBook();

        Novels novel = new Novels("Cool Name", "Cool Author", "The Protagonist", 500);
        novel.displayDetails();
        novel.readNovel();

        Magazines magazine = new Magazines("The Magazine", "Science", 200);
        magazine.displayDetails();
        magazine.readMagazine();
    }
}
