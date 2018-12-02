package methodOverloading;

public class TestPrice {
    public static void main(String[] args) {

        Price.getPriceOfFruit(5);
        Price.getPriceOfFruit(5,6);
        Price.getPriceOfFruit(5,6,8);
        System.out.println(Price.getPriceOfFruit(5));
        System.out.println(Price.getPriceOfFruit(5,6));
        System.out.println(Price.getPriceOfFruit(5,6,8));
    }
}
