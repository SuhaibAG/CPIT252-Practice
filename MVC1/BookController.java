package MVC1;

public class BookController {
    private Bookm model;
    private BookView view;

    public BookController(Bookm model, BookView view){
        this.model = model;
        this.view = view;
    }

    public String getBookTitle() {
        return model.getTitle();
    }

    public void setBookTitle(String model) {
        this.model.setTitle(model);
    }
    public double getBookPrice() {
        return model.getPrice();
    }

    public void setBookPrice(double model) {
        this.model.setPrice(model);
    }
    public String getBookAuthor() {
        return model.getAuthor();
    }

    public void setBookAuthor(String model) {
        this.model.setAuthor(model);
    }

    public void updateView(){
        view.printBookDetails(model.getTitle(), model.getAuthor(), model.getPrice());
    }
}
