package methodOverloading;

public class Add {

    int a ;
    int b;
    int c;
    int d;
// method overloading it means same method different parameters .
    public void addValue(int a , int b){// we can not use duplicate method

        System.out.println("same method , 2 parameters" );
    }
    public void addValue(int a , int b, int c){

        System.out.println("same method , 3 parameters");
    }
    public void addValue(int a , int b ,int c , int d){

        System.out.println("same method , 4 parameters");
    }
}
