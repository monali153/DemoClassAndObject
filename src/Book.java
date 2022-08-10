public class Book {

    String title;
    int yearOfPublishing;
    long isbnNumber;
    String authorName;


    public static void main(String[] args) {

        Book book = new Book();

        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearOfPublishing = " + book.yearOfPublishing);
        System.out.println("book.isbnNumber = " + book.isbnNumber);

        book.title = "Complete Reference 12th Edition";
        book.authorName = "Herbert Schildth";
        book.yearOfPublishing = 2021;
        book.isbnNumber = 1234567890123L;

        System.out.println("book.title = " + book.title);
        System.out.println("book.authorName = " + book.authorName);
        System.out.println("book.yearOfPublishing = " + book.yearOfPublishing);
        System.out.println("book.isbnNumber = " + book.isbnNumber);

    }
}
