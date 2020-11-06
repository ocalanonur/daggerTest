package commmm;

public class Main {

    public static void main(String[] args) {
        MyCatDogHause myCatDogHause = DaggerMyCatDogHause.builder().build();
        Hause myHause = myCatDogHause.getMyHause();

        myHause.animal1.move();
        myHause.animal2.move();

    }
}
