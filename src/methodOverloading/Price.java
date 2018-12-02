package methodOverloading;

public class Price {
    public static int priceOfApple ;
    public static int priceOfBanana ;
    public static int priceOfCherry ;
    public static int total;

    // this is about method overloading

    public static int getPriceOfFruit(int priceOfApple){
        return priceOfApple;
    }
    public static int getPriceOfFruit(int priceOfApple, int priceOfBanana){
        return total = priceOfApple + priceOfBanana;
    }
    public static int getPriceOfFruit(int priceOfApple,int priceOfBanana, int priceOfCherry){
        return total = priceOfApple + priceOfBanana + priceOfCherry;
    }

}
