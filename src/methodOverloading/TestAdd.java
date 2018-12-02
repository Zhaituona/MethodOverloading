package methodOverloading;

public class TestAdd {
    public static void main(String[] args) {// main method can be overloading
        Add add1 = new Add();

        add1.addValue(2,3);
        add1.addValue(2,3,4);
        add1.addValue(2,3,4,5);

        mainMethodOverloading md = new mainMethodOverloading();
        md.main("main");
        md.main(12,"abd");
        mainMethodOverloading.main(13,"1saca");
        mainMethodOverloading.main("avdc");



        }


    }

