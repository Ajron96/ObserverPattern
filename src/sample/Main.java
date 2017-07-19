package sample;

public class Main {

    public static void main(String[] args) {
        Powerball powerball = new Powerball();

        TV tv = new TV(powerball);
        Internet internet = new Internet(powerball);

        System.out.println("FIRST RANDOM:");
        powerball.random();
        tv.inform();
        internet.inform();

        powerball.unregisterObserver(tv);   //unregistered tv, obj tv won't longer get update about results

        System.out.println("SECOND RANDOM:");
        powerball.random();
        tv.inform();    //tv still has old random data
        internet.inform();


    }
}
