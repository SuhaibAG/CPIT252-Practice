package MVC1;

public class Mavenprojectmcvdemo {
    public static void main(String[] args) {
        Bookm book = new Bookm("Effective java", "Joshua Bloch", 39.99);
        BookView view = new BookView();
        BookController controller = new BookController(book, view);

        controller.updateView();


        controller.setBookTitle("Clean Code");
        controller.setBookAuthor("Robert C. Martin");
        controller.setBookPrice(34.99);

        controller.updateView();

    }
}
