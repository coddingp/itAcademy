package polymorphism;

public class Chicken extends Animal implements Eggable{
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void layEggs() {

    }

}
