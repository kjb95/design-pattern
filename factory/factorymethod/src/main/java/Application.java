import model.pizza.Pizza;
import model.pizzastore.AmericanPizzaStore;
import model.pizzastore.KoreaPizzaStore;
import model.pizzastore.PizzaStore;

public class Application {

    public static void main(String[] args) {
        PizzaStore americanPizzaStore = new AmericanPizzaStore();
        PizzaStore koreanPizzaStore = new KoreaPizzaStore();
        Pizza americanCheesePizza = americanPizzaStore.orderPizza("cheese");
        Pizza koreanPeperoniPizza = koreanPizzaStore.orderPizza("pepperoni");
    }
}
