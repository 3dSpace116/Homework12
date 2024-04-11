public class Main {
    public static void main(String[] args) {
        Author Ellison = new Author("Harlan", "Ellison");
        Author Bulgakov = new Author("Михаил", "Булгаков");

        Book TheEssentialEllison = new Book("The Essential Ellison", Ellison.getAuthorFullName(), 1987);
        Book SobSerdse = new Book("Собачье сердце", Bulgakov.getAuthorFullName(), 1925);

        SobSerdse.setYearOfPublication(1987);

        System.out.println("Название " + TheEssentialEllison.getBookName() + ", автор " + TheEssentialEllison.getAuthorName() + ", год выпуска " + TheEssentialEllison.getYearOfPublication());
        System.out.println("Название " + SobSerdse.getBookName() + ", автор " + SobSerdse.getAuthorName() + ", год выпуска " + SobSerdse.getYearOfPublication());
    }
}