import model.English;
import model.Korean;
import model.Language;

public class Application {

    public static void main(String[] args) {
        Language korean = new Korean();
        Language english = new English();

        korean.introduce();
        english.introduce();
    }
}
