package commm;

public class Main {

    public static void main(String[] args) {
        MyHauseFactory myHauseFactory = DaggerMyHauseFactory.builder().build();
        Hause myHause = myHauseFactory.getMyHause();

        myHause.animal1.move();
        myHause.animal2.move();

    }
}
