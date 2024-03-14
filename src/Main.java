public class Main {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("mp3", "Music File",
                "This is an MP3 music file", 100, 10);
        mp3.showInfo();

        Book book = new Book("book", "Harry Potter",
                "This is a book", 100,
                "J.K.Rowling", 500, "novel");
        book.showInfo();

    }
}