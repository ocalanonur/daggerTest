package comm;

public class Main {

    public static void main(String[] args) {
        MyHauseFactory myHauseFactory = DaggerMyHauseFactory.builder().build();
        Hause myHause = myHauseFactory.getMyHause();

        myHause.cat.move();
        myHause.dog.move();

    }
}
