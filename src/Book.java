public class Book {
    private String bookName;
    private String AuthorName;
    private int yearOfPublication;

    public Book(String bookName, String AuthorName, int yearOfPublication) {
        this.bookName = bookName;
        this.AuthorName = AuthorName;
        this.yearOfPublication = yearOfPublication;

    }


    public String getBookName() {
        return this.bookName;
    }

    public String getAuthorName() {
        return this.AuthorName;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}

