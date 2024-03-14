public class Book extends Item {

    private String author;
    private int numberOfPages;
    private String genre;

    public Book(String ID, String name, String description, int price, String author, int numberOfPages, String genre) {
        super(ID, name, description, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        System.out.println("Book Item");
    }
}
