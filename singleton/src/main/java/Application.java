import model.Singleton;

public class Application {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

        instance.hello();
    }
}
