public class Book {
    
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true; 
    }

   
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book \"" + title + "\" has been returned.");
        } else {
            System.out.println("This book wasn't borrowed.");
        }
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("OOPs", "Avay Lama", 1978);

        System.out.println("first Book Info:");
        book1.printBookDetails();

        System.out.println("Attempting to borrow...");
        book1.borrowBook();

        System.out.println("Attempting to borrow again...");
        book1.borrowBook();


        System.out.println("Returning the book...");
        book1.returnBook();


        System.out.println("Final Book Info:");
        book1.printBookDetails();
    }
}

