public class Author {
    private String authorName;
    private String authorSurname;
    private String fullName;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorFullName() {           //Чтобы не вызывать отдельно имя и фамилию, внутри геттера сделано объединение их в одну строку
        this.fullName = Author.this.authorName + " " + Author.this.authorSurname;
        return fullName;
    }

}
