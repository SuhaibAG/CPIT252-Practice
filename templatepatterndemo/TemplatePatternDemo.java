package templatepatterndemo;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game=new Chess();
        game.play();
        game=new Soccer();
        game.play();
    }
}
