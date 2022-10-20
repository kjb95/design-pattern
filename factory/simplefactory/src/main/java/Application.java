import model.PizzaStore;
import model.SimplePizzaFactory;

public class Application {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
    }
}
