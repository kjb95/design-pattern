import java.util.Arrays;
import model.pizza.Pizza;
import model.pizzastore.AmericanPizzaStore;
import model.pizzastore.KoreaPizzaStore;
import model.pizzastore.PizzaStore;
import model2.RestaurantFactory;
import model2.food.Food;

public class Application {

    public static void main(String[] args) {
        PizzaStore americanPizzaStore = new AmericanPizzaStore();
        PizzaStore koreanPizzaStore = new KoreaPizzaStore();
        Pizza americanCheesePizza = americanPizzaStore.orderPizza("cheese");
        Pizza koreanPeperoniPizza = koreanPizzaStore.orderPizza("pepperoni");

        Food gimbap = RestaurantFactory.foodOf(0, Arrays.asList("김", "밥", "햄"));
        Food ramen = RestaurantFactory.foodOf(1, Arrays.asList("면", "스프"));
        gimbap.make();
        ramen.make();
    }
}
