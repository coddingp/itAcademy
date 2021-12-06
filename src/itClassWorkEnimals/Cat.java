package itClassWorkEnimals;

public class Cat extends Cats{
    private String name;
    private String bread;

    public Cat(String sleep, String eat, String sound, double weight, int age, String color, String rest, int claws, double tailLength, int whiskers, String myao, String sharpenClaws, String landOnFeet, String name, String bread) {
        super(sleep, eat, sound, weight, age, color, rest, claws, tailLength, whiskers, myao, sharpenClaws, landOnFeet);
        this.name = name;
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }
}
